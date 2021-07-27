package AlexLink.HomeWork.HW2;

/*2) Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника.
Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.util.Scanner;

public class Task2Zadachnik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите длину стороны треугольника \"а\"");
        a = scanner.nextInt();
        System.out.println("Введите длину стороны треугольника \"b\"");
        b = scanner.nextInt();
        System.out.println("Введите длину стороны треугольника \"c\"");
        c = scanner.nextInt();
        if ((a + b) > c && (b + c) > a && (a + c) > b)
            System.out.println("Такой треугольник может существовать!");
        else
            System.out.println("Такого треугольника не может существовать");
    }
}
