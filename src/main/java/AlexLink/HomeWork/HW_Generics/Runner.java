package AlexLink.HomeWork.HW_Generics;

//Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//etc.). Реализовать метод get(int index), который возвращает любой элемент
//массива по индексу.

public class Runner {
    public static void main(String[] args) {
        Generics<Integer> test = new Generics<>();
        test.array = new Integer[10];
        for (int i = 0; i < test.array.length; i++) {
            test.array[i] = i;
            System.out.println(test.getArray(i));
        }
        System.out.println("**************************************");
        Generics<String> test1 = new Generics<>();
        test1.array = new String[10];
        for (int i = 0; i < test1.array.length; i++) {
            test1.array[i] = "Число " + i;
            System.out.println(test1.getArray(i));
        }
    }
}
