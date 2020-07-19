package by.zercomp.library.model.dal.impl;

import by.zercomp.library.model.dal.BookDAO;
import by.zercomp.library.model.dal.repository.BookRepository;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.DAOException;
import by.zercomp.library.model.type.BookTag;

import java.util.List;

public class BookListDAO implements BookDAO {

    @Override
    public void add(Book book) {
        BookRepository.getInstance().getDataContext().add(book);
    }

    @Override
    public Book findBookById(int id) {

        return null;
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


    }

    @Override
    public List<Book> getAll() {
        return BookRepository.getInstance().getDataContext();
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
    public void remove(Book book) throws DAOException {
        BookRepository repo = BookRepository.getInstance();
        List<Book> books = repo.getDataContext();
        boolean find = false;
        for (Book item : books) {
            if (item.equals(book)) {
                find = true;
            }
        }
        if (find == false) {
            throw new DAOException();
        }
        repo.remove(book);
    }
}
