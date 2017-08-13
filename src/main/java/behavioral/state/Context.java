package behavioral.state;

public interface Context {
    void setState(State state);
    void withdraw(int amount);
}
