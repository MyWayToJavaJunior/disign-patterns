package creational.factory_method;

public abstract class Holder {
    public Holder() {
        getButton().getName();
    }

    protected abstract Button getButton();
}
