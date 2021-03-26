package AlexLink.HomeWork.Arrays;

//7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//        какой элемент является в этом массиве максимальным и сообщите индекс его
//        последнего вхождения в массив.

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int [] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 16);
        }
        System.out.println(Arrays.toString(array));
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        int numberLastEnter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max)
                numberLastEnter = i;
        }
        System.out.printf("Максимальный элемент в массиве: %d c индексом %d", max, numberLastEnter);
    }
}
