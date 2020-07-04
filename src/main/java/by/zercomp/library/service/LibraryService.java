package by.zercomp.library.service;

import by.zercomp.library.entity.Book;

import java.util.List;

public interface LibraryService {

    void addNewBook(Book book);
    Book getBookById(int id);
    List<Book> getAllBooks();
    void replaceBook(Book book);
    void removeBook(Book book);
    void removeBookAtId(int id);
    void removeAllBooks();

}
