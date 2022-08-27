package model.vo;

import java.sql.ResultSet;

import model.dao.ComprasDeLiderDao;

public class ComprasDeLiderVo {
    
    public static void compras(){

        try {
            ResultSet rs = ComprasDeLiderDao.consulta();
            while(rs.next()){
                String lider = rs.getString("LIDER");
                Float valor = rs.getFloat("VALOR");               
                System.out.println(String.format("%-25s %,15.1f", lider, valor));
            }
            rs.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }
}
