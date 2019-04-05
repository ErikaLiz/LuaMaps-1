/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luamaps.controlador;

import com.mycompany.luamaps.modelo.Comentario;
import com.mycompany.luamaps.modelo.Marcador;
import com.mycompany.luamaps.modelo.MarcadorDAO;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author larachicharo
 */
@ManagedBean
@SessionScoped
public class MarcadorActual {
    private Marcador marcadorActual;
    private int idmarcador;
    Set<Comentario> comentarios;
    
    public void changeMarcadorActual(int marcadorid) {
        System.out.println("Marcador id: " + String.valueOf(marcadorid));
        MarcadorDAO mdao = new MarcadorDAO();
        Marcador marcadorFind = mdao.find(marcadorid);
        AgregaComentario ac = new AgregaComentario();
        ac.setIdmarcador(idmarcador);
        marcadorActual = marcadorFind;
    }
    
    public String getDescripcion() {
        return marcadorActual.getDescripcion();
    }
    
    public void updateComentarios() {
        this.comentarios = marcadorActual.getComentarios();
    }
    
    public Set<Comentario> getComentarios() {
        return this.comentarios;
    }
    
    public int getIdmarcador() {
        return idmarcador;
    }
    
    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }
    
    public String irAMarcador() {
        changeMarcadorActual(idmarcador);
        updateComentarios();
        return "Marcador?faces-redirect=true";
    }
}
