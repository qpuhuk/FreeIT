package AlexLink.HomeWork.HW3;

//7)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99


public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
                sum += i;
        }
        System.out.println("Сумма всех нечетных чисел от 1 до 99 = " + sum);
    }
}
