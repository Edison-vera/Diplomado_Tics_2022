import java.util.Scanner;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String celular;
    private String email;
    private char genero;

    //Metodo Constructor
    public Persona(String nombre, String apellido, int edad, String cedula, char genero ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.genero = genero;
        //System.out.println("Hola soy una persona, soy " + this.nombre + " " + this.apellido);
    }

    //Metodos consultores
    public String getNombre(){

        return nombre;
    }
    public String getApellido(){

        return apellido;
    }

    public int getEdad(){

        return edad;
    }

    public String getCedula(){

        return cedula;
    }

    public String getCelular(){

        return celular;
    }

    public String getEmail(){

        return email;
    }

    public char getGenero(){

        return genero;
    }
    //Metodos modificadores
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public void setCelular(String celular){
        this.celular = celular;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public void setGenero(char genero){
        this.genero = genero;
    }

    //Acciones
    public double calcular_nomina(double cant_hora){
        int valor_hora = 0;
        double nomina = 0;
        if(edad <20 && edad >=18 ){
            valor_hora = 10;
        }else if (edad >= 20 && edad <= 30){ 
            valor_hora = 15;
        }else if (edad >30 && edad <=50){
            valor_hora = 20;
        }else if (edad >50){
            valor_hora = 25;
        }
        nomina = valor_hora * cant_hora;
        return nomina;
    }

    public void crear_carro(){
        Scanner leer = new Scanner(System.in);
        //Solicitar los datos para crear un carro
        System.out.print("Que color desea para su vehiculo? ");
        String color = leer.next();
        System.out.print("Que matricula desea para su vehiculo? ");
        String matricula = leer.next();
        System.out.print("Que modelo desea para su vehiculo? ");
        String modelo = leer.next();
        System.out.print("Que capacidad de personas desea para su vehiculo? ");
        int cap_personas = leer.nextInt();
        System.out.print("Que tipo de vehiculo  desea? ");
        String tipo_carro = leer.next();
        System.out.print("Velocidad maxima vehiculo? ");
        double vel_maxima = leer.nextDouble();
        System.out.print("Desea que su vehiculo sea a gasolina? (s-->Si / n-->No)");
        String str_gasolina = leer.next();
            boolean gasolina = false;
            if(str_gasolina.equalsIgnoreCase("s")){
                gasolina = true;
            }

        //Crear carro
        Carro carro = new Carro(color, matricula, modelo, cap_personas, tipo_carro, vel_maxima, gasolina);
        System.out.println(carro.toString());
    }

}
