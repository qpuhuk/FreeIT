package AlexLink.HomeWork.Arrays;

/*Начало всех задач:
        Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
        случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
        матрицы).
        1) Почитать сумму четных элементов стоящих на главной диагонали.
        2)Вывести нечетные элементы находящиеся под главной
        диагональю(включительно).
        3)Проверить произведение элементов какой диагонали больше.
        4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
        включительно)
        5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
        строкой и т. д.)*/

import java.util.Scanner;

public class MultidimensionalАrrays {
    public static void main(String[] args) {
//Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер квадратного массива");
        int sizeArray = scanner.nextInt();
        int[][] array;
        if (sizeArray > 0) {
            array = new int[sizeArray][sizeArray];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 51);
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] / 10 == 0)
                        System.out.print("0" + array[i][j] + " ");
                    else
                        System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            // 1) Почитать сумму четных элементов стоящих на главной диагонали.
            int sumMainDiag = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if ((i == j) && (array[i][j] % 2 == 0))
                        sumMainDiag += array[i][j];
                }
            }
            System.out.println("Сумма четных элементов стоящих на главной диагонали = " + sumMainDiag);
//2)Вывести нечетные элементы находящиеся под главной диагональю(включительно).
            int sumUnderMainDiag = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if ((i >= j) && (array[i][j] % 2 == 1))
                        sumUnderMainDiag += array[i][j];
                }
            }
            System.out.println("Нечетные элементы находящиеся под главной диагональю(включительно) = " + sumUnderMainDiag);
//3)Проверить произведение элементов какой диагонали больше.
            int mulMainDiag = 1;
            int mulSecDiag = 1;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == j)
                        mulMainDiag *= array[i][j];
                    if ((i + j) == array.length - 1)
                        mulSecDiag *= array[i][j];
                }
            }
            System.out.println(mulMainDiag > mulSecDiag ? "Произведение элементов главной диагонали = " +
                    mulMainDiag + " больше произведения побочной диагонали = " + mulSecDiag : "Произведение элементов побочной диагонали = " +
                    (mulSecDiag) + " больше произведения главной диагонали = " + mulMainDiag);
//4)Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
            int sumEvenOverSecDiag = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if ((i + j) < (array.length - 1) && (array[i][j] % 2 == 0))
                        sumEvenOverSecDiag += array[i][j];
                }
            }
            System.out.println("Сумма четных элементов стоящих над побочной диагональю (не включительно) = " + sumEvenOverSecDiag);
//5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)

            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array[i].length; j++) {
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] / 10 == 0)
                        System.out.print("0" + array[i][j] + " ");
                    else
                        System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
