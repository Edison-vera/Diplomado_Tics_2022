package com.computadores;

public class ComputadoresPortatiles extends Computadores {

    //Atributos
    private final static Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private boolean  camaraITG;

    //Constructores
    public ComputadoresPortatiles() {
        this.consumoW = CONSUMO_W_BASE;
        this.precioBase= PRECIO_BASE;
        this.peso= PESO_BASE;
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }

    public ComputadoresPortatiles(Double precioBase, Integer peso){
        super(precioBase, peso);
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;

    }

    public ComputadoresPortatiles(double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean camaraITG){
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }

    //Acciones
    public double calcularPrecio(){

        double adicion = super.calcularPrecio();
        if(pulgadas > 40){
            adicion += (precioBase*0.3);
        }
        if(camaraITG){
            adicion += 50.0;
        }
        return adicion;
    }

}
