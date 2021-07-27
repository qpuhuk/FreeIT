package AlexLink.HomeWork.HW2;

//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Ведите число!");
        int next = new Scanner(System.in).nextInt();
        for (int i = 1; i <= next; i++) {
            if ((next % i) == 0)
                count++;
        }
        if (count == 2)
            System.out.printf("Число %d является простым", next);
        else
            System.out.printf("Число %d не является простым", next);
    }
}
