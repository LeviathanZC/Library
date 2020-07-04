package by.zercomp.library.dao;

import by.zercomp.library.entity.Book;

import java.util.List;

public interface BookDAO {

    //create
    void add(Book book);

    //read
    Book getBook(int id);

    List<Book> getAll();

    //update
    void update(Book book);

    //delete
    void deleteBook(int id);

    void delete(Book book);

}
