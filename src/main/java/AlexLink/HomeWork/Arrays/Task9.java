package AlexLink.HomeWork.Arrays;

//9)Пользователь должен указать с клавиатуры положительное число, а
//        программа должна создать массив указанного размера из случайных целых
//        чисел из [0;15] и вывести его на экран в строку. После этого программа должна
//        определить и сообщить пользователю о том, сумма какой половины массива
//        больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
//
//        пользователь введёт неподходящее число, то выдать соответствующее
//        сообщение

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        while (true) {
            if (scanner.hasNextInt()) {
                int length = scanner.nextInt();
                if (length > 0) {
                    array = new int[length];
                    for (int i = 0; i < array.length; i++) {
                        array[i] = (int) (Math.random() * 16);
                    }
                    System.out.println(Arrays.toString(array));
                    int sumLeftHalf = 0;
                    int sumRightHalf = 0;
                    if (array.length % 2 == 0) {
                        for (int i = 0; i < array.length / 2; i++) {
                            sumLeftHalf += array[i];
                            sumRightHalf += array[array.length - 1 - i];
                        }
                        System.out.println(sumLeftHalf > sumRightHalf ? "Сумма чисел из левой половины массива больше суммы чисел из правой" : "Сумма чисел из правой половины массива больше суммы чисел из левой");
                    } else {
                        double middleNumber = array[array.length / 2 + 1];
                        for (int i = 0; i < array.length / 2; i++) {
                            sumLeftHalf += array[i];
                            sumRightHalf += array[array.length - 1 - i];
                        }
                        System.out.println((sumLeftHalf + middleNumber / 2) > (sumRightHalf + middleNumber / 2)? "Сумма чисел из левой половины массива больше суммы чисел из правой" : "Сумма чисел из правой половины массива больше суммы чисел из левой");
                    }
                    break;
                } else {
                    System.out.println("Вы ввели отрицательное число или 0. Попробуйте ещё раз: ");
                }
            } else {
                System.out.println("Попробуйте еще раз");
                break;
            }
        }
    }
}

