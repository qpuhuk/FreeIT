package AlexLink.HomeWork.HW1;

/*������� 4500 ������. ������� � ������� ������������ � ���� ���������� ������:
�) ����� + ������,
�) ����� + ����� + ������,
�) ���� + ����� + ����� + ������,
D) ������ + ���� + ����� + ����� + ������.
�� �������� � �������� ����.*/

public class Task3 {
    public static void main(String[] args) {
        final int quantitySecAll = 4500;

        int quantityIntMin = quantitySecAll % 60;
        int quantityMinInSec = (quantitySecAll - quantityIntMin) / 60;
        int quantityMin = quantityMinInSec % 60;
        int quantityHoursOfSec = (quantityMinInSec - quantityMin) / 60;
        int quantityHours = quantityHoursOfSec % 24;
        int quantityDaysOfSec = (quantityHoursOfSec - quantityHours) / 24;
        int quantityDays = quantityDaysOfSec % 7;
        int quantityWeeks = (quantityDaysOfSec - quantityDays) / 7;

        System.out.printf("%d ����� %d ������\n", quantityMin, quantityIntMin);
        System.out.printf("%d ����� %d ����� %d ������\n", quantityHours, quantityMin , quantityIntMin);
        System.out.printf("%d ���� %d ����� %d ����� %d ������\n", quantityDays, quantityHours, quantityMin , quantityIntMin);
        System.out.printf("%d ������ %d ���� %d ����� %d ����� %d ������\n",quantityWeeks, quantityDays, quantityHours, quantityMin , quantityIntMin);
    }
}