package model.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import Utilidades.JDBCUtilities;

public class DeudasPorProyectoDao {
    
    public static ResultSet consulta(double limiteInferior){
        Statement st = null;
        ResultSet rs = null;
        try {
            var conn = JDBCUtilities.getConnection();
            String query = "SELECT c.ID_Proyecto, SUM(c.Cantidad*mc.Precio_Unidad)  AS VALOR FROM Compra c INNER JOIN MaterialConstruccion mc ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion WHERE Pagado ='No' GROUP BY ID_Proyecto HAVING VALOR > "+limiteInferior+" ORDER BY VALOR DESC";

                st = conn.createStatement();
                rs = st.executeQuery(query);
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        return rs;
    }
}
