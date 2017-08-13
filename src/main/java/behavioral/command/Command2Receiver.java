package behavioral.command;

public class Command2Receiver implements Command {
    private Receiver receiver;
    private String message;

    public Command2Receiver(Receiver receiver, String message) {
        this.receiver = receiver;
        this.message = message;
    }

    @Override
    public void execute() {
        receiver.action(message);
    }
}
