package AlexLink.HomeWork.Metodichka.Task27;

public class Teapot extends KitchenAppliances{

    private int power;
    private boolean light;

    public Teapot(String name, String size, int power, boolean light) {
        super(name, size);
        this.power = power;
        this.light = light;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    @Override
    void turnOn() {
        System.out.println("Чайник включен в сеть");
    }
}
