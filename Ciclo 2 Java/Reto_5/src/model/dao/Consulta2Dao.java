package model.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import Utilidades.JDBCUtilities;

public class Consulta2Dao {
    
    public static ResultSet consulta(){
        Statement st = null;
        ResultSet rs = null;
        try {
            var conn = JDBCUtilities.getConnection();
            String query = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto WHERE Clasificacion = 'Casa Campestre'  AND Ciudad = 'Santa Marta' OR Ciudad = 'Cartagena' OR Ciudad = 'Barranquilla'";

                st = conn.createStatement();
                rs = st.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }
}
