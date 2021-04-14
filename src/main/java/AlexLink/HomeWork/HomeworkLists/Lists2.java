package AlexLink.HomeWork.HomeworkLists;

//Задание 31
//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lists2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20));
        }
        System.out.println("All list" + list);
        ListIterator<Integer> listIterator = list.listIterator();
        Integer temp = list.get(0);
        while (listIterator.hasNext()) {
            if (temp < listIterator.next()) {
                temp = list.get(listIterator.previousIndex());
            }
        }
        System.out.println("Max value in list = " + temp);
    }
}
