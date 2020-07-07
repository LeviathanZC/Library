package by.zercomp.library.model.dao.impl;

import by.zercomp.library.model.dao.BookDAO;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.type.BookTag;

import java.util.List;

public class BookListDAO implements BookDAO {


    @Override
    public void add(Book book) {

    }

    @Override
    public Book findBookByTag(BookTag tag) {
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
