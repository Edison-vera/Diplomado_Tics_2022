package com.fabrica_aviones;

public class Avion {
    //Atributos
    private String color;
    private double tamanio;
    
    //Constructor
    public Avion(String color, double tamanio) {
        this.color = color;
        this.tamanio = tamanio;
    }
    //Consultores
    public String getColor() {
        return color;
    }

    public double getTamanio() {
        return tamanio;
    }
    //Modificadores
    public void setColor(String color) {
        this.color = color;
    }
    
    //Acciones
    public void despegar(){
        System.out.println("Despegar------🛫");
    }

    public void aterrizar(){
        System.out.println("Aterrizar-----🛬");
    }

    public void frenar(){
        System.out.println("Frenando-----⏹");
    }
}
