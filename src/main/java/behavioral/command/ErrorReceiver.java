package behavioral.command;

public class ErrorReceiver implements Receiver {
    @Override
    public void action(String msg) {
        System.err.println(msg);
    }
}
