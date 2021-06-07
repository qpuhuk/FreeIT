package AlexLink.HomeWork.Metodichka.Task27;

public abstract class Appliances {

    private String name;

    public Appliances(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void turnOn();
}
