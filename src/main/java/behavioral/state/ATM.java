package behavioral.state;

public class ATM implements Context {
    private int cash;
    private State state = new NormalState();

    public ATM(int cash) {
        this.cash = cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void withdraw(int amount) {
        state.withdraw(this, cash, amount);
        cash = cash - amount;
        state.print();
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }
}
