package AlexLink.HomeWork.HW2;

//      1)В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, "это однозначное положительное число". Достаточно будет определить, является ли число однозначным,
//        двузначным или трехзначным и более.


import java.util.Scanner;

public class Task1Zadachnik {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        int x = new Scanner(System.in).nextInt();
        if ((Math.abs(x) / 10) == 0) {
            if (x >= 0)
                System.out.println("Однозначное положительно число");
            else
                System.out.println("Однозначное отрицательное число");
        } else if ((Math.abs(x) / 10) < 10 && (Math.abs(x) / 10) > 0) {
            if (x >= 0)
                System.out.println("Двузначное положительно число");
            else
                System.out.println("Двузначное отрицательное число");
        } else if ((Math.abs(x) / 10) > 9 && (Math.abs(x) / 10) < 100) {
            if (x >= 0)
                System.out.println("Трехзначное положительно число");
            else
                System.out.println("Трехзначное отрицательное число");
        } else
            System.out.println("Неизвестное число");

    }
}
