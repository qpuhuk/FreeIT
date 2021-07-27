package AlexLink.HomeWork.HW2;

//6) Даны 2 числа. Вывести большее из них

import java.util.Scanner;

public class Task6Zadachnik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println((a > b ? a : b));
    }
}
