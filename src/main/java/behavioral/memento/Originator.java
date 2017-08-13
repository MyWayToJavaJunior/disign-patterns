package behavioral.memento;

public class Originator {
    private String text = "";

    public Originator() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Memento save() {
        return new Memento(text);
    }

    public void undo(Memento memento) {
        text = memento.getState();
    }
}
