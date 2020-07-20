package by.zercomp.library.model.service.impl;

import by.zercomp.library.model.dal.BookDAO;
import by.zercomp.library.model.dal.impl.BookListDAO;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.DAOException;
import by.zercomp.library.model.exception.InvalidModelException;
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

    private final BookDAO dao = new BookListDAO();

    @Override
    public void addNew(Book book) throws InvalidModelException {
        if (book == null) {
            throw new InvalidModelException();
        }
        dao.add(book);
    }

    @Override
    public Book findBookById(int id) throws InvalidModelException {
        try {
            return dao.findBookById(id);
        } catch (DAOException ex) {
            throw new InvalidModelException(ex);
        }
    }

    @Override
    public List<Book> findBookByPublisher(String publisher) {
        return null;
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> findBookByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public List<Book> sortBooksBy(BookTag tag) {
        return null;
    }

    @Override
    public void remove(Book book) {

    }


}
