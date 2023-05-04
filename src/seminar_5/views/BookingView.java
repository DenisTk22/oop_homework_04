package seminar_5.views;

import seminar_5.models.Table;
import seminar_5.presenters.View;
import seminar_5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer; // ссылка на наблюдатель

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    public void setObserver(ViewObserver observer){
        this.observer = observer; // ссылка на наблюдателя
    }

    /**
     * Отобразить список всех стликов
     * @param tables стлик
     */
    public void showTables(Collection<Table> tables){ // передача столиков
        for (Table table: tables){
            System.out.println(table);
        }

    }

    /**
     * Действия клиента (пользователь нажал на кнопку бронирования),
     * бронирование столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);

    }

    /**
     * TODO: Доработать метод в дз.
     * Действие клиента (пользователь нажал на кнопку),
     * изменение бронированя столика
     * @param oldReservation старый номер брони
     * @param reservationDate новая дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
//метод доблжен обратиться к обсерверу, который будет имплементировать этот метод
        // в рамках BookingPresenter
    }

    /**
     * Отобразить результат резервирования столика
     * @param reservationId номер брони
     */
    public void showReservationTableStatus(int reservationId){
        if(reservationId > 0){
            System.out.printf("Столик успешно забронирован.\nНомер брони: #%d\n", reservationId);
        }
        else {
            System.out.println("Ошибка бронирования.\nПовторите попытку позже.");
        }
    }
}
//дз создать и имлементировать метод отмены брони