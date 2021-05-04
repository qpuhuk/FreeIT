package AlexLink.HomeWork.XML;

public class Type {
    private int energy;
    private boolean cooler;
    private Ports port;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public boolean isCooler() {
        return cooler;
    }

    public void setCooler(boolean cooler) {
        this.cooler = cooler;
    }

    public Ports getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = Ports.valueOf(port);
    }

    public Type(int energy, boolean cooler, String port) {
        this.energy = energy;
        this.cooler = cooler;
        this.port = Ports.valueOf(port);
    }

    public enum Ports {
        USB,COM,LPT
    }
}
