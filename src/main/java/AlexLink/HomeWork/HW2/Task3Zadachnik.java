package AlexLink.HomeWork.HW2;

/*3) Дано целое число. Если оно является положительным, то прибавить к нему 1.Если отрицательным, то вычесть из него 2.
Если нулевым, то заменить его на 10. Вывести полученное число
*/

import java.util.Scanner;

public class Task3Zadachnik {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int a = new Scanner(System.in).nextInt();
        if (a > 0)
            System.out.println(a + 1);
        else if (a < 0)
            System.out.println(a - 2);
        else
            System.out.println(10);
    }
}
