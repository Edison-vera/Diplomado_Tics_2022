package model.dao;
import java.sql.*;

import Utilidades.JDBCUtilities;

public class ComprasDeLiderDao {
    
    public static ResultSet consulta(){
        Statement st = null;
        ResultSet rs = null;
        try {
            var conn = JDBCUtilities.getConnection();
            String query = "SELECT (l.Nombre ||' '|| l.Primer_Apellido ||' '|| l.Segundo_Apellido) AS LIDER, SUM(c.Cantidad*mc.Precio_Unidad) AS VALOR FROM Lider l INNER JOIN Proyecto p  ON p.ID_Lider=l.ID_Lider INNER JOIN Compra c ON c.ID_Proyecto=p.ID_Proyecto INNER JOIN MaterialConstruccion mc ON mc.ID_MaterialConstruccion=c.ID_MaterialConstruccion GROUP BY LIDER ORDER BY VALOR DESC LIMIT 10";

            st = conn.createStatement();
            rs = st.executeQuery(query);
        } catch (Exception e) {
            //TODO: handle exception
        }

        return rs;
    }
}
