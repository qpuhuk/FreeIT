package AlexLink.HomeWork.Arrays;

//9)Пользователь должен указать с клавиатуры положительное число, а
//        программа должна создать массив указанного размера из случайных целых
//        чисел из [0;15] и вывести его на экран в строку. После этого программа должна
//        определить и сообщить пользователю о том, сумма какой половины массива
//        больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
//
//        пользователь введёт неподходящее число, то выдать соответствующее
//        сообщение
//9) Найти наименьший элемент среди элементов с четными индексами массива

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    static int sumLeftHalf;
    static int sumRightHalf;
    static int[] array = new int[0];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (scanner.hasNextInt()) {
            int length = scanner.nextInt();
            array = addArray(length);
            result(array);
            min(array);
        } else {
            System.out.println("Попробуйте еще раз");
        }
    }

    static int[] addArray(int length) {
        if (length > 0) {
            array = new int[length];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 16);
            }
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Вы ввели отрицательное число или 0. Попробуйте ещё раз: ");
        }
        return array;
    }

    static void result(int[] array) {
        if (array.length == 0)
            System.out.println();
        if (array.length == 1)
            System.out.println("Массив состоит из одного числа, невозможно разбить на половины");
        if (array.length > 1) {
            for (int i = 0; i < array.length / 2; i++) {
                sumLeftHalf += array[i];
                sumRightHalf += array[array.length - 1 - i];
            }
            if (sumLeftHalf == sumRightHalf)
                System.out.println("Половины массива равны");
            else
                System.out.println(sumLeftHalf > sumRightHalf ? "Сумма чисел из левой половины массива больше суммы чисел из правой" : "Сумма чисел из правой половины массива больше суммы чисел из левой");
        }
    }

    static void min(int[] array) {
        int min = Integer.MAX_VALUE;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i = i + 2) {
                if (min > array[i])
                    min = array[i];
            }
            System.out.println("Наименьший элемент, среди элементов с четными индексами массива, = " + min);
        }
    }
}

