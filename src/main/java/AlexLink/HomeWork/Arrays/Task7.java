package AlexLink.HomeWork.Arrays;

//7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//        какой элемент является в этом массиве максимальным и сообщите индекс его
//        последнего вхождения в массив.
//7) Подсчитать, сколько раз встречается элемент с заданным значением.

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int [] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 16);
        }
        System.out.println(Arrays.toString(array));
        int max = 0;
        for (int k : array) {
            if (max < k)
                max = k;
        }
        int numberLastEnter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max)
                numberLastEnter = i;
        }
        System.out.printf("Максимальный элемент в массиве: %d. Индекс его последнего входа: %d\n", max, numberLastEnter);

        int countCurrentValue = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое нужно проверить: ");
        int check = scanner.nextInt();
        for (int j : array) {
            if (j == check) {
                countCurrentValue++;
            }
        }
        System.out.println((countCurrentValue > 0) ? "Введенное число встречается " + countCurrentValue + " раз(а)" : "Введенное число в массиве отсутствует");
    }
}
