/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luamaps.controlador;

import com.mycompany.luamaps.modelo.Comentario;
import com.mycompany.luamaps.modelo.ComentarioDAO;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author larachicharo
 */
@ManagedBean
public class AgregaComentario {
    private String content;
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return content;
    }
    
    /*public void agregaComment() {
        Comentario c = new Comentario(content);
        ComentarioDAO cdao = new ComentarioDAO();
        cdao.save(c);
    }*/
}
