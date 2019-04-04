/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luamaps.controlador;

import com.mycompany.luamaps.modelo.Marcador;
import com.mycompany.luamaps.modelo.MarcadorDAO;
import  com.mycompany.luamaps.modelo.Tema;
import com.mycompany.luamaps.modelo.TemaDAO;
import com.mycompany.luamaps.modelo.Usuario;
import com.mycompany.luamaps.modelo.UsuarioDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author marco
 */
@ManagedBean
public class CrearTema {
    private String nombre;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    private Usuario usuario;

    public Marcador getMarcador() {
        return marcador;
    }

    public void setMarcador(Marcador marcador) {
        this.marcador = marcador;
    }
    private Marcador marcador;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void agregraTema(){
        Tema u = new Tema();
        TemaDAO udao = new TemaDAO();
        u.setNombretema(nombre);
        Usuario dummy = new UsuarioDAO().find("dummy@dummy.com");
        u.setUsuario(dummy);
        Marcador m = new MarcadorDAO().find(1);
        u.addMarcador(m);
        u.setColor(color);
        if(udao.findS(nombre) == null){
            udao.save(u);
        }
    }
}