package by.zercomp.library.view.impl;

import by.zercomp.library.view.View;

public class ErrorView implements View {

    private String message;

    public ErrorView(String msg) {
    }

    @Override
    public void show() {
        System.out.println("");
        System.out.println("msg");
    }
}
