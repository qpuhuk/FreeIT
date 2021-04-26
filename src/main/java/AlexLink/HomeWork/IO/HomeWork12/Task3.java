package AlexLink.HomeWork.IO.HomeWork12;

//3) �������� �� �������:
//�������� 2 �����.
//1 - �. �������� �������� �����.
//2 - �. �������� ����� ������������ � ������(black list). ��������� �����
//���������� ����, ������ ������ ����� �� ����� ������, ������ ����� �������
//����������, ���� ��������� ������� ��� �������� ������.
//������: ���������� ��������� �������� �� ����� �������. ���� � ������ ��
//����������� �� ������ ������������� �����, �� �������� ��������� � ��� ���
//����� ������ �������� �� �������. ���� ���, �� �������� ����������������
//���������, ���-�� ����������� �� ��������� �������� � ���� �����������
//���������� �����������.

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
                    System.out.println("����������� �� ������ ��������: \"" + sentence + "\". " + "� ��� ������������ ����� \"" + word + "\"");
                    countSentence++;
                }
            }
        }
        if (countSentence == 0) {
            System.out.println("����� ������ ��������");
        } else {
            System.out.println("���������� �����������, ������� �� ������ �������� = " + countSentence);
        }
    }
}
