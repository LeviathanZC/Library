package by.zercomp.library.model.service;

import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.type.BookTag;

import java.util.List;

public interface LibraryService {

    void addNewBook(Book book);
    Book findBookById(int id);
    List<Book> getAllBooks();
    List<Book> findBookByTag(BookTag tag);
    void replaceBook(Book book);
    void removeBook(Book book);
    void removeBookAtId(int id);
    void removeAllBooks();

}
