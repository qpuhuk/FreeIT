package AlexLink.HomeWork.Arrays;

//5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//        выведите массивы на экран в двух отдельных строках. Посчитайте среднее
//        арифметическое элементов каждого массива и сообщите, для какого из
//        массивов это значение оказалось больше (либо сообщите, что их средние
//        арифметические равны).

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        int count1 = array1.length;
        int count2 = array2.length;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 16);
            sum1 += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 16);
            sum2 += array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        double mid1 = sum1 / count1;
        double mid2 = sum2 / count2;
        if (mid1 == mid2)
            System.out.printf("Среднее арифметическое массива 1 = %d равно среднему арифметическому второго массива = %d", mid1, mid2);
        else
            System.out.print((mid1 > mid2) ? "Среднее арифметическое массива 1 больше среднего арифметического второго массива" : "Среднее арифметическое массива 1 меньше среднего арифметического второго массива");
    }
}
