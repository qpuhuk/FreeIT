package AlexLink.HomeWork.Interface.Robot.Legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Делает шаг нога Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
