package controlador;

import modelo.ConexionDB;
import vista.Menu;
import vista.MenuGui;
import vista.MenuJframe;

public class MainController {
    
    public MainController(){
        //Conectarse a la base de datos
        ConexionDB objConn = new ConexionDB();
        UniversidadController uController = new UniversidadController(objConn);
        //Menu menuC = new Menu(uController);
        //menuC.crearMenu();
        //MenuGui menuI = new MenuGui(uController);
        //menuI.crearMenu();
        new MenuJframe();
        
    }
}
