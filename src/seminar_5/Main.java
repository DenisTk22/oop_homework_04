package seminar_5;

import seminar_5.models.TableModel;
import seminar_5.presenters.BookingPresenter;
import seminar_5.views.BookingView;

import java.util.Date;

//бронирование столика в ресторане
public class Main {

    /**
     *Запустить метод changeReservationTable
     * @param args
     */
    public static void main(String[] args) {

        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);

        bookingPresenter.loadTables(); // обращение к презентору загрузить все столики
        bookingPresenter.updateView(); // визуализация столиков

        // бронирование столика
        view.reservationTable(new Date(), 2, "Денис");

        // изменение бронирования столика
        //view.changeReservationTable(1011,new date(), 3, "Денис"); // 3 - новый номер столика
    }
}

//дз