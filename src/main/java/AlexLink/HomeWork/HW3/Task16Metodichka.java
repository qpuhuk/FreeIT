package AlexLink.HomeWork.HW3;

//Определите сумму элементов одномерного массива, расположенных между
//        минимальным и максимальным значениями.

public class Task16Metodichka {
    private static int sum;

    public static void main(String[] args) {

        int[] array = {4, 7, 9, 33, 634, 64, 234, 31};
        int min = 10;
        int max = 100;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > min && array[i] < max)
                sum += i;
        }
        System.out.println("Сумма элементов массива = " + sum);
    }
}
