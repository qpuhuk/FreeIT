package AlexLink.HomeWork.HW1;

/*Определить число, полученное выписыванием в обратном порядке цифр
   любого 4-х значного натурального числа n.*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("Число = " + d + c + b + a);
    }

}
