package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    public void exec() {
        for (Command command : commands) command.execute();
        commands = new ArrayList<>();
    }
}
