package behavioral.state;

public class OutOfCashState implements State {
    @Override
    public void withdraw(Context context, int cash, int amount) {
        if (cash - amount > 0) {
            context.setState(new NormalState());
        }
    }

    @Override
    public void print() {
        System.out.println("Out of cash");
    }
}
