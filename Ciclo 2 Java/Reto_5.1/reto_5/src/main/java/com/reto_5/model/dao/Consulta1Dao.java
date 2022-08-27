import java.sql.ResultSet;
import java.sql.Statement;

import com.reto_5.Utilidades.JDBCUtilities;

public class Consulta1Dao {
    
    public static ResultSet consulta(){
        Statement st = null;
        ResultSet rs = null;
        try {
            var conn = JDBCUtilities.getConnection();
            String query = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia ASC";

            st = conn.createStatement();
            rs = st.executeQuery(query);
        } catch (Exception e) {
            //TODO: handle exception
        }

        return rs;
    }
}
