package by.zercomp.library.model.service;

import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.InvalidModelException;
import by.zercomp.library.model.type.BookTag;

import java.util.List;

public interface LibraryService {

    void addNew(Book book) throws InvalidModelException;
    Book findBookById(int id) throws InvalidModelException;
    List<Book> findBookByPublisher(String publisher) throws InvalidModelException;
    List<Book> findBookByTitle(String title) throws InvalidModelException;
    List<Book> findBookByAuthor(String author) throws InvalidModelException;
    List<Book> getAllBooks();
    List<Book> sortBooksBy(BookTag tag);
    void remove(Book book);

}
