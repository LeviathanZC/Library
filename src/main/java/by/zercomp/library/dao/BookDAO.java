package by.zercomp.library.dao;

import by.zercomp.library.entity.Book;

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

    //update
    void update(Book book);

    //delete
    void deleteBook(int id);

    void delete(Book book);



}
