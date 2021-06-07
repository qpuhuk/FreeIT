package AlexLink.HomeWork.HW_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
//Задачи решаются двумя способами, используя библиотеку java.util и java.time
//По введенной дате вывести название месяца.
//По введенной дате вывести возраст
//Вывести дату в формате даты (DD/MM/YYYY) + время hh:mm:ss

public class DateExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/mm/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = scanner.nextLine();
        if (!date.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}$"))
            System.out.println("Ошибка");
        else {
            LocalDate randomDate = LocalDate.parse(date, dateTimeFormatter);
            System.out.println(randomDate.getMonth());  // Получаем название месяца через time

            LocalDate today = LocalDate.now();
            Period period = randomDate.until(today);
            System.out.println("Возраст = " + period.getYears()); // Получаем возраст через time

            DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
            System.out.println("Дата + время = " + LocalDateTime.now().format(dateTimeFormatter1)); //Получаем дату и время через time
        }

        Calendar calendar = GregorianCalendar.getInstance();
        System.out.println(calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH)); // Название месяца через util

        Calendar calendar1 = new GregorianCalendar(2019, Calendar.APRIL, 29);
        int secInYear = 31536000;
        System.out.println(("Возраст = " + (calendar.toInstant().getEpochSecond() -
                calendar1.toInstant().getEpochSecond()) / secInYear)); //Получаем возраст через util
    }
}
