package AlexLink.HomeWork.IO.HomeWork12;

//3) Проверка на цензуру:
//Создаете 2 файла.
//1 - й. Содержит исходный текст.
//2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
//определите сами, хотите каждое слово на новой строке, хотите через запятую
//разделяйте, ваша программа делайте как считаете нужным.
//Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
//встретилось ни одного недопустимого слова, то выводите сообщение о том что
//текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
//сообщение, кол-во предложений не прошедших проверку и сами предложения
//подлежащие исправлению.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        try (BufferedReader blackBuf = new BufferedReader(new FileReader("111.txt"));
             BufferedReader checkBuf = new BufferedReader(new FileReader("222.txt"))) {
            while (checkBuf.ready()) {
                stringBuilder.append(checkBuf.readLine());
            }
            while (blackBuf.ready()) {
                stringBuilder1.append(blackBuf.readLine()).append(" ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> blackList = Arrays.asList(stringBuilder1.toString().toLowerCase().trim().split("\\s+"));
        System.out.println(stringBuilder);
        System.out.println(blackList);
        List<String> text = Arrays.asList(stringBuilder.toString().toLowerCase().trim().split("\\."));
        System.out.println(text);
        int countSentence = 0;
        for (String word : blackList) {
            for (String sentence : text) {
                if (sentence.contains(word)) {
                    System.out.println("Предложение не прошло проверку: \"" + sentence + "\". " + "В нем присутствует слово \"" + word + "\"");
                    countSentence++;
                }
            }
        }
        if (countSentence == 0) {
            System.out.println("Текст прошел проверку");
        } else {
            System.out.println("Количество предложений, которые не прошли проверку = " + countSentence);
        }
    }
}
