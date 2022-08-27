package modelo;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexionDB {
    //Atributos
    private Connection conexion;

    //Constructor
    public ConexionDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:universidad_db");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error al conectar a la base de datos");
        }
    }
    
    //Consultor
    public Connection getConexion(){
        return conexion;
    }


    //Acciones

    public void cerrarConexion() throws SQLException{
        conexion.close();
    }

    public ResultSet consultar(String query){
        ResultSet result;
        try {
            Statement st = conexion.createStatement();
            result = st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            result = null;
        }
        return result;
    }

}
