package AlexLink.HomeWork.HW2;

//Найдите сумму первых n целых чисел, которые делятся на 3.

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Введите количество обрабатываемых целых чисел ");
        int numberOfIntegers = new Scanner(System.in).nextInt();
        int sum = 0;
        for (int i = 0; i <= numberOfIntegers; i++) {
            if ((i % 3) == 0)
                sum += i;
        }
        System.out.println(sum);
    }
}
