package by.zercomp.library.model.dal;

import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.DAOException;
import by.zercomp.library.model.type.BookTag;

import java.util.List;

public interface BookDAO {

    //create
    void add(Book book);

    //read
    Book findBookById(int id) throws DAOException;
    List<Book> findBooksByPublisher(String publisher);
    List<Book> findBooksByTitle(String title);
    List<Book> findBooksByAuthor(String author);

    List<Book> getAll();
    List<Book> sortBooksByTag(BookTag tag);

    //delete
    void remove(Book book) throws DAOException;

}
