package seminar_5.presenters;

import seminar_5.models.Table;
import seminar_5.models.TableModel;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver{
private Collection<Table> tables; // переменная tables
    private final Model model; // ссылка на model
    private final View view; // ссылка на view
    public BookingPresenter(Model model, View view){ // BookingPresenter зависит от модели Model и представления View через интерфейсы
        this.model = model;
        this.view = view;
        this.view.setObserver(this); // this указывает на текущей экземпляр объекта
    }

    /**
     * Метод получения списка всех столиков
     */
    public void loadTables(){
        tables = model.loadTables(); // обращение к модели за методом loadTables
    }

    /**
     * Отобразить список всех столиков
     */
    public void updateView(){
        view.showTables(tables); // обращение к представлению (view) за методом showTables()
    }


    public void updateReservationTableStatus(int reservationId){
        view.showReservationTableStatus(reservationId);
    }
    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        int reservationId = model.reservationTable(reservationDate, tableNo, name);
        updateReservationTableStatus(reservationId);
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        int reservationId = model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        updateReservationTableStatus(reservationId);
    }

    // появится метод changeReservationTable, пойдет в модель данных
}
