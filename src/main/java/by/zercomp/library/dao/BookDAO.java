package by.zercomp.library.dao;

import by.zercomp.library.entity.Book;
import by.zercomp.library.enumeration.BookTag;

import java.util.List;

public interface BookDAO {

    //create
    void add(Book book);

    //read
    Book findBookById(int id);
    Book findBookByTitle(String title);
    List<Book> findBooksByPublisher(String publisher);
    List<Book> findBooksByAuthor(String author);
    List<Book> getAll();
    
    List<Book> sortBooksByTag(BookTag tag);

    //update
    void update(Book book);

    //delete
    void removeBook(int id);

    void remove(Book book);



}
