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
     * @return dataContext - list of books.
     */
    public List<Book> getDataContext() {
        return Collections.unmodifiableList(dataContext);
    }


}
