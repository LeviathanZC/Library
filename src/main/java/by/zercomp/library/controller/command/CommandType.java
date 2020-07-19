package by.zercomp.library.controller.command;

import by.zercomp.library.controller.command.impl.BlankCommand;

public enum CommandType {

    ADD_BOOK(new BlankCommand()), REMOVE_BOOK(new BlankCommand()), FIND_BOOK(new BlankCommand()),
    SORT_BOOK(new BlankCommand());
    private Command command;

    CommandType(Command command) {
        this.command = command;
    }

    public Command getCommand(){
        return this.command;
    }
}
