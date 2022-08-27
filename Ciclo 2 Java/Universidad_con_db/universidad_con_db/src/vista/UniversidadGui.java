package vista;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import controlador.UniversidadController;

public class UniversidadGui {
    //Atrivutos
    private UniversidadController uController;

    //Constructor
    public UniversidadGui(UniversidadController uController) {
        this.uController = uController;
    }

    public void crearUniversidad(){
        String encabezado = "------------------CREAR UNIVERSIDAD------------------\n";
        encabezado += "Por favor ingrese los siguientes datos\n\n";
        //Solicitar dados
        String nit = JOptionPane.showInputDialog(null, encabezado + "Por favor ingrese el nit: ");
        String nombre = JOptionPane.showInputDialog(null, encabezado + "Por favor ingrese el nombre: ");
        String direccion = JOptionPane.showInputDialog(null, encabezado + "Por favor ingrese la direccion: ");
        String email = JOptionPane.showInputDialog(null, encabezado + "Por favor ingrese el email: ");
        //Enviar datos al controlador para crear una universidad 
        Boolean crear = uController.crearUniversidad(nit, nombre, direccion, email);
        if(crear){
            JOptionPane.showMessageDialog(null, "Universidad creada con exito!");
        }else {
            JOptionPane.showMessageDialog(null, "Ups algo sucedio, por favor intente mas tarde");
        }
    }

    public void crearFormulario(){
        new CrearUniversidadJframe();
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
            JOptionPane.showMessageDialog(null, info);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
