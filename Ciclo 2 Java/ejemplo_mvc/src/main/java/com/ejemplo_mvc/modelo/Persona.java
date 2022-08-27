package com.ejemplo_mvc.modelo;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private String telefono;

    //Constructor
    public Persona(String nombre, String apellido, int edad, char sexo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    @Override
    public String toString(){
        String info ="-------------------\n";
        info +="Nombre: " + nombre;
        info +="\nApellido: " + apellido;
        info +="\nedad: " + edad;
        info +="\nSexo: " + sexo;
        info +="\nTelefono: " + telefono;
        info +="\n-------------------\n";
        return info;  
    }

    //Consultores
    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public int getEdad() {
        return edad;
    }


    public char getSexo() {
        return sexo;
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


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
