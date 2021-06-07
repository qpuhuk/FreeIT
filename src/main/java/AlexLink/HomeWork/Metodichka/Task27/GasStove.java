package AlexLink.HomeWork.Metodichka.Task27;

public class GasStove extends KitchenAppliances{

    private int square;
    private int countFire;

    public GasStove(String name, String size, int square, int countFire) {
        super(name, size);
        this.square = square;
        this.countFire = countFire;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getCountFire() {
        return countFire;
    }

    public void setCountFire(int countFire) {
        this.countFire = countFire;
    }

    @Override
    void turnOn() {
        System.out.println("Газовая плита включена");
    }
}
