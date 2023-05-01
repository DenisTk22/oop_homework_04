package seminar_5.models;

import seminar_5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model { // модель для манипуляции со столиком

    private Collection<Table> tables;

    // получение списка всех столиков
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    public int resevationTable(Date reservationDate, int tableNo, String name){
        for (Table table: tables) {
            if(table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();

            }

        }
        return -1;
    }
//разработать в рамках дз:
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        return -1;
    }
}
