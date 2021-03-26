package AlexLink.HomeWork.Arrays;

// 6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//        на экран в строку. Определить и вывести на экран сообщение о том, является ли
//        массив строго возрастающей последовательностью.

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(array));
        boolean truth = true;
        int lengthArray = 0;
        while (truth) {
            if (array[lengthArray] > array[lengthArray + 1]) {
                System.out.println("Массив не возрастающей последовательности");
                break;
            }
            if (lengthArray == (array.length - 2)) {
                System.out.println("Массив является возрастающим");
                truth = false;
            }
            lengthArray++;
        }
    }
}
