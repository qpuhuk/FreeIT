package AlexLink.HomeWork.HW3;

//Найти сумму элементов между большим и меньшим элементом массива


import java.util.Arrays;

public class Task16Metodichka {
    private static int sum;

    public static void main(String[] args) {

        int[] array = {4, 5, 9, 15, 3, 10, 21, 23};
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                indexMin = i;
            }
            if (array[i] == max) {
                indexMax = i;
            }
        }
        if ((indexMax - indexMin) > 0) {
            int[] newArray = Arrays.copyOfRange(array, indexMin, indexMax + 1);
            sum = Arrays.stream(newArray).sum();
        } else {
            int[] newArrayTwo = Arrays.copyOfRange(array, indexMax, indexMin + 1);
            sum = Arrays.stream(newArrayTwo).sum();
        }
        System.out.println("Сумма = " + sum);
    }
}
