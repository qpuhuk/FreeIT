package AlexLink.HomeWork.String;

//1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
//последнего вхождения символа(B).

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1_2_3 {
    public static void main(String[] args) {
        String str = "I go to work every day";
        System.out.println(str.substring(str.indexOf('o'), str.lastIndexOf('e')));
        System.out.println("\n");
//2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
//позиции 0

        char index = str.charAt(3);
        System.out.println("Символ в позиции 3 - " + index);
        char index2 = str.charAt(0);
        System.out.println("Символ в позиции 0 - " + index2);
        String newStr = str.replace(index, index2);
        System.out.println("Новая строка - " + newStr);

        System.out.println(str.replace(str.charAt(3), str.charAt(0)));
        System.out.println("\n");

//3)В исходном файле находятся слова, каждое слово на новой стороке. После
//запуска программы должен создать файл, который будет содержать в себе
//только полиндромы

        String line = "Ворона\nавтобус\nшалаш\nтопот\nкар\nмасло";
        System.out.println("Слова - \n" + line + "\n");
        String[] lineToArray = line.split("\n");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < lineToArray.length; i++) {
            char[] word = lineToArray[i].toCharArray();
            int countLetter = 0;
            for (int j = 0; j < word.length / 2; j++) {
                if (word[j] == word[word.length - 1 - j]) {
                    countLetter = countLetter + 2;
                    if (countLetter == word.length || countLetter == (word.length - 1))
                        stringBuilder.append(lineToArray[i]).append(" ");
                }
            }
        }
        System.out.println("Слова полиндромы в строке - " + stringBuilder);
    }
}
