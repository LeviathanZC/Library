package by.zercomp.library.model.creator;

import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.InvalidModelException;

public class BookCreator {

    private static BookCreator instance = new BookCreator();

    private BookCreator() {
    }

    public static BookCreator getInstance() {
        return null;
    }

    public Book create(int id) throws InvalidModelException {
        return this.create(id, "");
    }

    public Book create(int id, String[] authors) throws InvalidModelException {
        return this.create(id,"", authors);
    }

    public Book create(int id, String title) throws InvalidModelException {
        return this.create(id, title, "");
    }

    public Book create(int id, String title, String[] authors) throws InvalidModelException {
        return this.create(id, title, authors, "");
    }

    public Book create(int id, String title, String publisher) throws InvalidModelException {
        return this.create(id, title, new String[0], publisher);
    }

    public Book create(int id, String title, String[] authors, String publisher) throws InvalidModelException {
        if(id > 0 || title == null || authors == null || publisher == null) {
            throw new InvalidModelException("args must be not null");
        }
        return new Book(id, title, authors, publisher);
    }
}
