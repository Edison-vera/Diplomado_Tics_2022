package com.empresa;

public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;
    private String telefono;
    
    //Constructores
    public Cliente(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = "";
    }
    public Cliente() {
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
    }
    @Override
    public String toString() {
        String info = "--------------Cliente-----------\n";
        info += "Nombre: "+nombre;
        info += "\nApellido: "+apellido;
        info += "\nTelefono: "+telefono;
        info +="\n---------------------------------------\n";
        return info;
    }
    //Consultores
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getTelefono() {
        return telefono;
    }

    //Modificadores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
