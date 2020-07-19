package by.zercomp.library.model.converter;

import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.entity.BookDTO;
import by.zercomp.library.model.exception.InvalidModelException;

import static by.zercomp.library.model.creator.BookCreator.getInstance;

@Deprecated
public class BookDTOConverter implements Converter<BookDTO, Book> {

    @Override
    public Book convert(BookDTO book) {
        boolean hasId = book.id > 0;
        boolean hasTitle = (book.title != null);
        boolean hasAuthors = (book.authors != null) && book.authors.length > 0;
        boolean hasPublisher = (book.publisher != null);
        try {
            if (hasId && hasTitle && hasAuthors && hasPublisher) {
                return getInstance().create(book.id, book.title, book.authors, book.publisher);
            } else if (hasId && hasTitle && hasPublisher) {
                return getInstance().create(book.id, book.title, book.publisher);
            } else if (hasId && hasTitle && hasAuthors) {
                return getInstance().create(book.id, book.title, book.authors);
            } else if (hasId && hasTitle) {
                return getInstance().create(book.id, book.title);
            } else if (hasId && hasAuthors) {
                return getInstance().create(book.id, book.authors);
            }
        } catch (InvalidModelException ignore) {

        }
        return null;
    }


}
