package AlexLink.HomeWork.HW2;

/*double averageSum = 0;
        double sum = 0;
        int n = 0;
        int x = (int)(Math.random() * 20);
        while(x != 0) {
        sum += x;
        n ++;
        x = (int)(Math.random()*20);
        }
        if(n != 0){
        averageSum = sum / n;
        } else {
        averageSum = 0;
        }
        System.out.println("среднее:" + averageSum);

        Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.
        */

public class Task9 {
    public static void main(String[] args) {
        double averageSum = 0;
        double mult = 1.0;
        int n = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            mult *= x;
            n++;
            x = (int) (Math.random() * 20);
        }
        if (n != 0) {
            averageSum = mult / n;
        } else {
            averageSum = 0;
        }
        System.out.println("Cреднее:" + averageSum);
    }
}
