package seminar_5.presenters;

import java.util.Date;

public interface ViewObserver { // наблюдатель за представлением

    void onReservationTable(Date reservationDate, int tableNo, String name);
    void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
