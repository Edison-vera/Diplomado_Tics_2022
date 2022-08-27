package controller;
import view.*;

public class ReportesController {
    
    public static void main(String[] args) throws Exception{
        var reportesView = new ReportesView();
        var banco = "Conavi";
        reportesView.proyectosFinanciadosPorBanco(banco);

        var reportesView_2 = new ReportesView();
        var limiteInferior = 80_000d;
        reportesView_2.totalAdeudadoPorProyectosSuperioresALimite(limiteInferior); 

        var reportesView_3 = new ReportesView();reportesView_3. lideresQueMasGastan(); 
    }
}
