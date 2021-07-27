package AlexLink.HomeWork.IO.HomeWork12;

//1)В исходном файле находятся слова, каждое слово на новой строке. После
//запуска программы должен создать файл, который будет содержать в себе
//только полиндромы

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        String text = "far\nalone\noko\npotop\nhere";
        File file = new File("polindromes.txt");
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file))) {
            bos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("polindromes.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("OnlyPolindromes.txt"))) {
            StringBuilder stringBuilder = new StringBuilder();
            int read = bis.read();
            while (read != -1) {
                stringBuilder.append((char) read);
                read = bis.read();
            }
            System.out.println(stringBuilder.toString().trim());
            System.out.println("**********************");
            String[] splitText = stringBuilder.toString().trim().split("\\s");
            for (String temp : splitText) {
                char[] word = temp.toCharArray();
                int count = 0;
                for (int i = 0; i < word.length / 2; i++) {
                    if (word[i] != word[word.length - 1 - i]) {
                        break;
                    } else {
                        count++;
                    }
                    if (count == word.length / 2) {
                        bos.write(temp.getBytes());
                        System.out.println(temp);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
