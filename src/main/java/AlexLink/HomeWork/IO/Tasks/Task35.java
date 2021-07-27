package AlexLink.HomeWork.IO.Tasks;

//Задание 35
//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//распечатать числа и их среднее арифметическое.

import java.io.*;

public class Task35 {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("20num.txt")))) {
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int) (Math.random() * 100));
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IOException");
            e.printStackTrace();
        }
        int arithmeticMean = 0;
        int countNumbers = 0;
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("20num.txt")))) {
            int temp = dis.readInt();
            while (temp != -1) {
                countNumbers++;
                arithmeticMean += temp;
                System.out.print(temp + " ");
                try {
                    temp = dis.readInt();
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IOException");
            e.printStackTrace();
        }
        if (countNumbers != 0) {
            System.out.println("\nArithmetic mean = " + arithmeticMean / countNumbers);
        }
    }
}
