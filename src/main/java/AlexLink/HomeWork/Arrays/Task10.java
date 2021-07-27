package AlexLink.HomeWork.Arrays;

//10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
//        переменную n. Если пользователь ввёл не подходящее число, то программа
//        должна выдать соответствующее сообщение. Создать массив из n случайных
//        целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
//        только из чётных элементов первого массива, если они там есть, и вывести его
//        на экран.
//10) Найти максимальный элемент в массиве и поменять его местами с нулевым
//элементом
import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    static int evenCountInArray = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] array;
        int max = Integer.MIN_VALUE;
        int index = 0;
        System.out.println("Введите число: ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            array = getArray(n);
            getArray2(array);
            if (n > 3) {
                for (int i = 0; i < array.length; i++) {
                    if (max < array[i]) {
                        max = array[i];
                        index = i;
                    }
                }

                int temp = array[0];
                array[0] = array[index];
                array[index] = temp;
                System.out.println(Arrays.toString(array));
            }
        } else {
            System.out.println("Вы ввели неверное значение, попробуйте еще раз.");
        }
    }

    public static int[] getArray(int n) {
        int[] array = new int[0];
        if (n > 3) {
            array = new int[n];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * n);
                if (array[i] % 2 == 0)
                    evenCountInArray++;
            }
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Введите число больше 3");
        }
        return array;
    }

    public static void getArray2(int[] array) {
        int[] array2;
        if (array.length > 0) {
            if (evenCountInArray > 0) {
                array2 = new int[evenCountInArray];
                for (int i = 0, x = 0; x < evenCountInArray; i++) {
                    if (array[i] % 2 == 0) {
                        array2[x] = array[i];
                        x++;
                    }
                }
                System.out.println(Arrays.toString(array2));
            } else {
                System.out.println("Четных чисел в первом массиве нет");
            }
        }
    }
}
