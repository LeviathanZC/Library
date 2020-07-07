package by.zercomp.library.model.service;

import by.zercomp.library.model.entity.Book;

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
