package com.mycompany.luamaps.modelo;
// Generated 31/03/2019 03:36:41 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Marcador generated by hbm2java
 */
public class Marcador  implements java.io.Serializable {


     private int idmarcador;
     private Tema tema;
     private String descripcion;
     private double latitud;
     private double longitud;
     private Set comentarios = new HashSet(0);

    public Marcador() {
    }

	
    public Marcador(int idmarcador, Tema tema, String descripcion, double latitud, double longitud) {
        this.idmarcador = idmarcador;
        this.tema = tema;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
    }
    public Marcador(int idmarcador, Tema tema, String descripcion, double latitud, double longitud, Set comentarios) {
       this.idmarcador = idmarcador;
       this.tema = tema;
       this.descripcion = descripcion;
       this.latitud = latitud;
       this.longitud = longitud;
       this.comentarios = comentarios;
    }
   
    public int getIdmarcador() {
        return this.idmarcador;
    }
    
    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }
    public Tema getTema() {
        return this.tema;
    }
    
    public void setTema(Tema tema) {
        this.tema = tema;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getLatitud() {
        return this.latitud;
    }
    
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    public double getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public Set getComentarios() {
        return this.comentarios;
    }
    
    public void setComentarios(Set comentarios) {
        this.comentarios = comentarios;
    }




}


