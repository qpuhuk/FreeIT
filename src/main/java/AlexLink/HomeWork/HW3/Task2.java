package AlexLink.HomeWork.HW3;

//2)������������� ����� ������ 3 ���� ������� �� 2 ������. ����������,������� ���� ����� ����� 3, 6, 9, 12,..., 24 ����.

public class Task2 {
    public static void main(String[] args) {
        int countAmoeba = 1;
        for (int i = 3; i <= 24; i += 3) {
            countAmoeba *= 2;
            System.out.printf("����� %d ����(��) ���������� ��� ����� = %d\n", i, countAmoeba);
        }
    }
}
