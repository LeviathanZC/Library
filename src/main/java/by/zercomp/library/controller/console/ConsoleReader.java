package by.zercomp.library.controller.console;

import by.zercomp.library.model.exception.InvalidDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsoleReader {

    private static ConsoleReader instance = new ConsoleReader(System.in);

    private ConsoleReader(InputStream is) {
        this.reader = new BufferedReader(new InputStreamReader(is));
    }

    public static ConsoleReader getInstance() {
        return instance;
    }

    private BufferedReader reader;

    public String takeRequest() throws InvalidDataException {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new InvalidDataException("exception while reading console", e);
        }
    }

}
