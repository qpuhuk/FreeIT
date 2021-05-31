package AlexLink.HomeWork.Arrays;

/*������ ���� �����:
        ������ ���������� �������, ������ ������ � ����������. ���������
        ���������� ������� � ��������� �� 0 �� 50. � ������� �� �������(� ����
        �������).
        1) �������� ����� ������ ��������� ������� �� ������� ���������.
        2)������� �������� �������� ����������� ��� �������
        ����������(������������).
        3)��������� ������������ ��������� ����� ��������� ������.
        4)��������� ����� ������ ��������� ������� ��� �������� ���������� (��
        ������������)
        5)��������������� �������(1 ������� ������ 1-� �������, 2-� ������� - 2-�
        ������� � �. �.)*/

import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
//������ ���������� �������, ������ ������ � ����������. ��������� ���������� ������� � ��������� �� 0 �� 50. � ������� �� �������(� ���� �������).
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ ����������� �������");
        int sizeArray = scanner.nextInt();
        int[][] array;
        if (sizeArray > 0) {
            array = new int[sizeArray][sizeArray];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = (int) (Math.random() * 51);
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] / 10 == 0)
                        System.out.print("0" + array[i][j] + " ");
                    else
                        System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            // 1) �������� ����� ������ ��������� ������� �� ������� ���������.
            int sumMainDiag = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if ((i == j) && (array[i][j] % 2 == 0))
                        sumMainDiag += array[i][j];
                }
            }
            System.out.println("����� ������ ��������� ������� �� ������� ��������� = " + sumMainDiag);
//2)������� �������� �������� ����������� ��� ������� ����������(������������).
            int sumUnderMainDiag = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if ((i >= j) && (array[i][j] % 2 == 1))
                        sumUnderMainDiag += array[i][j];
                }
            }
            System.out.println("�������� �������� ����������� ��� ������� ����������(������������) = " + sumUnderMainDiag);
//3)��������� ������������ ��������� ����� ��������� ������.
            int mulMainDiag = 1;
            int mulSecDiag = 1;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == j)
                        mulMainDiag *= array[i][j];
                    if ((i + j) == array.length - 1)
                        mulSecDiag *= array[i][j];
                }
            }
            System.out.println(mulMainDiag > mulSecDiag ? "������������ ��������� ������� ��������� = " +
                    mulMainDiag + " ������ ������������ �������� ��������� = " + mulSecDiag : "������������ ��������� �������� ��������� = " +
                    (mulSecDiag) + " ������ ������������ ������� ��������� = " + mulMainDiag);
//4)��������� ����� ������ ��������� ������� ��� �������� ���������� (�� ������������)
            int sumEvenOverSecDiag = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if ((i + j) < (array.length - 1) && (array[i][j] % 2 == 0))
                        sumEvenOverSecDiag += array[i][j];
                }
            }
            System.out.println("����� ������ ��������� ������� ��� �������� ���������� (�� ������������) = " + sumEvenOverSecDiag);
//5)��������������� �������(1 ������� ������ 1-� �������, 2-� ������� - 2-� ������� � �. �.)

            for (int i = 0; i < array.length; i++) {
                for (int j = i; j < array[i].length; j++) {
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] / 10 == 0)
                        System.out.print("0" + array[i][j] + " ");
                    else
                        System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
