package by.zercomp.library.model.repository;

import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.factory.DAOFactory;
import by.zercomp.library.model.type.BookTag;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> bookList = new ArrayList<Book>();

    //stubs
    public void addBook(Book book) {
        DAOFactory.getInstance().getBookListDao().add(book);
    }

    public void removeBook(Book book) {

    }

    public List<Book> findByTag(BookTag tag) {
        return null;
    }

    public List<Book> sortByTag(BookTag tag) {
        return null;
    }

}
