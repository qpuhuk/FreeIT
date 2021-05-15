package AlexLink.HomeWork.HW7.Payment;

//Создать класс Payment с внутренним классом, с помощью объектов кото-
//рого можно сформировать покупку из нескольких товаров.

public class Runner {
    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.setProduct("Сыр", 4);
        payment.setProduct("Творог", 2);
        payment.setProduct("Кефир", 2);
        payment.setProduct("Хлеб", 1);
        payment.setProduct("Молоко", 2);
        payment.setProduct("Мясо", 8);
        System.out.println(payment);
    }
}
