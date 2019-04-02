/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luamaps.modelo;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author marco
 */
public class UsuarioDAO extends AbstractDAO<Usuario> {
    public UsuarioDAO(){
         super();    
    }
    
    public void save(Usuario u) {
        super.save(u);
    }
    
    public void update(Usuario u) {
        super.update(u);
    }
    
    /*public Usuario find(String email) {
        return super.findByEmail(Usuario.class, email);
    }*/
    
    public Usuario find(String email){
        Usuario us = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String hql = "From Usuario u where u.correo= :email";
            Query query = session.createQuery(hql);
            query.setParameter("email", email);
            us = (Usuario)query.uniqueResult();
            tx.commit();
        } catch(HibernateException e) {
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return us;
    }
    
}
