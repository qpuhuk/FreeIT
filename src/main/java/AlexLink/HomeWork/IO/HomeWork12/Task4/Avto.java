package AlexLink.HomeWork.IO.HomeWork12.Task4;

import java.io.Serializable;

public class Avto implements Serializable {

    private static final long serialVersionUID = 12L;

    private String brand;
    private int price;
    private Speed speed;

    public Avto(String brand, int price, int speed) {
        this.brand = brand;
        this.price = price;
        this.speed = new Speed(speed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Avto{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
