package AlexLink.HomeWork.AbstractClass;

public abstract class FlyTransport extends Transport {

    private int wingspan;
    private int minLengthRunway;

    public FlyTransport(int power, int maxSpeed, int weight, String model, int wingspan, int minLengthRunway) {
        super(power, maxSpeed, weight, model);
        if (wingspan > 10 && wingspan < 60) this.wingspan = wingspan;
        if (minLengthRunway > 50 && minLengthRunway < 500) this.minLengthRunway = minLengthRunway;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan > 10 && wingspan < 100)
            this.wingspan = wingspan;
    }

    public int getMinLengthRunway() {
        return minLengthRunway;
    }

    public void setMinLengthRunway(int minLengthRunway) {
        if (minLengthRunway > 50 && minLengthRunway < 500)
            this.minLengthRunway = minLengthRunway;
    }

    @Override
    public String toString() {
        return ", wingspan = " + wingspan + " metre" +
                ", minLengthRunway = " + minLengthRunway + " metre" +
                super.toString();
    }
}
