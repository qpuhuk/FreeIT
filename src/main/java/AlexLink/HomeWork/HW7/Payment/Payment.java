package AlexLink.HomeWork.HW7.Payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    List<Product> productList;
    private int count;

    public Payment() {
        this.productList = new ArrayList<>();
    }

    public int getCount() {
        return count;
    }

    public void setProduct(String name, int price) {
        productList.add(new Product(name, price));
    }

    @Override
    public String toString() {
        return "Продукты в корзине: \n" +
                productList +
                "\nКоличество продуктов в корзине = " + count;
    }

    class Product {
        private String nameProduct;
        private int priceProduct;

        public Product(String nameProduct, int priceProduct) {
            this.nameProduct = nameProduct;
            this.priceProduct = priceProduct;
            count++;
        }

        @Override
        public String toString() {
            return nameProduct + " - цена продукта = " + priceProduct + "р.";
        }
    }
}
