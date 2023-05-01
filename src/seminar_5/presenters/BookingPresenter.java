package seminar_5.presenters;

import seminar_5.models.Table;
import seminar_5.models.TableModel;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver{
private Collection<Table> tables;
    private final Model model;
    private final View view;
    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        this.view.setObserver(this);

    }
    public void loadTables(){
        tables = model.loadTables();
    }

    public void updateView(){
        view.showTables(tables);
    }


    public void updateReservationTableStatus(int reservationId){
        view.showReservationTableStatus(int reservationId);
    }
    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        int reservationId = model.reservationTable(reservationDate, tableNo, name);
    }
}
