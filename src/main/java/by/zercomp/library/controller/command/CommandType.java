package by.zercomp.library.controller.command;

public enum CommandType {

    ADD_BOOK, REMOVE_BOOK, FIND_BOOK, SORT_BOOK;
    private Command command;

    CommandType(Command command) {
        this.command = command;
    }

    public Command getCommand(){
        return this.command;
    }
}
