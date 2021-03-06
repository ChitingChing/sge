package com.chingproyects.sge.pojos;
// Generated 26/11/2017 23:17:37 by Hibernate Tools 4.3.1


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Alumno generated by hbm2java
 */
public class Alumno  implements java.io.Serializable {


     private Serializable id;
     private String nombres;
     private String apellidos;
     private String cedula;
     private String direccion;
     private String telefono1;
     private String telefono2;
     private char sexo;
     private Date fechanac;
     private char estado;
     private Set matriculas = new HashSet(0);

    public Alumno() {
    }

	
    public Alumno(Serializable id, String nombres, String apellidos, String cedula, String direccion, String telefono1, String telefono2, char sexo, Date fechanac, char estado) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.sexo = sexo;
        this.fechanac = fechanac;
        this.estado = estado;
    }
    public Alumno(Serializable id, String nombres, String apellidos, String cedula, String direccion, String telefono1, String telefono2, char sexo, Date fechanac, char estado, Set matriculas) {
       this.id = id;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.cedula = cedula;
       this.direccion = direccion;
       this.telefono1 = telefono1;
       this.telefono2 = telefono2;
       this.sexo = sexo;
       this.fechanac = fechanac;
       this.estado = estado;
       this.matriculas = matriculas;
    }
   
    public Serializable getId() {
        return this.id;
    }
    
    public void setId(Serializable id) {
        this.id = id;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono1() {
        return this.telefono1;
    }
    
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }
    public String getTelefono2() {
        return this.telefono2;
    }
    
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    public char getSexo() {
        return this.sexo;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public Date getFechanac() {
        return this.fechanac;
    }
    
    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public Set getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Set matriculas) {
        this.matriculas = matriculas;
    }




}


