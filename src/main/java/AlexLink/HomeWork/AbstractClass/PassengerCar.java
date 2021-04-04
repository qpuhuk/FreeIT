package AlexLink.HomeWork.AbstractClass;

public class PassengerCar extends GroundTransport {

    private String bodyType;
    private int countPassengers;

    public PassengerCar(int power, int maxSpeed, int weight, String model, int countWheel, int fuelConsumption, String bodyType, int countPassengers) {
        super(power, maxSpeed, weight, model, countWheel, fuelConsumption);
        this.bodyType = bodyType;
        if (countPassengers > 0 && countPassengers < 19) this.countPassengers = countPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        if (countPassengers > 0 && countPassengers < 19)
            this.countPassengers = countPassengers;
    }


    @Override
    public String toString() {
        return "PassengerCar { " +
                "bodyType = '" + bodyType + '\'' +
                ", countPassengers = " + countPassengers + " person" +
                ", power in kB = " + calcPower(getPower()) + " кВ" +
                super.toString();
    }

    void getInfo() {
        System.out.println(toString());
    }

    int maxDistance(int hours) {
        return getMaxSpeed() * hours;
    }

    private int Fuel(int hours) {
        return getFuelConsumption() * hours;
    }

    int getFuel(int hours) {
        return Fuel(hours);

    }
}
