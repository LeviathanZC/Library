package by.zercomp.library.controller;

import by.zercomp.library.controller.console.ConsoleReader;
import by.zercomp.library.model.exception.InvalidModelException;


public class LibraryApp {

    public LibraryApp() {
    }

    private boolean running = true;

    public void run() {
        String request = "";
        while (running) {
            MenuView.show();
            try {

                request = ConsoleReader.getInstance().takeRequest();
            } catch (InvalidModelException e) {
                new ErrorView(e.getMessage());
            }
            if(isCloseRequest(request)) {
                running = false;
            }

        }
    }

    private boolean isCloseRequest(String req) {
        return req.equals("0");
    }

}
