package AlexLink.HomeWork.Arrays;

// 3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
//      массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
//       это количество на экран на отдельной строке.
//3) Найти средне арифметическое элементов массива, превосходящих некоторое
//число С.

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] randomNumbers = new int[15];
        Random random = new Random();
        int randomC = (random.nextInt(50));
        int evenCount = 0;
        int sum = 0;
        int quantity = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
            if (randomNumbers[i] % 2 == 0)
                evenCount++;
        }
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println("Количество чётных чисел = " + evenCount);
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > randomC) {
                quantity++;
                sum += randomNumbers[i];
            }
        }
        System.out.println("Число С = " + randomC);
        if (quantity == 0)
            System.out.println("Нет чисел превышающих число С");
        else
        System.out.println("Среднее арифметическое чисел, которые больше числа С = " + sum / quantity);
    }
}
