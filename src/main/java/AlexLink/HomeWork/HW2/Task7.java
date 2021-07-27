package AlexLink.HomeWork.HW2;

//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//        полностью закрыть круглой картонкой радиусом r.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r = scanner.nextInt();

        int hypotenuseSquared = a * a + b * b;
        double hypotenuse = Math.sqrt(hypotenuseSquared);

        if (r >= hypotenuse/2)
            System.out.println("Круглая картонка полностью закрывает прямоугольник");
        else
            System.out.println("Круглая картонка не закрывает прямоугольник");
    }

}
