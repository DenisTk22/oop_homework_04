package seminar_5.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private static int counter; // счетчик для номера столика
    private final int no; // номер столика
    /**
     * Коллекция резервирования столиков
     */
    private final Collection<Reservation> reservations = new ArrayList<>();

    public int getNo(){
        return no;
    }
    public Collection<Reservation> getReservations() {
        return reservations;
    }
// инициализатор для счетчика
    {
        no = ++counter;
    }

    // информация по столику для вывода в консоль
    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }
}
