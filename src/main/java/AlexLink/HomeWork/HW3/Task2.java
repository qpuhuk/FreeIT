package AlexLink.HomeWork.HW3;

//2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class Task2 {
    public static void main(String[] args) {
        int countAmoeba = 1;
        for (int i = 3; i <= 24; i += 3) {
            countAmoeba *= 2;
            System.out.printf("Через %d часа(ов) количество амёб будет = %d\n", i, countAmoeba);
        }
    }
}
