package com.computadores;

import javax.swing.text.html.HTMLDocument.RunElement;

public class Computadores {
    //Atributos
    protected final static char CONSUMO_W_BASE = 'F';
    protected final static double PRECIO_BASE = 100; 
    protected final static Integer PESO_BASE = 5;
    
    protected Integer peso;
    protected char consumoW;
    protected double precioBase;

    //Constructor
    public Computadores() {
        this.consumoW = CONSUMO_W_BASE;
        this.precioBase= PRECIO_BASE;
        this.peso= PESO_BASE;
    }

    public Computadores(double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = CONSUMO_W_BASE;
    }

    public Computadores(double precioBase, Integer peso, char consumoW) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }

    //Metodos consultores
    public Integer getPeso() {
        return peso;
    }

    public char getConsumoW() {
        return consumoW;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    //Acciones
    public double calcularPrecio(){
        
        Double adicion = 0.0;
        //Consumo
        switch(consumoW){
            case 'A':
                adicion += 100.0;
                break;
            case 'B':
                adicion += 80.0;
                break;
            case 'C':
                adicion += 60.0;
                break;
            case 'D':
                adicion += 50.0;
                break;
            case 'E':
                adicion += 30.0;
                break;
            case 'F':
                adicion += 10.0;
                break;
        }
    //Peso
        if(peso >= 0 && peso <19){
            adicion += 10.0;
        }else if(peso >=20  && peso <49){
            adicion += 50.0;
        }else if(peso >=50  && peso <= 79){
            adicion += 80.0;
        }else if(peso >=80){
            adicion += 100.0;
        }

        return precioBase+ adicion;
    }
    
}
