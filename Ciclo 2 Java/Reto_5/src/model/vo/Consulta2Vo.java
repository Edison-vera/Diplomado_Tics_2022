package model.vo;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.dao.Consulta2Dao;

public class Consulta2Vo {

    public static ArrayList<String[]> valores(){
        ArrayList<String[]> salida_vo = new ArrayList<String[]>();

        try {
            ResultSet rs = Consulta2Dao.consulta();
            while(rs.next()){
                int ID_Proyecto = rs.getInt("ID_Proyecto");
                String Constructora = rs.getString("Constructora");
                String nh = rs.getString("Numero_Habitaciones");
    
                salida_vo.add(new String[] {ID_Proyecto+"",Constructora, nh});
                
            }
            rs.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return salida_vo;
    }
}
