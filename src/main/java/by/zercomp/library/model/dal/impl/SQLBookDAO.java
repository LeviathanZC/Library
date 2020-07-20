package by.zercomp.library.model.dal.impl;

import by.zercomp.library.model.dal.BookDAO;
import by.zercomp.library.model.entity.Book;
import by.zercomp.library.model.exception.DAOException;
import by.zercomp.library.model.factory.HibernateSessionFactoryUtil;
import by.zercomp.library.model.type.BookTag;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Collections;
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
        List<Book> response = new ArrayList<>();
        List<Book> all = this.getAll();
        for (Book item : all) {
            if (publisher.equals(item.getPublisher())) {
                response.add(item);
            }
        }
        return response;
    }

    public List<Book> findBooksByTitle(String title) {
        List<Book> response = new ArrayList<>();
        List<Book> all = this.getAll();
        for (Book item : all) {
            if (title.equals(item.getTitle())) {
                response.add(item);
            }
        }
        return response;
    }

    public List<Book> findBooksByAuthor(String author) {
        return null;
    }

    public List<Book> getAll() {
        List<Book> books = Collections.unmodifiableList((List<Book>) HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("From Book")
                .list());
        return books;
    }

    public List<Book> sortBooksByTag(BookTag tag) throws DAOException {
        //stub
        return null;
    }

    public void remove(Book book) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(book);
        transaction.commit();
        session.close();
    }
}
