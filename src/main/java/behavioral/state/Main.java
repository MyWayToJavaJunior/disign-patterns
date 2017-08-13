package behavioral.state;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(100);

        atm.withdraw(10);
        atm.withdraw(50);
        atm.withdraw(100);
        atm.setCash(1000);
        atm.withdraw(100);
    }
}
