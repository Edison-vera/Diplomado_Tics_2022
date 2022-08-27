package com.reto_5.model.vo;

import java.sql.ResultSet;

import com.reto_5.model.dao.Consulta1Dao;

public class Consulta1Vo {
    
    public static void valores(){
       // ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia
        try {
            ResultSet rs = Consulta1Dao.consulta();
            while(rs.next()){
                int id = rs.getInt("ID_Lider");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Primer_Apellido");
                String cuidad = rs.getString("Ciudad_Residencia");   

                System.out.println(String.format("%5d %15s %15s %15s", id, nombre, apellido, cuidad));
            }
            rs.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}