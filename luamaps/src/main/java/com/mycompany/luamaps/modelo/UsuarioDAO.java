/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luamaps.modelo;

import java.util.List;
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
    
     /**
     * 
     * @return 
     */
    public List<Usuario> findAll(){
        return super.findAll(Usuario.class);
    }
    
    
    public Usuario find(String correo){
        Usuario u = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "from Usuario where correo = :correo ";
            Query query = session.createQuery(hql);
            query.setParameter("correo", correo);
            u = (Usuario)query.uniqueResult();
            tx.commit();
            
        }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();

        }finally{
            session.close();
        }
        return u;
        
    }
    
    public List<Usuario> ListaXRol(Integer rol){
        List<Usuario> u = null;
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            String hql = "from Usuario  where rol = :rol ";
            Query query = session.createQuery(hql);
            query.setParameter("rol", rol);
            u = (List<Usuario>)query.list();
            tx.commit();
            
        }catch(HibernateException e){
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();

        }finally{
            session.close();
        }
            return u;
     }
    
}
