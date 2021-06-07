package AlexLink.HomeWork.HW_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatUtil {
    public static void main(String[] args) {
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(simpleDateFormat.format(date1));       //Получаем дату и время через util
    }
}
