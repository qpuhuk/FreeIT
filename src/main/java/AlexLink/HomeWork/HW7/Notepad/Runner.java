package AlexLink.HomeWork.HW7.Notepad;

import java.time.LocalDate;

//1. Создать класс Notepad с внутренним классом или классами, с помощью объек-
//тов которого могут храниться несколько записей на одну дату.

public class Runner {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2021, 4, 8);
        Notepad notepad = new Notepad(localDate);
        System.out.println(notepad);
        notepad.setNote1("Передумал, пойду погуляю");
        System.out.println(notepad);
    }
}
