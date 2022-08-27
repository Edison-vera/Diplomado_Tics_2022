package com.fabrica_aviones;

public class AvionPasajeros extends Avion {

    private int pasajeros;

    public AvionPasajeros(String color, double tamanio, int pasajeros) {
        super(color, tamanio);
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        String info = "-----------------AVION DE PASAJEROS---------------\n";
        info += "Color:"+this.getColor();
        info += "Tamaño: "+this.getTamanio();
        info += "Cantidad de pasajeros: "+this.getpajajeros();
        info += "\n";
        return info;
    }

    //Consultores
    public int getpajajeros() {
        return pasajeros;
    }
    //Modificadores
    public void setpajajeros() {
        this.pasajeros = pasajeros;
    }

    //Acciones
    public void servir(){
        System.out.println("Servir----");
    }

    
}
