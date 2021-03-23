package AlexLink.HomeWork.HW3;

//Задание 13
//Создать последовательность случайных чисел, найти и вывести наибольшее
//из них.

public class Task13Metodichka {
    public static void main(String[] args) {
        int[] randomNumbers = {3, 66, 11, 23, 3333, 42, 12, 434, 123, 2222, 123};
        int biggestNum = randomNumbers[0];
        for (int i = 0; i < randomNumbers.length - 1; i++) {
            if (biggestNum < randomNumbers[i + 1])
                biggestNum = randomNumbers[i + 1];
        }
        System.out.println("Самое большое число из массива = " + biggestNum);
    }
}
