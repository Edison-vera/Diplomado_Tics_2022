package vista;
import java.util.Scanner;
import java.lang.Integer;
import javax.print.DocFlavor.STRING;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

import controlador.UniversidadController;

public class MenuGui {
    

    //Atributos
    private UniversidadController uController;

    //Constructor
    public MenuGui(UniversidadController uController) {
        this.uController = uController;
    }

    // public void ventanasEmergentes(){
    //     //Crear ventana emergente
    //     //Mostrar informacion
    //     JOptionPane.showMessageDialog(null, "Hola mundo interfaz grafica");
    //     //Solicitar datos
    //     String nombre = JOptionPane.showInputDialog(null, "Por favor ingrese su nombre:");
    //     JOptionPane.showMessageDialog(null, "Su nombre es: " + nombre);
    // }

    //Construir el menu para el crud universidad
    public void crearMenu(){
        //Creacion de objectos
        UniversidadGui uConsola = new UniversidadGui(uController);

        String mensaje = "\n-----------------------UNIVERSIDADES CON MVC, DAO Y PERSISTENCIA DE DATOS ------------\n";
        mensaje += "1) Crear Universidad\n";
        mensaje += "2) Mostrar Universidades\n";
        mensaje += "3) Consultar Universidaded\n";
        mensaje += "4) Actualizar Universidad\n";
        mensaje += "5) Eliminar Universidadad\n";
        mensaje += "-1) Salir\n";
        
        //Crear objecto Scanner para capturar los datos por consola
        try {
            //Variable que representa la opcion ingresada por el usuario
            int opcion = 0;
            //Iterar hasta que el usuario indique salir
            while(opcion != -1){
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
                System.out.print(mensaje);
                //Capturar la opcion ingresada por el usuario
                //Evaluar la opcion
                switch (opcion){
                    case 1:
                    uConsola.crearFormulario();
                    break;
                    case 2:
                    uConsola.mostrarUniversidades();
                    break;
                    default:
                    break;
                }
            }
        } catch (Exception e) {
            //System.out.println("Por favor ingrese valores numericos en el menu");
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores numericos en el menu");
        }
    }


    
}
