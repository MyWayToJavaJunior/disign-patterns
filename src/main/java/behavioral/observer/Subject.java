package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void notify(Event event) {
        for (Observer observer : observers) observer.notify(event);
    }
}
