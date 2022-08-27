import java.util.Map;

public class BecaUniversitaria {
    
    //Atributos
    private double pMonto;
    private double pInteres;
    private int pTiempo;
    
    //Constructor
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres) {
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pTiempo = pTiempo;
    }
    public BecaUniversitaria() {
        this.pMonto = 0.0;
        this.pInteres = 0.0;
        this.pTiempo = 0;
    }

    //Metodos consultores
    public double getpMonto() {
        return pMonto;
    }
    public double getpInteres() {
        return pInteres;
    }
    public int getpTiempo() {
        return pTiempo;
    }

    //Metodos modificadores
    public void setpMonto(double pMonto) {
        this.pMonto = pMonto;
    }
    public void setpInteres(double pInteres) {
        this.pInteres = pInteres;
    }
    public void setpTiempo(int pTiempo) {
        this.pTiempo = pTiempo;
    }
    
    //Acciones
    public double calcularInteresSimple(){
        double interesSimple = (pMonto * pInteres/100 * pTiempo);
        interesSimple = Math.round(interesSimple);
        return interesSimple; 
    }
    public double calcularInteresCompuesto(){
        double interesCompuesto = (pMonto *(Math.pow((1+(pInteres/100)),pTiempo)-1));
        interesCompuesto = Math.round(interesCompuesto);
        return interesCompuesto;
    }
    public String compararInversion(int pTiempo, double pMonto, double pInteres){
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pTiempo = pTiempo;
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        diferencia = Math.round(diferencia);
        if(diferencia ==0){
            return ("No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.");
        }else{
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        }
    }

    public String compararInversion(){
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        diferencia = Math.round(diferencia);
        if(diferencia != 0){
        return ("La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia);
        }else {
        return ("No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.");
    }
    }

}
