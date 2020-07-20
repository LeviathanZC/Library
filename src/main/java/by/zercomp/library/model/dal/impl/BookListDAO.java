package by.zercomp.library.model.dal.impl;

import by.zercomp.library.model.dal.BookDAO;
import by.zercomp.library.model.dal.repository.BookRepository;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.DAOException;
import by.zercomp.library.model.type.BookTag;

import java.util.ArrayList;
import java.util.Comparator;
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
    public void remove(Book book) {
        BookRepository repo = BookRepository.getInstance();
        repo.remove(book);
    }

    /*
        Попытка использовать Stream API для ускорения разработки :D

     */
    @Override
    public List<Book> sortBooksByTag(BookTag tag) throws DAOException {
        List<Book> sorting = BookRepository.getInstance().getDataContext();
        switch (tag) {
            case ID : {
                return (List<Book>) sorting.stream().sorted(Comparator.comparingInt(Book::getID));
            }
            case TITLE: {
                return (List<Book>) sorting.stream().sorted(Comparator.comparing(Book::getTitle));
            }
            /*
            TODO: разобраться с использованием стримов.
            case AUTHOR: {
                return sorting.stream().sorted(Comparator.comparing(Book::getAuthors));
            }
            */
            case PUBLISHER: {
                return (List<Book>) sorting.stream().sorted(Comparator.comparing(Book::getPublisher));
            }
            default: {
                throw new DAOException("Unsupported operation");
            }
        }
    }
}
