package AlexLink.HomeWork.AbstractClass;

public class MilitaryPlane extends FlyTransport {

    private boolean availableEjectionSystem;
    private int countRocket;

    public MilitaryPlane(int power, int maxSpeed, int weight, String model, int wingspan, int minLengthRunway, boolean availableEjectionSystem, int countRocket) {
        super(power, maxSpeed, weight, model, wingspan, minLengthRunway);
        this.availableEjectionSystem = availableEjectionSystem;
        this.countRocket = countRocket;
    }

    public boolean isAvailableEjectionSystem() {
        return availableEjectionSystem;
    }

    public void setAvailableEjectionSystem(boolean availableEjectionSystem) {
        this.availableEjectionSystem = availableEjectionSystem;
    }

    public int getCountRocket() {
        return countRocket;
    }

    public void setCountRocket(int countRocket) {
        if (countRocket > 0 && countRocket < 20)
            this.countRocket = countRocket;
    }

    @Override
    public String toString() {
        return "MilitaryPlane { " +
                "availableEjectionSystem = " + availableEjectionSystem +
                ", countRocket = " + countRocket +
                super.toString();
    }

    void getInfo() {
        System.out.println(toString());
    }

    void checkRocket() {
        if (countRocket > 0) {
            System.out.println("Ракета пошла…");
            countRocket--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    void checkEjection() {
        System.out.println(availableEjectionSystem ? "Катапультирование прошло успешно" : "У вас нет такой системы");
    }
}
