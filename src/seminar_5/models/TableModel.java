package seminar_5.models;

import com.sun.source.util.SourcePositions;
import seminar_5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


public class TableModel implements Model { // модель для манипуляции со столиком

    private Collection<Table> tables; // коллекция столиков
    //private Collection<Reservation> reservations;
    /**
     * Получение списка всех столиков
     * @return столики
     */
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>(); // переменная tables указывает на список столиков

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables; // возвращаем коллекцию столиков
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table: tables) {
            if(table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        //throw new RuntimeException("Некорректный номер столика."); // исключение
        return -1;
    }
//разработать в рамках дз:, воспользоваться методом reservationTable
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        System.out.printf("Старая бронь #",oldReservation);
        for (Table table: tables) {
            for (Reservation reservation : table.getReservations()) {
                //System.out.println(reservation.getId());
                if (reservation.getId() == oldReservation) {
                    table.getReservations().remove(reservation.getId()); // table.getReservations().remove(reservation);
                }
                System.out.println(reservation.getId());
            }
        }

        return reservationTable(reservationDate, tableNo, name);
    }
}
