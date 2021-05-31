package AlexLink.HomeWork.Arrays;

//1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//созданием массива подумайте, какого он будет размера.
//1) Найти произведение элементов, кратных 3.

public class Task1 {

    public static void main(String[] args) {
        int[] evenNumbers = new int[10];
        int sub = 1;
        for (int i = 0, count = 0; i < evenNumbers.length; i++, count += 2) {
            evenNumbers[i] = count + 2;

        }
        for (int a : evenNumbers) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
        for (int a : evenNumbers) {
            System.out.println(a);
        }
        System.out.println();
        for (int a : evenNumbers) {
            if (a % 3 == 0)
                sub *= a;
        }
        System.out.println("Произведение чисел, кратных трем, = " + sub);
    }
}
