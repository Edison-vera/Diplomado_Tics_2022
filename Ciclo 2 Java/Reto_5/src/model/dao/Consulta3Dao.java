package model.dao;
import Utilidades.*;
import java.sql.*;



public class Consulta3Dao {
    
    public static ResultSet consulta(){
        Statement st = null;
        ResultSet rs = null;
        try {
            
            var conn = JDBCUtilities.getConnection();
            
            String query = "SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado FROM Compra c INNER JOIN Proyecto p ON p.ID_Proyecto = c.ID_Proyecto WHERE Proveedor = 'Homecenter' AND p.Ciudad = 'Salento'";
    
            st = conn.createStatement();
            rs = st.executeQuery(query);
    
            //rs.close();
            //st.close();
            //conn.close();

    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
