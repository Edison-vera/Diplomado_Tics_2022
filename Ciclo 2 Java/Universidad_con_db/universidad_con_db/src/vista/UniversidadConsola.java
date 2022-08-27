package vista;

import java.sql.ResultSet;
import java.util.Scanner;

import controlador.UniversidadController;

public class UniversidadConsola {
    
    //Atrivutos
    private UniversidadController uController;

    //Constructor
    public UniversidadConsola(UniversidadController uController) {
        this.uController = uController;
    }

    public void crearUniversidad(Scanner sc){
        System.out.println("------------------CREAR UNIVERSIDAD------------------");
        System.out.println("Por favor ingrese los siguientes datos: ");
        //Solicitar dados
        //Nit
        System.out.print("Nit: ");
        String nit = sc.next();
        sc.nextLine();
        //Nombre
        System.out.print("Nombre: ");
        String nombre = sc.next();
        sc.nextLine();
        //Direccion
        System.out.print("Direccion: ");
        String direccion = sc.next();
        sc.nextLine();
        //Email
        System.out.print("Email: ");
        String email = sc.next();
        sc.nextLine();
        //Enviar datos al controlador para crear una universidad 
        Boolean crear = uController.crearUniversidad(nit, nombre, direccion, email);
        if(crear){
            System.out.println("Universidad creada con exito");
        }else {
            System.out.println("Ups algo sucedio, por favor intente mas tarde");
        }
    }

    public void mostrarUniversidades(){
        ResultSet result = uController.obtenerUniversidades();
        try {
            String info = "---------------------------UNIVERSIDADES REGISTRADAS---------------------\n";
            while(result.next()){
                info += "\nNombre: " + result.getString("nombre");
                info += "\nNit: " + result.getString("nit");
                info += "\nDireccion: " + result.getString("direccion");
                info += "\nEmail: " + result.getString("email");
                info += "\n-----------------------------------------------------------------------------\n";
            }
            System.out.println(info);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
