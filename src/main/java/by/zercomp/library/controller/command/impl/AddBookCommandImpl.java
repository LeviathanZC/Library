package by.zercomp.library.controller.command.impl;

import by.zercomp.library.controller.command.Command;
import by.zercomp.library.controller.command.parameter.RequestParameter;
import by.zercomp.library.model.creator.BookCreator;
import by.zercomp.library.model.entity.Book;

import java.util.HashMap;
import java.util.Map;

public class AddBookCommandImpl implements Command {
    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        Map<String, Object> response = new HashMap<>();
        Book book = new Book(
                (String) params.get(RequestParameter.TITLE),
                (String[]) params.get(RequestParameter.AUTHORS),
                (String) params.get(RequestParameter.PUBLISHER)
        );
        
    }
}
