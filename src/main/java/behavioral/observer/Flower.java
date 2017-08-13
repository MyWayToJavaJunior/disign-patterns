package behavioral.observer;

import java.awt.*;

public class Flower implements Observer {
    @Override
    public void notify(Event event) {
        switch (event) {
            case SUNRISE:
                System.out.println("Flowers open");
                break;
            case SUNSET:
                System.out.println("Flowers close");
                break;
        }
    }
}
