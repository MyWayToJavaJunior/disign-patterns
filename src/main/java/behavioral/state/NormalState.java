package behavioral.state;

public class NormalState implements State {
    @Override
    public void withdraw(Context context, int cash, int amount) {
        if (cash - amount < 0) {
            context.setState(new OutOfCashState());
        }
    }

    @Override
    public void print() {
        System.out.println("Withdraw");
    }
}
