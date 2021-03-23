package AlexLink.HomeWork.HW1;

/*Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
по аналогии с примером выше.*/

public class Task3 {
    public static void main(String[] args) {
        final int QUANTITY_SEC = 4500;

        int quantitySec = QUANTITY_SEC % 60;
        int quantityMinInSec = (QUANTITY_SEC - quantitySec) / 60;
        int quantityMin = quantityMinInSec % 60;
        int quantityHoursOfSec = (quantityMinInSec - quantityMin) / 60;
        int quantityHours = quantityHoursOfSec % 24;
        int quantityDaysOfSec = (quantityHoursOfSec - quantityHours) / 24;
        int quantityDays = quantityDaysOfSec % 7;
        int quantityWeeks = (quantityDaysOfSec - quantityDays) / 7;

        System.out.printf("%d минут %d секунд\n", quantityMin, quantitySec);
        System.out.printf("%d часов %d минут %d секунд\n", quantityHours, quantityMin , quantitySec);
        System.out.printf("%d дней %d часов %d минут %d секунд\n", quantityDays, quantityHours, quantityMin , quantitySec);
        System.out.printf("%d недель %d дней %d часов %d минут %d секунд\n",quantityWeeks, quantityDays, quantityHours, quantityMin , quantitySec);



    }
}