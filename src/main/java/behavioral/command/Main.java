package behavioral.command;

import java.util.Timer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Invoker invoker = new Invoker();
        invoker.add(new Command2Receiver(new SystemReceiver(), "Hello"));
        invoker.add(new Command2Receiver(new ErrorReceiver(), "World"));
        invoker.add(new Command2Receiver(new ErrorReceiver(), "Hello!"));
        invoker.add(new Command2Receiver(new SystemReceiver(), "Yeap!"));

        Thread.sleep(1000);

        invoker.exec();
    }
}
