package AlexLink.HomeWork.Exception;

public class Car {
    private String brand;
    private int speed;
    private double price;

    public Car() {
    }

    public Car(String brand, int speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() throws StartException {
        int random = (int) (Math.random() * 21);
        if (random % 2 == 0) {
            throw new StartException("Error, impossible start engine");
        } else {
            System.out.println("The " + getBrand() + " was started successfully");
        }
    }
}
