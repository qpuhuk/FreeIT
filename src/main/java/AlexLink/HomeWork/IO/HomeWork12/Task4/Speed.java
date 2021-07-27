package AlexLink.HomeWork.IO.HomeWork12.Task4;

import java.io.Serializable;

public class Speed implements Serializable {
    private static final long serialVersionUID = 11L;
    public int speed;

    public Speed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Speed{" +
                "speed=" + speed +
                '}';
    }
}
