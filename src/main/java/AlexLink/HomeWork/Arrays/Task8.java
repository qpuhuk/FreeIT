package AlexLink.HomeWork.Arrays;

// 8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
//        массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//        массива должен равняться отношению элемента из первого массива с i-ым
//        индексом к элементу из второго массива с i-ым индексом. Вывести все три
//        массива на экран (каждый на отдельной строке), затем вывести количество
//        целых элементов в третьем массиве.
//8) Найти второй по величине (т.е. следующий по величине за максимальным)
//элемент в массиве.
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int [] array1 = new int[10];
        int [] array2 = new int[10];
        double [] array3 = new double[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
            array2[i] = (int) (Math.random() * 10);
            array3[i] = (double) array1[i] / array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        int countIntNumber = 0;
        for (double v : array3) {
            if ((v % 1) == 0)
                countIntNumber++;
        }
        System.out.println("Количество целых чисел в массиве №3: " + countIntNumber);
        Arrays.sort(array3);
        System.out.println("Предмаксимальное значение = " + array3[array3.length - 2]);
    }
}
