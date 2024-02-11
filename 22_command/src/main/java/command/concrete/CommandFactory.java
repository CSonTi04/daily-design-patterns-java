package command.concrete;

import command.OrderCommand;

public class CommandFactory {

    public enum CommandType {
        ADD,
        MODIFY,
        REMOVE;
    }

    public OrderCommand createCommand(CommandType commandType) {
        return switch (commandType) {
            case ADD -> new AddCommand();
            case MODIFY -> new ModifyCommand();
            case REMOVE -> new RemoveCommand();
        };
    }
}
