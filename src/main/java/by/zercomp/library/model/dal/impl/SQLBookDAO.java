package by.zercomp.library.model.dal.impl;

import by.zercomp.library.model.dal.BookDAO;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.DAOException;
import by.zercomp.library.model.factory.HibernateSessionFactoryUtil;
import by.zercomp.library.model.type.BookTag;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SQLBookDAO implements BookDAO {



    public void add(Book book) throws DAOException {
        try {
            Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
            session.close();
        } catch (HibernateException ex) {
            throw new DAOException(ex);
        }
    }

    public Book findBookById(int id) throws DAOException {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Book.class, id);
    }

    public List<Book> findBooksByPublisher(String publisher) {
        return null;
    }

    public List<Book> findBooksByTitle(String title) {
        return null;
    }

    public List<Book> findBooksByAuthor(String author) {
        return null;
    }

    public List<Book> getAll() {
        return null;
    }

    public List<Book> sortBooksByTag(BookTag tag) throws DAOException {
        return null;
    }

    public void remove(Book book) {

    }
}
