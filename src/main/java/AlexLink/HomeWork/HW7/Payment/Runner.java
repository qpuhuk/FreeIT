package AlexLink.HomeWork.HW7.Payment;

//Создать класс Payment с внутренним классом, с помощью объектов кото-
//рого можно сформировать покупку из нескольких товаров.

public class Runner {
    public static void main(String[] args) {

        Payment payment = new Payment();

        payment.setProduct("Кефир", 2);
        payment.setProduct2("Сыр", 4);
        payment.setProduct3("Творог", 2);
        System.out.println(payment.toString());

        System.out.println("********************************************");

        Payment.Product bread = payment. new Product("Хлеб", 1);
        Payment.Product milk = payment. new Product("Молоко", 2);
        Payment.Product meat = payment. new Product("Мясо", 8);

        System.out.println("А так же:\n" +
                bread +
                milk +
                meat +
                "Количество продуктов в корзине = " + payment.getCount());
    }
}
