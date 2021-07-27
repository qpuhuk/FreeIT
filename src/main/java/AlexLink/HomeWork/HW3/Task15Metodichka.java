package AlexLink.HomeWork.HW3;

//Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив).

public class Task15Metodichka {
    public static void main(String[] args) {
        String[] array = {"Я", "хожу", "в", "магазин", "каждый", "день", "!"};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length / 2; i++) {
            String old = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = old;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
