package by.zercomp.library.controller.command.impl;

import by.zercomp.library.controller.command.Command;
import by.zercomp.library.controller.command.parameter.RequestParameter;
import by.zercomp.library.controller.command.parameter.ResponseParameter;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.InvalidModelException;
import by.zercomp.library.model.service.impl.LibraryServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindByAuthorCommandImpl implements Command {
    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        Map<String, Object> response = new HashMap<>();
        try {
            List<Book> found = LibraryServiceImpl.getService().findBookByAuthor(
                    (String) params.get(RequestParameter.AUTHORS)
            );
            response.put(ResponseParameter.STATUS, ResponseParameter.STATUS_SUCCESS);
            for (Book item : found) {
                response.put(ResponseParameter.RESULT, item);
            }
        } catch (InvalidModelException ex) {
            response.put(ResponseParameter.STATUS, ResponseParameter.STATUS_FAIL);
        }
        return response;
    }
}
