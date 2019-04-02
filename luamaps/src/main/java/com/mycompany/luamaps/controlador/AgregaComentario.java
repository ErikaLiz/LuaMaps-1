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

/**
 *
 * @author larachicharo
 */
@ManagedBean
public class AgregaComentario {
    private String content;
    private Usuario usuario;
    private Marcador marcador;
    private int calificacion;
    

    public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
    
    public void agregaComentarioDummies() {
        Usuario u = new UsuarioDAO().find("dummy@dummy.com");
        Marcador m = new MarcadorDAO().find(1);
        Comentario c = new Comentario(m, u, content);
        new ComentarioDAO().save(c);
    }
}
