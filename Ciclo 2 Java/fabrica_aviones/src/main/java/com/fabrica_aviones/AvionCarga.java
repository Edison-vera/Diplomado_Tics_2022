package com.fabrica_aviones;

public class AvionCarga extends Avion {
    
    //Constructor
    public AvionCarga(String color, double tamanio) {
        super(color, tamanio);
    }
    @Override
    public String toString() {
        String info = "-----------------AVION DE CARGA---------------\n";
        info += "Color:"+this.getColor();
        info += "Tamaño"+this.getTamanio();
        info += "\n";
        return info;
    }
    
    //Acciones
    public void cargar(){
        System.out.println("Cargando----");
    }
    public void descargar(){
        System.out.println("Descargando----");
    }
    
}
