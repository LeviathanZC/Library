package by.zercomp.library.controller.console.impl;

import by.zercomp.library.controller.console.ConsoleReader;
import by.zercomp.library.model.exception.InvalidDataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleReaderImpl implements ConsoleReader {

    private static ConsoleReaderImpl instance = new ConsoleReaderImpl(System.in);

    private ConsoleReaderImpl(InputStream is) {
        this.reader = new BufferedReader(new InputStreamReader(is));
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
