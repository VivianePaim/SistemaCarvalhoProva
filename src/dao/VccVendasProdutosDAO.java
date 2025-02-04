/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VccVenda;
import bean.VccVendasProdutos;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author caviv
 */
public class VccVendasProdutosDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(VccVendasProdutos.class);
        criteria.add(Restrictions.eq("id", id));
        ArrayList lista = (ArrayList) criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    public Object listProdutos(VccVenda venda) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VccVendasProdutos.class);
        criteria.add(Restrictions.eq("vccVenda", venda));
        ArrayList lista = (ArrayList) criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VccVendasProdutos.class);
        ArrayList lista = (ArrayList) criteria.list();
        session.getTransaction().commit();
        return lista;

    }
}
