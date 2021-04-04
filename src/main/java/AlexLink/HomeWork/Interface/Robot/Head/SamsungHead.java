package AlexLink.HomeWork.Interface.Robot.Head;

public class SamsungHead implements IHead {

    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead () {
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
