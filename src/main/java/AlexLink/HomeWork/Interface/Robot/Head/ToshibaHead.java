package AlexLink.HomeWork.Interface.Robot.Head;

public class ToshibaHead implements IHead{

    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
