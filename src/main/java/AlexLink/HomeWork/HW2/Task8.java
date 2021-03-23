package AlexLink.HomeWork.HW2;

/*Имеется целое число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количество денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.*/

import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(Integer.MAX_VALUE);
        if ((x % 100) > 10 && (x % 100) < 20)
            System.out.println(x + " рублей");
        else {
            switch (x % 10) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(x + " рублей");
                    break;
                case 1:
                    System.out.println(x + " рубль");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(x + " рубля");
                    break;

            }
        }
    }
}
