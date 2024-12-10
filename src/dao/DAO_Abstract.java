package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import tools.HibernateUtil;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public abstract class DAO_Abstract {

    public Session session;

    public DAO_Abstract() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
    }

    public abstract void insert(Object objeto);

    public abstract void update(Object objeto);

    public abstract void delete(Object objeto);

    public abstract Object list(int codigo);

    public abstract ArrayList listAll();
}
