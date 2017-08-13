package creational.factory_method;

public class iOSHolder extends Holder {

    @Override
    protected Button getButton() {
        return new Button() {
            @Override
            public void getName() {
                System.out.println("iOS Button");
            }
        };
    }
}
