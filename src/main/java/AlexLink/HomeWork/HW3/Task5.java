package AlexLink.HomeWork.HW3;

//5)Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double inch = 2.54;
        System.out.println("Таблица перевода дюймов в сантиметры: ");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " дюйм(а, ов) = " + i * inch + " сантиметра(ов)");
        }
    }
}
