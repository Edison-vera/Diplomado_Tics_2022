package model.vo;

import java.sql.ResultSet;

import model.dao.DeudasPorProyectoDao;

public class DeudasPorProyectosVo {

    public static void deudas(double limiteInferior ){

        try {
            ResultSet rs = DeudasPorProyectoDao.consulta(limiteInferior);
            while(rs.next()){
                int id = rs.getInt("ID_Proyecto");
                Float valor = rs.getFloat("VALOR");
                
                System.out.println(String.format("%3d %,15.1f", id, valor));
                
            }
            rs.close();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }

    }
}
