package AlexLink.HomeWork.HW2;

//5) Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.

import java.util.Scanner;

public class Task5Zadachnik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третье число");
        int c = scanner.nextInt();
        int count = 0;
        if (a != 0)
            count++;
        if (b != 0)
            count++;
        if (c != 0)
            count++;
        System.out.println(count);
    }
}
