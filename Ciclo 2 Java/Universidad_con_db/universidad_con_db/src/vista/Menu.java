package vista;

import java.util.Scanner;

import controlador.UniversidadController;
import modelo.ConexionDB;

public class Menu {
    
    //Atributos
    private UniversidadController uController;

    //Constructor
    public Menu(UniversidadController uController) {
        this.uController = uController;
    }
    
    //Construir el menu para el crud universidad
    public void crearMenu(){
        //Creacion de objectos
        UniversidadConsola uConsola = new UniversidadConsola(uController);

        String mensaje = "\n-----------------------UNIVERSIDADES CON MVC, DAO Y PERSISTENCIA DE DATOS ------------\n";
        mensaje += "1) Crear Universidad\n";
        mensaje += "2) Mostrar Universidades\n";
        mensaje += "3) Consultar Universidaded\n";
        mensaje += "4) Actualizar Universidad\n";
        mensaje += "5) Eliminar Universidadad\n";
        mensaje += "-1) Salir\n";
        mensaje += ">>>>>> ";
        
        //Crear objecto Scanner para capturar los datos por consola
        try (Scanner sc = new Scanner(System.in)){
            //Variable que representa la opcion ingresada por el usuario
            int opcion = 0;
            //Iterar hasta que el usuario indique salir
            while(opcion != -1){
                System.out.print(mensaje);
                //Capturar la opcion ingresada por el usuario
                opcion = sc.nextInt();
                //Evaluar la opcion
                switch (opcion){
                    case 1:
                    uConsola.crearUniversidad(sc);
                    break;
                    case 2:
                    uConsola.mostrarUniversidades();
                    break;
                    default:
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Por favor ingrese valores numericos en el menu");
        }
    }
    
    
}
