package seminar_5.presenters;

import seminar_5.models.Table;

import java.util.Collection;

public interface View {

    /**
     * Отобразить список всех стликов
     * @param tables столики
     */
    void showTables(Collection<Table> tables); // протянули метод showTables()

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer); // протянули метод setObserver()

    /**
     * Отобразить результат резервирования стлика
     * @param reservationId номер брони
     */
    void showReservationTableStatus(int reservationId);
}
