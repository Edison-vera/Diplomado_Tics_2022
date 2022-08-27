package com.computadores;

public class ComputadoresMesa extends Computadores {

    //Atributos
    private final static Integer ALMACENAMIENTO_BASE = 50;
    private Integer almacenamiento;
    
    //Constructores
    public ComputadoresMesa() {
        this.consumoW = CONSUMO_W_BASE;
        this.precioBase= PRECIO_BASE;
        this.peso= PESO_BASE;
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    public ComputadoresMesa(double precioBase, Integer peso) {
        super(precioBase, peso);
        this.consumoW = CONSUMO_W_BASE;
        this.almacenamiento = ALMACENAMIENTO_BASE;
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    public ComputadoresMesa(double precioBase, Integer peso, char consumoW,  Integer almacenamiento) {
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }

    //Metodos modificadores
    public Integer getCarga() {
        return almacenamiento;
    }

    //Acciones
    public double calcularPrecio(){
        double adicion = super.calcularPrecio();
        if(almacenamiento > 100){
            adicion += 50.0;
        }
        return adicion;
    }
}
