package model.vo;
import model.dao.*;
import java.sql.*;
import java.util.ArrayList;

public class Consulta3Vo {

    public static ArrayList<String[]> valores(){
        ArrayList<String[]> salida_vo = new ArrayList<String[]>();
        // c.ID_Compra, p.Constructora, p.Banco_Vinculado
        try {
            ResultSet rs = Consulta3Dao.consulta();
            while(rs.next()){
                int ID_Compra = rs.getInt("ID_Compra");
                String Constructora = rs.getString("Constructora");
                String banco = rs.getString("Banco_Vinculado");
    
                salida_vo.add(new String[] {ID_Compra+"",Constructora, banco});
                
            }
            rs.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return salida_vo;
    }
}