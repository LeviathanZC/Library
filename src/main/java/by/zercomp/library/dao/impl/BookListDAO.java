package by.zercomp.library.dao.impl;

import by.zercomp.library.dao.BookDAO;
import by.zercomp.library.entity.Book;
import by.zercomp.library.enumeration.BookTag;

import java.util.List;

public class BookListDAO implements BookDAO {


    @Override
    public void add(Book book) {

    }

    @Override
    public Book findBookById(int id) {
        return null;
    }

    @Override
    public Book findBookByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> findBooksByPublisher(String publisher) {
        return null;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public List<Book> sortBooksByTag(BookTag tag) {
        return null;
    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void removeBook(int id) {

    }

    @Override
    public void remove(Book book) {

    }
}
