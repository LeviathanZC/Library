package by.zercomp.library.model.dal.impl;

import by.zercomp.library.model.dal.BookDAO;
import by.zercomp.library.model.dal.repository.BookRepository;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.type.BookTag;

import java.util.List;

public class BookListDAO implements BookDAO {

    @Override
    public void add(Book book) {
        // TODO: 8.07.20 implement addBook
    }

    @Override
    public Book findBookByTag(BookTag tag) {
        // TODO: 8.07.20 implement findBookByTag
        return null;
    }

    @Override
    public List<Book> getAll() {
        // TODO: 8.07.20 implement getAll
        return null;
    }

    @Override
    public List<Book> sortBooksByTag(BookTag tag) {
        // TODO: 8.07.20 implement sortBooksByTag
        return null;
    }


    @Override
    public void update(Book book) {
        // TODO: 8.07.20 implement updateBook
    }

    @Override
    public void removeBook(int id) {
        // TODO: 8.07.20 implement removeBookById
    }

    @Override
    public void remove(Book book) {
        BookRepository repo = BookRepository.getInstance();
        List<Book> books = repo.getDataContext();


        // TODO: 8.07.20 implement removeBook
    }
}
