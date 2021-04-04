package AlexLink.HomeWork.InterfaceCosmos;

public class Shuttle implements IStart {
    @Override
    public boolean checkSystem() {
        int random = (int) (Math.random() * 10);
        if (random > 3)
            return true;
        else
            return false;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");

    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
