package by.zercomp.library.controller.command.impl;

import by.zercomp.library.controller.command.Command;
import by.zercomp.library.controller.command.parameter.RequestParameter;
import by.zercomp.library.controller.command.parameter.ResponseParameter;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.InvalidModelException;
import by.zercomp.library.model.service.impl.LibraryServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class FindByIDCommandImpl implements Command {
    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        Map<String, Object> response = new HashMap<>();
        try {
            Book book = LibraryServiceImpl.getService().findBookById(
                    (int) params.get(RequestParameter.ID)
            );
            response.put(ResponseParameter.STATUS, ResponseParameter.STATUS_SUCCESS);
            response.put(ResponseParameter.RESULT, book);
        } catch (InvalidModelException ex) {
            response.put(ResponseParameter.STATUS, ResponseParameter.STATUS_FAIL);
        }
        return response;
    }
}
