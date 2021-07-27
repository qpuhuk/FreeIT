package AlexLink.HomeWork.IO.HomeWork12.Task2;

//2)Текстовый файл содержит текст. После запуска программы в другой файл
//должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//слов в предложении, оно попадает в новый файл.
//
//Пишем все в ООП стиле. Создаём класс TextFormater
//в котором два статических метода:
//1. Метод принимает строку и возвращает кол-во слов в строке.
//2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//есть возвращает true, если нет false
//
//В main считываем файл.
//Разбиваем текст на предложения. Используя методы класса TextFormater
//определяем подходит ли нам предложение. Если подходит добавляем его в
//новый файл

import java.io.*;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("countWords.txt"))) {
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] splitText = stringBuilder.toString().toLowerCase().trim().split("\\s*(\\.!?)\\s*");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("newDocument.txt"))) {
            for (String str : splitText) {
                int countWords = TextFormater.countWordsInSentence(str);
                boolean isPol = TextFormater.checkingForPolindrom(str);
                if ((countWords > 2 && countWords < 6) || isPol) {
                    bufferedWriter.write(str);
                    System.out.println(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
