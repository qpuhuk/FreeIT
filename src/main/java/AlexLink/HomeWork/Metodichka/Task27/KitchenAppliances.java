package AlexLink.HomeWork.Metodichka.Task27;

public abstract class KitchenAppliances extends Appliances{
    private String size;

    public KitchenAppliances(String name, String size) {
        super(name);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    abstract void turnOn();
}
