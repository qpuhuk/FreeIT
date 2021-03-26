package AlexLink.HomeWork.Arrays;

// 2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
//       строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
//        порядке (99 97 95 93 ... 7 5 3 1).
//2) Найти среднее арифметическое элементов с нечетными номерами.

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int [] oddNumbers = new int[100/2];
        int quantity = 0;
        int sum = 0;
        for (int i = 0, count = -1; i < oddNumbers.length; i++, count = count + 2) {
            oddNumbers[i] = count + 2;
        }
        System.out.println(Arrays.toString(oddNumbers));
        for (int i = 0; i < oddNumbers.length / 2; i++) {
            int temp = oddNumbers[i];
            oddNumbers[i] = oddNumbers[oddNumbers.length - i - 1];
            oddNumbers[oddNumbers.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(oddNumbers));
        for (int i = 0; i < oddNumbers.length; i++) {
            sum += oddNumbers[i];
            quantity++;
        }
        System.out.println("Среднее арифметическое чисел массива = " + sum / quantity);
    }
}
