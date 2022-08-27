package com.animales;

public class Perro extends Animal {

    //Atributos
    private String raza;

    //Constructor
    public Perro(String color, int tamanio, int edad, String especie, String raza) {
        super(color, tamanio, edad, especie);
        this.raza = raza;
    }
    //Metodo consultor
    public String getRaza() {
        return raza;
    }
    
    //Metodo modificador
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public void avanzar() {
        System.out.println("Correr");
    }
}
