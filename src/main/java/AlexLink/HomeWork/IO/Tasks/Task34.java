package AlexLink.HomeWork.IO.Tasks;

//Задание 34
//Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
//распечатать.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task34 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream("numbers.txt")) {
            int temp = fileInputStream.read();
            while (temp != -1) {
                stringBuilder.append((char) temp);
                temp = fileInputStream.read();
            }
            System.out.println("File is read: " + stringBuilder);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IOException");
            e.printStackTrace();
        }
        String[] file = stringBuilder.toString().trim().split("\\s+");
        int sum = 0;
        HashSet<String> onlyNoRepeatingNumbers = new HashSet<>();
        System.out.print("Only numbers: ");
        for (String temp : file) {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(temp);
            if (matcher.matches()) {
                sum += Integer.parseInt(temp);
                System.out.print(temp + " ");
                onlyNoRepeatingNumbers.add(temp);
            }
        }
        System.out.println("\nSum = " + sum);
        System.out.println("OnlyNoRepeatingNumbers: " + onlyNoRepeatingNumbers);
    }
}
