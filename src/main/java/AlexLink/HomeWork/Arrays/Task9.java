package AlexLink.HomeWork.Arrays;

//9)������������ ������ ������� � ���������� ������������� �����, �
//        ��������� ������ ������� ������ ���������� ������� �� ��������� �����
//        ����� �� [0;15] � ������� ��� �� ����� � ������. ����� ����� ��������� ������
//        ���������� � �������� ������������ � ���, ����� ����� �������� �������
//        ������: ����� ��� ������, ���� ��������, ��� ��� ����� ������� �����. ����
//
//        ������������ ����� ������������ �����, �� ������ ���������������
//        ���������
//9) ����� ���������� ������� ����� ��������� � ������� ��������� �������

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    static int sumLeftHalf;
    static int sumRightHalf;
    static int[] array = new int[0];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����: ");
        while (scanner.hasNextInt()) {
            int length = scanner.nextInt();
            array = addArray(length);
            result(array);
            min(array);
        }
    }

    static int[] addArray(int length) {
        if (length > 0) {
            array = new int[length];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 16);
            }
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("�� ����� ������������� ����� ��� 0. ���������� ��� ���: ");
        }
        return array;
    }

    static void result(int[] array) {
        if (array.length == 0)
            System.out.println();
        if (array.length == 1)
            System.out.println("������ ������� �� ������ �����, ���������� ������� �� ��������");
        if (array.length > 1) {
            for (int i = 0; i < array.length / 2; i++) {
                sumLeftHalf += array[i];
                sumRightHalf += array[array.length - 1 - i];
            }
            if (sumLeftHalf == sumRightHalf)
                System.out.println("�������� ������� �����");
            else
                System.out.println(sumLeftHalf > sumRightHalf ? "����� ����� �� ����� �������� ������� ������ ����� ����� �� ������" : "����� ����� �� ������ �������� ������� ������ ����� ����� �� �����");
        }
    }

    static void min(int[] array) {
        int min = Integer.MAX_VALUE;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i = i + 2) {
                if (min > array[i])
                    min = array[i];
            }
            System.out.println("���������� �������, ����� ��������� � ������� ��������� ������� = " + min);
        }
    }
}

