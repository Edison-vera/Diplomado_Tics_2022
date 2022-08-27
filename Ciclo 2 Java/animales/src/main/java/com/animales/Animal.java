package com.animales;

public class Animal {
    //Atributos
    private String color;
    private int tamanio;
    private int edad;
    private String especie;

    //Constructor
    public Animal(String color, int tamanio, int edad, String especie) {
        this.color = color;
        this.tamanio = tamanio;
        this.edad = edad;
        this.especie = especie;
    }
    //Metodos consultores
    public String getColor() {
        return color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }
    //Metodos modificadores
    public void setColor(String color) {
        this.color = color;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Acciones
    public void avanzar(){
        System.out.println("Avanzar");
    }
    
}
