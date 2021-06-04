package AlexLink.HomeWork.HomeworkStream.Task4;

//Задать массив чисел. Используя средства Stream API вывести на консоль нечетные
//значения

import java.util.Arrays;

public class Task4 {
    static public final int[] NUMBERS = {2, 4221, 5, 44, 3, 2, 5, 6, 7, 11, 23, 222, 14214, 331};

    public static void main(String[] args) {
        Arrays.stream(NUMBERS)
                .filter(value -> value % 2 == 1)
                .sorted()
                .forEach(System.out::println);
    }
}
