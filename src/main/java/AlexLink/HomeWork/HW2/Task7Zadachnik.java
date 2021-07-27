package AlexLink.HomeWork.HW2;

/*7)  В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
 */


import java.util.Scanner;

public class Task7Zadachnik {
    public static void main(String[] args) {
        System.out.println("Введите количество программистов");
        int numberOfProgrammers = new Scanner(System.in).nextInt();
        if (numberOfProgrammers < 0)
            System.out.println("Не может быть отрицательное количество программистов");
        if ((numberOfProgrammers % 100) > 10 && (numberOfProgrammers % 100) < 20)
            System.out.println(numberOfProgrammers + " программистов");
        else {
            switch (numberOfProgrammers % 10) {
                case 1:
                    System.out.println(numberOfProgrammers + " программист");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(numberOfProgrammers + " программиста");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    System.out.println(numberOfProgrammers + " программистов");
                    break;

            }
        }
    }
}
