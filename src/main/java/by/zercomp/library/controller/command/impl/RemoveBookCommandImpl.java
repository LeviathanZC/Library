package by.zercomp.library.controller.command.impl;

import by.zercomp.library.controller.command.Command;
import by.zercomp.library.controller.command.parameter.RequestParameter;
import by.zercomp.library.controller.command.parameter.ResponseParameter;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.InvalidModelException;
import by.zercomp.library.model.service.impl.LibraryServiceImpl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveBookCommandImpl implements Command {
    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        Map<String, Object> response = new HashMap<>();
        Book book = new Book(
                (int) params.get(RequestParameter.ID),
                (String) params.get(RequestParameter.TITLE),
                Arrays.asList((String[]) params.get(RequestParameter.AUTHORS)),
                (String) params.get(RequestParameter.PUBLISHER)
        );
        try {
            LibraryServiceImpl.getService().remove(book);
            response.put(ResponseParameter.STATUS, ResponseParameter.STATUS_SUCCESS);
        } catch (InvalidModelException e) {
            response.put(ResponseParameter.STATUS, ResponseParameter.STATUS_FAIL);
        }
        return response;
    }
}
