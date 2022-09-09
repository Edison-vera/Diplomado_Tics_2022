package com.hibernate.introduction.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "mascotas")
public class Mascota {
    
    //Atributos
    @Id
    private int id;
    private String nombre;
    private String apellido;
    @Column(name = "tipo_mascota")
    private String tipoMascota;
    private String raza;
    private int edad;
    private String observacion;
    //Constructor
    public Mascota(String nombre, String apellido, String tipo_mascota, String raza, int edad,
            String observacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoMascota = tipo_mascota;
        this.raza = raza;
        this.edad = edad;
        this.observacion = observacion;
    }
    public Mascota() {
    }
    //Consultores y modificadores
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTipo_mascota() {
        return tipoMascota;
    }
    public void setTipo_mascota(String tipo_mascota) {
        this.tipoMascota = tipo_mascota;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getObservacion() {
        return observacion;
    }
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public int getId() {
        return id;
    }

    
}
