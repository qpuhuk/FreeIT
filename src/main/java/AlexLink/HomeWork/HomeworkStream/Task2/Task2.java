package AlexLink.HomeWork.HomeworkStream.Task2;

//Задать массив строк. Используя средства Stream API отсортировать строки в
//лексикографическом порядке по возрастанию и убыванию

import java.util.Arrays;
import java.util.Comparator;

public class Task2 {
    static final String TEXT = "Задать массив строк. Используя средства Stream API отсортировать строки в\n" +
            "лексикографическом порядке по возрастанию и убыванию";

    public static void main(String[] args) {
        String[] list = TEXT.split("[.,]?\\s+");
        Arrays.stream(list)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
        System.out.println("******************************************");
        Arrays.stream(list)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
