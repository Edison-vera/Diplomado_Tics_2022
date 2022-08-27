package modelo;


public class Facultad {
    //Atributos
    private int id;
    private String codigo;
    private String nombre;

    //Constructor
    public Facultad(int id, String codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public Facultad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //Consultores
    public int getId(){
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    //Modificadores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
