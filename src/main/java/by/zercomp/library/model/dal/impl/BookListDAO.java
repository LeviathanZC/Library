package by.zercomp.library.model.dal.impl;

import by.zercomp.library.model.dal.BookDAO;
import by.zercomp.library.model.dal.repository.BookRepository;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.DAOException;
import by.zercomp.library.model.type.BookTag;

import java.util.ArrayList;
import java.util.List;

public class BookListDAO implements BookDAO {

    @Override
    public void add(Book book) {
        BookRepository.getInstance().getDataContext().add(book);
    }

    @Override
    public Book findBookById(int id) throws DAOException {
        List<Book> searchList = getAll();
        for (Book item : searchList) {
            if (item.getID() == id) {
                return item;
            }
        }
        throw new DAOException();
    }

    @Override
    public List<Book> findBooksByPublisher(String publisher) {
        List<Book> response = new ArrayList<>();
        List<Book> searchList = getAll();
        for (Book item : searchList) {
            if (item.getPublisher().equals(publisher)) {
                response.add(item);
            }
        }
        return response;
    }

    @Override
    public List<Book> findBooksByTitle(String title) {
        List<Book> response = new ArrayList<>();
        List<Book> searchList = getAll();
        for (Book item : searchList) {
            if (title.equals(item.getTitle())) {
                response.add(item);
            }
        }
        return response;
    }

    @Override
    public List<Book> findBooksByAuthor(String author) {
        List<Book> responce = new ArrayList<>();
        List<Book> searchList = getAll();
        for (Book item : searchList) {
            for (String target : item.getAuthors()) {
                if(author.equals(target)) {
                    responce.add(item);
                }
            }
        }
        return responce;
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
