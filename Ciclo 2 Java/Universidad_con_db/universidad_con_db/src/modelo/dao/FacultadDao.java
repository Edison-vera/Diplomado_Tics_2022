package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.ConexionDB;
import modelo.Facultad;

public class FacultadDao extends Facultad {

    public FacultadDao(int id, String codigo, String nombre) {
        super(id, codigo, nombre);
    }

    public FacultadDao(String codigo, String nombre) {
        super(codigo, nombre);
    }

    public boolean insert(ConexionDB objConn, String nit)  {
        boolean insert = false;
        
        try {
            String query = "INSERT INTO facultades(codigo, nombre, universidad_nit) VALUES(?, ?, ?)";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, getCodigo());
            pst.setString(2, getNombre());
            pst.setString(3, nit);

            //Ejecturar consulta
            insert = pst.executeUpdate() == 1 ? true : false;
            
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return insert;
    }

    public static ResultSet selectAll(ConexionDB objConn){
        // ResultSet result = null;
        // try {
        //     String query = "SELECT * FROM facultades";
        //     Statement st = objConn.getConexion().createStatement();
        //     result = st.executeQuery(query);
        // } catch (SQLException e) {
        //     e.printStackTrace();
        // }
        ResultSet result = objConn.consultar("SELECT * FROM facultades");
        return result;
    }

    public static ResultSet selectByUniversidad(ConexionDB objConn, String universidadNit) {
        ResultSet result = null;
        try {
            String query = "SELECT f.id, f.codigo, f.nombre FROM Facultades f ";
            query += "INNER JOIN Universidades u ON  u.nit = f.universidad_nit WHERE u.nit = ?";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, universidadNit);
            result = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    


    public ResultSet selectByCodigo(ConexionDB objConn, String codigo){
        ResultSet result = null;
        try {
            String query = "SELECT * FROM facultades WHERE = ?";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, codigo);
            result = pst.executeQuery();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
        
    }

    public ResultSet SelectByNombre(ConexionDB objConn, String nombre){
        ResultSet result = null;
        try {
            String query = "SELECT * FROM facultades nombre LIKE '%?%'";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, nombre);
            result = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean update(ConexionDB ObjConn, String codigo, String nombre){
        boolean update = false;
        try {
            String query = "UPDATE facultades SET nombre = ? WHERE = ?";
            PreparedStatement pst = ObjConn.getConexion().prepareStatement(query);
            pst.setString(1, nombre);
            pst.setString(2, codigo);
            //Ejecturar
            update = pst.executeUpdate() == 1 ? true : false;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return update;
    }

    public boolean delete(ConexionDB objConn, String codigo){
        boolean update = false;
        try {
            String query = "DELETE FROM facultades WHERE codigo = ?";
            PreparedStatement pst = objConn.getConexion().prepareStatement(query);
            pst.setString(1, codigo);
            //Ejecturar
            update = pst.executeUpdate() == 1 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return update;
    }
}
