/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luamaps.controlador;

import com.mycompany.luamaps.modelo.Usuario;
import com.mycompany.luamaps.modelo.UsuarioDAO;

/**
 *
 * @author marco
 */
public class AgregarInformante{
    private String correo;
     private Boolean activo;
     private String nombreusuario;
     private int rol;
     private String contrasenia;

    public String getCorreo() {
        return correo;
    }

    public Boolean getActivo() {
        return activo;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public int getRol() {
        return rol;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
     
    
    public void agregaUsuario() {
        Usuario u = new Usuario();
        u.setActivo(true);
        u.setNombreusuario(nombreusuario);
        u.setRol(2);
        u.setCorreo(correo);
        u.setContrasenia(contrasenia);
        UsuarioDAO udao = new UsuarioDAO();
        udao.save(u);
    }
    
}
