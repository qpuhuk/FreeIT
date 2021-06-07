package AlexLink.HomeWork.Metodichka.Task27;

public class Fridge extends KitchenAppliances{
    private int power;
    private int volume;

    public Fridge(String name, String size, int power, int volume) {
        super(name, size);
        this.power = power;
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void turnOn() {
        System.out.println("Холодильник включен");
    }
}

