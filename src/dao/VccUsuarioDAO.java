/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VccUsuario;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author caviv
 */
public class VccUsuarioDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VccUsuario.class);
        criteria.add(Restrictions.eq("id", id));
        ArrayList lista = (ArrayList) criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VccUsuario.class);
        ArrayList lista = (ArrayList) criteria.list();
        session.getTransaction().commit();
        return lista;

    }
}
