package by.zercomp.library.model.converter;

import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.entity.BookDTO;

@Deprecated
public class BookConverter implements Converter<Book, BookDTO> {

    @Override
    public BookDTO convert(Book book) {
        return null;
    }
    
}
