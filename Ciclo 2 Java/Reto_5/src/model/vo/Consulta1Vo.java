package model.vo;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.dao.Consulta1Dao;

public class Consulta1Vo {

    public static ArrayList<String[]> valores(){
        ArrayList<String[]> salida_vo = new ArrayList<String[]>();
        //ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia
        try {
            ResultSet rs = Consulta1Dao.consulta();
            while(rs.next()){
                int id = rs.getInt("ID_Lider");
                String nombre  = rs.getString("Nombre");
                String apellido = rs.getString("Primer_Apellido");
                String ciudad = rs.getString("Ciudad_Residencia");

                salida_vo.add(new String[] {id+"",nombre, apellido, ciudad});
                
            }
            rs.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
        return salida_vo;
    }
}
