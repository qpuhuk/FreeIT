package AlexLink.HomeWork.IO.Tasks;

//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
//препинания и слов.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task33 {
    public static void main(String[] args) {
        int countMarks = 0;
        int countWords = 0;
        Pattern pattern = Pattern.compile("[.,!?—:;]");
        Pattern pattern1 = Pattern.compile("\\w+");
        Matcher matcher;
        Matcher matcher1;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("www.txt"))) {
            while (bufferedReader.ready()) {
                String temp = bufferedReader.readLine();
                String[] split = temp.split("\\b");
                for (String str : split) {
                    matcher = pattern.matcher(str);
                    matcher1 = pattern1.matcher(str);
                    if (matcher.find()) {
                        countMarks++;
                    }
                    if (matcher1.find()) {
                        countWords++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(countMarks);
        System.out.println(countWords);
    }
}
