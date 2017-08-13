package behavioral.state;

public interface State {
    void withdraw(Context context, int cash, int amount);
    void print();
}
