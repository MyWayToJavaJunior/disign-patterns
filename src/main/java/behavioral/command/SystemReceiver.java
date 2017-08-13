package behavioral.command;

public class SystemReceiver implements Receiver {
    @Override
    public void action(String msg) {
        System.out.println(msg);
    }
}
