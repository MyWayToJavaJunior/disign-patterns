package behavioral.observer;

import java.awt.*;

@FunctionalInterface
public interface Observer {
    void notify(Event event);
}
