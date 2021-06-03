package AlexLink.HomeWork.Interface.Robot.Legs;

public class SonyLeg implements ILeg {

    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Делает шаг нога Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

