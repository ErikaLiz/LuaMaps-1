/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luamaps.controlador;

import com.mycompany.luamaps.modelo.Marcador;
import com.mycompany.luamaps.modelo.MarcadorDAO;
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
    
    public void changeMarcadorActual(int marcadorid) {
        MarcadorDAO mdao = new MarcadorDAO();
        Marcador marcadorFind = mdao.find(marcadorid);
        marcadorActual = marcadorFind;
    }
    
    public String getDescripcion() {
        return marcadorActual.getDescripcion();
    }
    
    public int getIdmarcador() {
        return idmarcador;
    }
    
    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }
    
    public String irAMarcador() {
        changeMarcadorActual(idmarcador);
        return "Marcador?faces-redirect=true";
    }
    
}
