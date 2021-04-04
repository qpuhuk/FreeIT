package AlexLink.HomeWork.AbstractClass;

public abstract class GroundTransport extends Transport {

    private int countWheel;
    private int fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String model, int countWheel, int fuelConsumption) {
        super(power, maxSpeed, weight, model);
        if (countWheel > 1 && countWheel < 9) this.countWheel = countWheel;
        if (fuelConsumption > 1 && fuelConsumption < 40) this.fuelConsumption = fuelConsumption;
    }

    public int getCountWheel() {
        return countWheel;
    }

    public void setCountWheel(int countWheel) {
        if (countWheel > 1 && countWheel < 9)
            this.countWheel = countWheel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption > 1 && fuelConsumption < 40)
            this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return ", countWheel = " + countWheel +
                ", fuelConsumption = " + fuelConsumption + " l/100km" +
                super.toString();
    }


}
