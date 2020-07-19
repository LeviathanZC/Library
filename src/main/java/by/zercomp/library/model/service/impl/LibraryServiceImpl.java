package by.zercomp.library.model.service.impl;

import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.service.LibraryService;
import by.zercomp.library.model.type.BookTag;

import java.util.List;

public class LibraryServiceImpl implements LibraryService {

    private static final LibraryService service = new LibraryServiceImpl();

    private LibraryServiceImpl() {
    }

    public static LibraryService getService() {
        return service;
    }

    @Override
    public void addNewBook(Book book) {

    }

    @Override
    public Book findBookById(int id) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public List<Book> findBookByTag(BookTag tag) {
        return null;
    }

    @Override
    public void replaceBook(Book book) {

    }

    @Override
    public void removeBook(Book book) {

    }

    @Override
    public void removeBookAtId(int id) {

    }

    @Override
    public void removeAllBooks() {

    }


}
