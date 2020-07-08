package by.zercomp.library.controller.console;

import by.zercomp.library.model.exception.InvalidDataException;

public interface ConsoleReader {

    String takeRequest() throws InvalidDataException;

}
