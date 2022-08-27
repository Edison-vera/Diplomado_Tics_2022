package com.fabrica_aviones;

public class AvionMilitar extends Avion{
    //Atributos
    private int misiles;
    //Constructor
    public AvionMilitar(String color, double tamanio, int misiles) {
        super(color, tamanio);
        this.misiles = misiles;
    }
    @Override
    public String toString() {
        String info = "-----------------AVION DE MILITAR---------------\n";
        info += "Color:"+this.getColor();
        info += "Tamaño: "+this.getTamanio();
        info += "Cantidad de misiles: "+this.getMisiles();
        info += "\n";
        return info;
    }
    //Consultores
    public int getMisiles() {
        return misiles;
    }
    //Modificadores
    public void setMisiles(int misiles) {
        this.misiles = misiles;
    }
    //Acciones

    private void disparar(){
        System.out.println("Disparar----");
    }

}
