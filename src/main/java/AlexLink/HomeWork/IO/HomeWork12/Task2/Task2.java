package AlexLink.HomeWork.IO.HomeWork12.Task2;

//2)��������� ���� �������� �����. ����� ������� ��������� � ������ ����
//������ ���������� ������ �� ����������� � ������� �� 3-� �� 5-�� ����. ���� �
//����������� ������������ �����-���������, �� �� ����� �������� ����� ���-��
//���� � �����������, ��� �������� � ����� ����.
//
//����� ��� � ��� �����. ������ ����� TextFormater
//� ������� ��� ����������� ������:
//1. ����� ��������� ������ � ���������� ���-�� ���� � ������.
//2. ����� ��������� ������ � ��������� ���� �� � ������ �����-���������. ����
//���� ���������� true, ���� ��� false
//
//� main ��������� ����.
//��������� ����� �� �����������. ��������� ������ ������ TextFormater
//���������� �������� �� ��� �����������. ���� �������� ��������� ��� �
//����� ����

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
