package AlexLink.HomeWork.HW3;

//3)Вычислить: 1+2+4+8+...+256

public class Task3 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i++) {
            sum += i;
        }
        System.out.println("Сумма = " + sum);
    }

}
