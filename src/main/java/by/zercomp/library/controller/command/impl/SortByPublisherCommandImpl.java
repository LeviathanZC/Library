package by.zercomp.library.controller.command.impl;

import by.zercomp.library.controller.command.Command;
import by.zercomp.library.controller.command.parameter.ResponseParameter;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.InvalidModelException;
import by.zercomp.library.model.service.impl.LibraryServiceImpl;
import by.zercomp.library.model.type.BookTag;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByPublisherCommandImpl implements Command {
    @Override
    public Map<String, Object> execute(Map<String, Object> params) {
        Map<String, Object> response = new HashMap<>();
        try {
            List<Book> sorted = LibraryServiceImpl.getService().sortBooksBy(BookTag.PUBLISHER);
            response.put(ResponseParameter.STATUS, ResponseParameter.STATUS_SUCCESS);
            for (Book item : sorted) {
                response.put(ResponseParameter.RESULT, item);
            }
        } catch (InvalidModelException e) {
            response.put(ResponseParameter.STATUS, ResponseParameter.STATUS_FAIL);
        }
        return response;
    }
}
