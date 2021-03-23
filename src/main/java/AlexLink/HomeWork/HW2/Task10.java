package AlexLink.HomeWork.HW2;

//Задание 10
//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class Task10 {
    public static void main(String[] args) {
        int a = 15;
        int fact = 10;
        for (int i = 11; i <= a; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
