package seminar_5.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private static int counter;

    private final int no; // номер столика

    private final Collection<Reservation> reservations = new ArrayList<>();

    public int getNo(){
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    {
        no = ++counter;
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }
}
