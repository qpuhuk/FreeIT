package AlexLink.HomeWork.HW3;

//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.

public class Task14Metodichka {
    public static void main(String[] args) {
        int[] score = {3, 5, 7, 3, 4, 10};
        int min = score[0];
        int max = score[0];
        for (int i = 0; i < score.length - 1; i++) {
            if (min > score[i + 1])
                min = score[i + 1];
            if (max < score[i + 1])
                max = score[i + 1];
        }
        System.out.println("Минимальная оценка : " + min);
        System.out.println("Максимальная оценка : " + max);
    }
}
