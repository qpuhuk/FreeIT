package AlexLink.HomeWork.HomeworkLists;

//Задание 29
//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Удалить неудовлетворительные оценки из списка.
//Задание 30
//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//числа.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<Integer> points = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            points.add(((int) (Math.random() * 11)));
        }
        System.out.println(points);
        List<Integer> randomNumber = new ArrayList<>(points);
        points.removeIf(s -> s < 3);
        System.out.println(points);
        Collections.sort(randomNumber);
        System.out.println(randomNumber);
        for (int i = randomNumber.size(); i > 0; i--) {
            if (i == 1) {
                break;
            }
            if (randomNumber.get(i - 1).equals(randomNumber.get(i - 2))) {
                randomNumber.remove(i - 1);
                randomNumber.remove(i - 2);
                i--;
            }
        }
        System.out.println(randomNumber);
    }
}

