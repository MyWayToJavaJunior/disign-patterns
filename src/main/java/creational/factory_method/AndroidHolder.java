package creational.factory_method;

public class AndroidHolder extends Holder {

    @Override
    protected Button getButton() {
        return new Button() {
            @Override
            public void getName() {
                System.out.println("Android Button");
            }
        };
    }
}
