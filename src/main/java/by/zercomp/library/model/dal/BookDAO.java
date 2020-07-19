package by.zercomp.library.model.dal;

import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.DAOException;
import by.zercomp.library.model.type.BookTag;

import java.util.List;

public interface BookDAO {

    //create
    void add(Book book);

    //read
    Book findBookById(int id);
    List<Book> findBookByPublisher(String publisher);
    List<Book> findBookByTitle(String title);
    List<Book> findBookByAuthor(String author);

    List<Book> getAll();
    List<Book> sortBooksByTag(BookTag tag);
    
    //update
    void update(Book book);

    //delete
    void remove(Book book) throws DAOException;

}
