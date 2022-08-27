package model.dao;
import Utilidades.*;
import java.sql.*;



public class ProyectoBancoDao {
    
    public static ResultSet consulta(String banco){
        Statement st = null;
        ResultSet rs = null;
        try {
            
            var conn = JDBCUtilities.getConnection();
            
            String query = "SELECT  p.ID_Proyecto AS ID, p.Constructora, p.Ciudad, p.Clasificacion, t.Estrato, (l.Nombre ||' '|| l.Primer_Apellido ||' '|| l.Segundo_Apellido) AS LIDER  FROM Proyecto p INNER JOIN Lider l ON p.ID_Lider = l.ID_Lider INNER JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo WHERE (Banco_Vinculado='"+banco+"') ORDER BY Fecha_Inicio DESC,  Ciudad, Constructora ASC";
    
            st = conn.createStatement();
            rs = st.executeQuery(query);
    
            //rs.close();
            //st.close();
            //conn.close();

    
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        return rs;
    }
}
