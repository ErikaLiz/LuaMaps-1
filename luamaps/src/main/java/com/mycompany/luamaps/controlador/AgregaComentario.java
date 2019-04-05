/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luamaps.controlador;

import com.mycompany.luamaps.modelo.Comentario;
import com.mycompany.luamaps.modelo.ComentarioDAO;
import com.mycompany.luamaps.modelo.Marcador;
import com.mycompany.luamaps.modelo.MarcadorDAO;
import com.mycompany.luamaps.modelo.Usuario;
import com.mycompany.luamaps.modelo.UsuarioDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author larachicharo
 */
@ManagedBean
@SessionScoped
public class AgregaComentario {
    private String content;
    private Usuario usuario;
    private int idmarcador;
    private int calificacion;
    

    public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }
    
    public int getIdmarcador() {
        return idmarcador;
    }
    
    public String agregaComentarioUsuarioDummy() {
        Usuario u = new UsuarioDAO().find("dummy@dummy.com");
        System.out.println("Idmarcador - agregaComentario: " + String.valueOf(idmarcador));
        if (idmarcador == 0)
            System.out.println("idmarcador es null");
        else
            System.out.println("idmarcador: " + idmarcador);
        Marcador m = new MarcadorDAO().find(idmarcador);
        Comentario c = new Comentario(m, u, content);
        new ComentarioDAO().save(c);
        return "comentarioExitoso?faces-redirect=true";
    }
    
    public void agregaComentarioDummies() {
        Usuario u = new UsuarioDAO().find("dummy@dummy.com");
        Marcador m = new MarcadorDAO().find(1);
        Comentario c = new Comentario(m, u, content);
        new ComentarioDAO().save(c);
    }
}
