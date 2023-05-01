package seminar_5.views;

import seminar_5.models.Table;
import seminar_5.presenters.View;
import seminar_5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;
    public void setObserver(ViewObserver observer){
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables){
        for (Table table:tables){
            System.out.println(table);
        }

    }

    /**
     * Действия клиента (пользователь нажал на кнопку),
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void reservationTable(Date reservationDate, int tableNo, String name){

    }

    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){

    }
    public void showReservationTableStatus(int reservationId){
        if(reservationId > 0){
            System.out.printf("Столик зарезервирован\nНомер брони%s", reservationId);
        }
        else {
            System.out.println("Не забронирован");
        }
    }
}
//дз создать и имлементировать метод отмены брони