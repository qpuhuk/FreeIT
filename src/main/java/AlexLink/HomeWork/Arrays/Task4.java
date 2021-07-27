package AlexLink.HomeWork.Arrays;

//  4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
//        массив на экран в строку. Замените каждый элемент с нечётным индексом на
//        ноль. Снова выведете массив на экран на отдельной строке.
//4) Найти наименьший нечетный элемент.

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Integer[] randomArray = new Integer[20];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(21);
        }
        System.out.println(Arrays.toString(randomArray));
        int min = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 1 && min > randomArray[i])
                min = randomArray[i];
        }
        System.out.println("Минимальное нечетное значение = " + min);
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 == 1)
                randomArray[i] = 0;
        }
        System.out.println(Arrays.toString(randomArray));

    }
}
