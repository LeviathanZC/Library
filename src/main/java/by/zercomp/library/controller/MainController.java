package by.zercomp.library.controller;

import by.zercomp.library.model.factory.HibernateSessionFactoryUtil;

public class MainController {

    public static void main(String[] args) {
        HibernateSessionFactoryUtil.getSessionFactory();
    }
}
