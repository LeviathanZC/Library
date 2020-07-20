package by.zercomp.library.controller;

import by.zercomp.library.model.exception.InvalidModelException;
import by.zercomp.library.model.factory.HibernateSessionFactoryUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainController {

    public static void main(String[] args) throws InvalidModelException {
        HibernateSessionFactoryUtil.getSessionFactory();
    }
}
