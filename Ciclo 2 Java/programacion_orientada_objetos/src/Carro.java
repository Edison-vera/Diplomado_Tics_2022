public class Carro {
    //Atributos
    private String color;
    private String matricula;
    private String modelo;
    private int cap_personas;
    private String tipo_carro;
    private double vel_maxima;
    private boolean gasolina;
    
    //Constructor
    public Carro(String color, String matricula, String modelo, int cap_personas, String tipo_carro, double vel_maxima,
            boolean gasolina) {
        this.color = color;
        this.matricula = matricula;
        this.modelo = modelo;
        this.cap_personas = cap_personas;
        this.tipo_carro = tipo_carro;
        this.vel_maxima = vel_maxima;
        this.gasolina = gasolina;
    }
    //Metodos consultores
    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCap_personas() {
        return cap_personas;
    }

    public String getTipo_carro() {
        return tipo_carro;
    }

    public double getVel_maxima() {
        return vel_maxima;
    }

    public boolean getGasolina() {
        return gasolina;
    }
    //Metodos modificadores
    public void setColor(String color) {
        this.color = color;
    }

    public void setCap_personas(int cap_personas) {
        this.cap_personas = cap_personas;
    }

    public void setTipo_carro(String tipo_carro) {
        this.tipo_carro = tipo_carro;
    }

    public void setVel_maxima(double vel_maxima) {
        this.vel_maxima = vel_maxima;
    }

    public void setGasolina(boolean gasolina) {
        this.gasolina = gasolina;
    }
    //Acciones
    public void acelerar(){
        System.out.println("Acelerando...🚘");
    }
    public void frenar(){
        System.out.println("Frenando...⏹");
    }
    public void girar_dere(){
        System.out.println("----->");
    }
    public void girar_izq(){
        System.out.println("<-----");
    }
}