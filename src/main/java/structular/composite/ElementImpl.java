package structular.composite;

public class ElementImpl implements Element {
    private final String value;
    private int position;

    public ElementImpl(String value, int position) {
        this.value = value;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public void move(int position) {
        this.position -= position;
    }

    @Override
    public String toString() {
        return value;
    }
}
