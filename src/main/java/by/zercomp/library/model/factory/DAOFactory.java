package by.zercomp.library.model.factory;

import by.zercomp.library.model.dal.BookDAO;
import by.zercomp.library.model.dal.impl.BookListDAO;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private DAOFactory() {
    }

    private final BookDAO bookListImpl = new BookListDAO();
    //one more pf BookDAO jsonDAOImpl .. or
    //one more pf BookDAO sqlDAOImpl ...

    public static DAOFactory getInstance() {
        return instance;
    }

    //for new dao need to add enum DAOType with enumeration of the DAOs
    //and refactor this method
    public BookDAO getBookListDao() {
        return bookListImpl;
    }


}
