package AlexLink.HomeWork.AbstractClass;

public abstract class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String model;

    public Transport(int power, int maxSpeed, int weight, String model) {
        setPower(power);
        setMaxSpeed(maxSpeed);
        setWeight(weight);
        setModel(model);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power > 0 && power < 5000)
            this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0 && maxSpeed < 2000)
            this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0 && weight < 50000)
            this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.equals("Audi") || model.equals("Toyota") || model.equals("Chevrolet"))
            this.model = model;
    }

    double calcPower(int power) {
            return power * 0.74;
    }

    @Override
    public String toString() {
        return ", power = " + power + " hp" +
                ", maxSpeed = " + maxSpeed + " km/h" +
                ", weight = " + weight + " kg" +
                ", model = '" + model + '\'' +
                '}';
    }

    abstract void getInfo();

}
