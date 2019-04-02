/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luamaps.controlador;

import  com.mycompany.luamaps.modelo.Tema;
import com.mycompany.luamaps.modelo.TemaDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author marco
 */
@ManagedBean
public class CrearTema{
    
    
    private String nombreTema;
    private String color;
    

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void crearTema(){
        Tema t = new Tema();
        t.setNombretema(nombreTema);
        t.setColor(color);
        TemaDAO tdao = new TemaDAO();
        tdao.save(t);
    }
}
