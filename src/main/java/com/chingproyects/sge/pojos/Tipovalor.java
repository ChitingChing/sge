package com.chingproyects.sge.pojos;
// Generated 26/11/2017 23:17:37 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Tipovalor generated by hbm2java
 */
public class Tipovalor  implements java.io.Serializable {


     private Serializable id;
     private String descripcion;
     private Set pagos = new HashSet(0);

    public Tipovalor() {
    }

	
    public Tipovalor(Serializable id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    public Tipovalor(Serializable id, String descripcion, Set pagos) {
       this.id = id;
       this.descripcion = descripcion;
       this.pagos = pagos;
    }
   
    public Serializable getId() {
        return this.id;
    }
    
    public void setId(Serializable id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getPagos() {
        return this.pagos;
    }
    
    public void setPagos(Set pagos) {
        this.pagos = pagos;
    }




}


