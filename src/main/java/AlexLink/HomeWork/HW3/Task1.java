package AlexLink.HomeWork.HW3;

//1)Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
// Какой суммарный путь пробежит спортсмен за 7 дней?*/

public class Task1 {
    public static void main(String[] args) {
        double distance = 10.0;
        for (int i = 0; i < 7; i++) {
            distance *= 1.20;
        }
        System.out.println(distance);
    }
}
