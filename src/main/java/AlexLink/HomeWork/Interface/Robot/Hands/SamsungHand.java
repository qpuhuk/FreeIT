package AlexLink.HomeWork.Interface.Robot.Hands;

public class SamsungHand implements IHand{

    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимает руку Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
