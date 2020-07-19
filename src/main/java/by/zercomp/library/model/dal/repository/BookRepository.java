package by.zercomp.library.model.dal.repository;

import by.zercomp.library.model.entity.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookRepository {

    private static final BookRepository instance = new BookRepository();

    private BookRepository() {
    }

    public static BookRepository getInstance() {
        return instance;
    }

    /**
     * Context of data - imitation of the storage of books.
     */
    private final List<Book> dataContext = new ArrayList<Book>();

    /**
     * Метод для получения контекста данных.
     * Необходим для предотвращения изменения данных в данном контексте.
     *
     * @return dataContext - list of books.
     */
    public List<Book> getDataContext() {
        return Collections.unmodifiableList(dataContext);
    }

    public void add(Book book) {
        if(dataContext.isEmpty()) {
            book.setId(1);
        } else {
            Book temp = dataContext.get(dataContext.size() - 1);
            book.setId(temp.getID() + 1);
        }
        dataContext.add(book);
    }

    public void remove(Book book) {
        final int bookId = book.getID();
        for (Book item : dataContext) {
            if(item.getID() == bookId) {
                dataContext.remove(item);
            }
        }
    }

}
