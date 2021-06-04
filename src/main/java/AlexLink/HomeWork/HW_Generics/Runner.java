package AlexLink.HomeWork.HW_Generics;

//Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//etc.). Реализовать метод get(int index), который возвращает любой элемент
//массива по индексу.

public class Runner {
    public static void main(String[] args) {
        Generics<Integer> test = new Generics<>(new Integer[10]);
        for (int i = 0; i < test.getLength(); i++) {
            test.setArrayElementByIndex(i, i);
            System.out.print(test.getArrayElementByIndex(i) + " ");
        }

        Generics<String> test1 = new Generics<>(new String[10]);
        for (int i = 0; i < test1.getLength(); i++) {
            test1.setArrayElementByIndex(i, "Число " + i);
            System.out.println(test1.getArrayElementByIndex(i));
        }
    }
}
