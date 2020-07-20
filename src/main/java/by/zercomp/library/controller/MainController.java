package by.zercomp.library.controller;

import by.zercomp.library.model.dal.BookDAO;
import by.zercomp.library.model.dal.impl.SQLBookDAO;
import by.zercomp.library.model.factory.HibernateSessionFactoryUtil;

public class MainController {

    public static void main(String[] args) {
        BookDAO sql = new SQLBookDAO();
        sql.getAll();
    }
}
