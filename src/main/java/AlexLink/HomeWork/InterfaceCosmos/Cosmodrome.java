package AlexLink.HomeWork.InterfaceCosmos;

import java.util.concurrent.TimeUnit;

public class Cosmodrome {

    void goStart(IStart iStart) {

        if (!iStart.checkSystem()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            iStart.startEngine();
            for (int i = 10; i > 0; i--) {
                System.out.println(i + "...");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };

            iStart.start();
        }
    }
}

