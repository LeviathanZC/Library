package by.zercomp.library.model.service;

import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.type.BookTag;

import java.util.List;

public interface LibraryService {

    void addNew(Book book);
    Book findBookById(int id);
    List<Book> findBookByPublisher(String publisher);
    List<Book> findBookByTitle(String title);
    List<Book> findBookByAuthor(String author);
    List<Book> getAllBooks();
    List<Book> sortBooksBy(BookTag tag);
    void remove(Book book);

}
