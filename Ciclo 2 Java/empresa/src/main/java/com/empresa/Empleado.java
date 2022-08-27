package com.empresa;

public class Empleado {
    //Atributos
    private String nombre;
    private int edad;
    private double sueldoBruto;

    //Sobrecarga de metodos
    //Constructores
    public Empleado(String nombre, int edad, double sueldoBruto) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldoBruto = sueldoBruto;
    }

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldoBruto = 0.0;
    }

    public Empleado() {
        this.nombre ="";
        this.edad = 0;
        this.sueldoBruto = 0.0;
    }
    @Override
    public String toString() {
        String info = "--------------Empleado-----------\n";
        info += "Nombre: "+nombre;
        info += "\nEdad: "+edad;
        info += "\nSueldo bruto: "+sueldoBruto;
        
        return info;
    }
    //Consultores
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    //Modificadores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    //Acciones
    public void mostrar(){

    }
    public void calcularSalarioNeto(){

    }
}
