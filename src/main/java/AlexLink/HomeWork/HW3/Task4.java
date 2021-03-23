package AlexLink.HomeWork.HW3;

//4)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a : ");
        int a = scanner.nextInt();
        System.out.println("Введите число b : ");
        int b = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < b; i++) {
            c += a;
        }
        System.out.println("a * b = " + c);
    }
}
