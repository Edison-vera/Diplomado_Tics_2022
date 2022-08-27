package Reto1.BecaUniversitaria;

public class BecaUniversitaria {
    //Atributos
    public double pMonto;
    public double pInteres;
    public int pTiempo;

    //Constructores
    public BecaUniversitaria(double pMonto, double pInteres, int pTiempo){
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pTiempo = pTiempo;
    }
    //Metodos consultores
    public double GetPMonto(){
        return pMonto;
    }
    public double GetPInteres(){
        return pInteres;
    }
    public int GetPTiempo(){
        return pTiempo;
    }
    //Metodos modificadores
    public void SetPMonto(double pMonto){
        this.pMonto = pMonto;
    }
    public void SetPInteres(double pInteres){
        this.pInteres = pInteres;
    }
    public void SetPTiempo(int pTiempo){
        this.pTiempo = pTiempo;
    }
    //Acciones
    public double calcularInteresesSimple(){
        double interesSimple = (pMonto * pInteres * pTiempo)/100;
        return interesSimple;

    }
    public double calcularInteresCompuesto(){
        double interesCompuesto = (pMonto * 341 + ((pInteres*pTiempo)/6) -18)/100;
        return interesCompuesto;
    }

    public String compararInversion(double pMonto, double pInteres, int pTiempo){
        double compararInversion = calcularInteresesSimple() - calcularInteresCompuesto();           
        return System.out.println("La diferencia entre la proyección de interés compuesto e interés simple es: $"+this.compararInversion);
    }
    
    public static void main(String[] args) {
        // Llamados para verificar con los casos de prueba el funcionamiento de la clase
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresesSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60, 13000, 1,4));
    }

}
