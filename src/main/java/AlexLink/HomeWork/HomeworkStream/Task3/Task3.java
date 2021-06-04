package AlexLink.HomeWork.HomeworkStream.Task3;

//Задать массив строк. Используя средства Stream API определить количество
//уникальных значений.

import java.util.Arrays;

public class Task3 {
    static public final String TEXT = "Задать массив строк. Используя средства Stream API определить количество\n" +
            "уникальных значений. Задать массив строк. Используя средства Stream API отсортировать строки в\n" +
            "лексикографическом порядке по возрастанию и убыванию";

    public static void main(String[] args) {
        String[] text = TEXT.split("[.,!?]?\\s+");
        long count = Arrays.stream(text).distinct().count();
        System.out.println("Count words with a unique meaning = " + count);
    }
}
