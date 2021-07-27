package AlexLink.HomeWork.HW2;

/*Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.*/

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int count = new Scanner(System.in).nextInt();
        if ((Math.abs(count / 100)) >= 1 && ((Math.abs(count / 100)) < 10))
            System.out.println("Число является трехзначным");
        else
            System.out.println("Число не является трехзначным");

        if ((Math.abs(count % 10)) == 7)
            System.out.println("Последняя цифра числа является семеркой");
        else
            System.out.println("Последняя цифра не является семеркой");

        if (count % 2 == 0)
            System.out.println("Число является четным");
        else
            System.out.println("Число является нечетным");
    }

}
