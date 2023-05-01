package seminar_5;

import seminar_5.models.TableModel;
import seminar_5.presenters.BookingPresenter;
import seminar_5.views.BookingView;

import java.util.Date;

//бронирование столика в ресторане
public class Main {
    public static void main(String[] args) {

        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);

        bookingPresenter.loadTables();
        bookingPresenter.updateView();

        view.reservationTable(new Date(), 2, "Денис");

        view.changeReservationTable(1011,new date(), 3, "Денис");
    }
}

//дз