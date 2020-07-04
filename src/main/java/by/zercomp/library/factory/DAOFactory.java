package by.zercomp.library.factory;

import by.zercomp.library.dao.BookDAO;
import by.zercomp.library.dao.impl.BookListDAO;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private DAOFactory() {
    }

    private final BookDAO bookListImpl = new BookListDAO();

    public static DAOFactory getInstance() {
        return instance;
    }

    public BookDAO getBookListDao() {
        return bookListImpl;
    }


}
