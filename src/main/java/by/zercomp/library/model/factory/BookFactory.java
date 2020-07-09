package by.zercomp.library.model.factory;

import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.entity.BookDTO;
import by.zercomp.library.model.exception.InvalidDataException;

public class BookFactory {

    private static BookFactory instance = new BookFactory();

    private BookFactory() {
    }

    public static BookFactory getInstance() {
        return null;
    }

    public Book create() {
        return null;
    }

    public Book create(int id, String title, String[] authors, String publisher) throws InvalidDataException {
        if(id == 0 || title == null || authors == null || publisher == null) {
            throw new InvalidDataException("args must be not null");
        }
        return new Book(id, title, authors, publisher);
    }

    public BookDTO makeDTOfrom(Book book) {
        BookDTO dto = new BookDTO();
        dto.id = book.getID();
        dto.authors = book.getAuthors();
        dto.publisher = book.getPublisher();
        dto.title = book.getTitle();
        return dto;
    }

}
