package by.zercomp.library.controller.command.definer;

import by.zercomp.library.controller.command.Command;
import by.zercomp.library.controller.command.CommandType;
import by.zercomp.library.controller.command.impl.BlankCommand;

public class CommandDefiner {

    private CommandDefiner() {
    }

    public static Command define(String action) {
        Command command;
        try {
            command = CommandType.valueOf(action.toUpperCase()).getCommand();
        } catch (IllegalArgumentException ex) {
            command = new BlankCommand();
        }
        return command;
    }
}
