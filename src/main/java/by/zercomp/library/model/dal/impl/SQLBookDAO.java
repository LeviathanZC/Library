package by.zercomp.library.model.dal.impl;

import by.zercomp.library.model.dal.BookDAO;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.DAOException;
import by.zercomp.library.model.type.BookTag;

import java.util.List;

public class SQLBookDAO implements BookDAO {



    public void add(Book book) {

    }

    public Book findBookById(int id) throws DAOException {
        return null;
    }

    public List<Book> findBooksByPublisher(String publisher) {
        return null;
    }

    public List<Book> findBooksByTitle(String title) {
        return null;
    }

    public List<Book> findBooksByAuthor(String author) {
        return null;
    }

    public List<Book> getAll() {
        return null;
    }

    public List<Book> sortBooksByTag(BookTag tag) throws DAOException {
        return null;
    }

    public void remove(Book book) {

    }
}
