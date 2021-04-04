package AlexLink.HomeWork.AbstractClass;

public class CargoCar extends GroundTransport {

    private int loadCapacity;

    public CargoCar(int power, int maxSpeed, int weight, String model, int countWheel, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, model, countWheel, fuelConsumption);
        if (loadCapacity > 0 && loadCapacity < 10000) this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        if (loadCapacity > 0 && loadCapacity < 10000)
            this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "CargoCar { " +
                "loadCapacity = " + loadCapacity + " kg" +
                ", power in kB = " + calcPower(getPower()) + " кВ" +
                super.toString();
    }

    void getInfo() {
        System.out.println(toString());
    }

    void checkCapacity(int weight) {
        System.out.println(loadCapacity > weight ? "Грузовик загружен" : "Вам нужен грузовик побольше");
    }
}

//Для грузового разработать метод который проверит можно ли загрузить в него xxx  груза
//Метод должен проверять если это кол-во груза помещается в грузовик то выводит в консоль ”Грузовик загружен”,
// если кол-во груза которое нужно загрузить больше чем то которое может влезть в наш грузовик то выводим
// “Вам нужен грузовик побольше ”.
