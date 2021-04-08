package AlexLink.HomeWork.HW7.Payment;

public class Payment {
    Product product;
    Product product2;
    Product product3;
    private int count;

    public int getCount() {
        return count;
    }

    public void setProduct(String name, int price) {
        this.product = new Product(name, price);
    }

    public void setProduct2(String name, int price) {
        this.product2 = new Product(name, price);
    }

    public void setProduct3(String name, int price) {
        this.product3 = new Product(name, price);
    }

    @Override
    public String toString() {
        return "Продукты в корзине: \n" +
                product + product2 + product3 +
                "Количество продуктов в корзине = " + count;
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
            return nameProduct + " - цена продукта = " + priceProduct + "р.\n";
        }
    }
}
