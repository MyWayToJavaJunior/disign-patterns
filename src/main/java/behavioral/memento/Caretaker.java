package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    public Caretaker() {
    }

    public List<Memento> getMementos() {
        return mementos;
    }
}
