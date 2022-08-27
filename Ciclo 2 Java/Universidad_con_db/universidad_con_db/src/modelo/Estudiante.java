package modelo;

public class Estudiante extends Persona {
    
    //Atributos
    private String codigo;
    
    //Constructor
    public Estudiante(String nombre, String apellido, int edad, String cedula, char sexo, String codigo) {
        super(nombre, apellido, edad, cedula, sexo);
        this.codigo = codigo;
    }
    //Consultor
    public String getCodigo() {
        return codigo;
    }
    //Modificador
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    //Acciones

    
}
