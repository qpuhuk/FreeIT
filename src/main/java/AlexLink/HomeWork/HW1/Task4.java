package AlexLink.HomeWork.HW1;

/*Определить число, полученное выписыванием в обратном порядке цифр
   любого 4-х значного натурального числа n.*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        if (a > 999 && a < 10000) {
            int thousands = (a % 10) * 1000;
            int hundreds = (a % 100 - a % 10) * 10;
            int dozens = (a % 1000 - a % 100) / 10;
            int numbers = a / 1000;
            int count = thousands + hundreds + dozens + numbers;
            System.out.println("Число = " + count);
        } else {
            System.out.println("Число не 4-х значное");
        }
    }
}
