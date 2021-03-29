package AlexLink.HomeWork.Arrays;

// 6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//        на экран в строку. Определить и вывести на экран сообщение о том, является ли
//        массив строго возрастающей последовательностью.
//6) Проверить, различны ли все элементы массива.

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
        int count = 0;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println("Элементы массива не различны");
                break;
            } else {
                count++;
                if (count == array.length - 1)
                    System.out.println("Элементы массива различны");
            }
        }
    }
}
