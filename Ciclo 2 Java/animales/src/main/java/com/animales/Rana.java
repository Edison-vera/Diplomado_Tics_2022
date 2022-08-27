package com.animales;

public class Rana extends Animal {
    //Atributos
    private boolean ranaToro;
    
     //Constructor
    public Rana(String color, int tamanio, int edad, String especie, boolean ranaToro) {
        super(color, tamanio, edad, especie);
        this.ranaToro = ranaToro;
    }

    @Override
    public void avanzar() {
        System.out.println(	"Saltar");
    }

    

}
