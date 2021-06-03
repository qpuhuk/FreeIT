package AlexLink.HomeWork.AbstractClass;

public class PassengerPlane extends FlyTransport {

    private int countPassengers;
    private boolean availableBusinessClass;

    public PassengerPlane(int power, int maxSpeed, int weight, String model, int wingspan, int minLengthRunway, int countPassengers, boolean availableBusinessClass) {
        super(power, maxSpeed, weight, model, wingspan, minLengthRunway);
        this.countPassengers = countPassengers;
        this.availableBusinessClass = availableBusinessClass;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        if (countPassengers > 10 && countPassengers < 400)
            this.countPassengers = countPassengers;
    }

    public boolean isAvailableBusinessClass() {
        return availableBusinessClass;
    }

    public void setAvailableBusinessClass(boolean availableBusinessClass) {
        this.availableBusinessClass = availableBusinessClass;
    }

    @Override
    public String toString() {
        return "PassengerPlane { " +
                "countPassengers = " + countPassengers + " person" +
                ", availableBusinessClass = " + availableBusinessClass +
                ", power in kB = " + calcPower(getPower()) + " кВ" +
                super.toString();
    }

    void getInfo() {
        System.out.println(toString());
    }

    void checkCapacity(int countPassengers) {
        System.out.println(this.countPassengers > countPassengers ? "Самолет загружен" : "Вам нужен самолет побольше");
    }
}
