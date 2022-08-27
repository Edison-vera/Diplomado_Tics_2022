package com.ejemplo_mvc.controlador;
import java.util.ArrayList;
import com.ejemplo_mvc.modelo.Persona;

public class PersonaController {
    
    //Atributos

    private ArrayList<Persona> personas;

    //Constructor
    public PersonaController() {
        this.personas = new ArrayList<Persona>();
    }
    
    public int getCantidadPersonas() {
        return personas.size();
    }

    public void setPersonas(int index, Persona persona) {
        personas.set(index, persona);
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    //Crear Personas

    public void crearPersona(String nombre, String apellido, int edad, char sexo, String telefono){

        Persona objPersona = new Persona(nombre, apellido, edad, sexo, telefono);
        personas.add(objPersona);
    }

    public String obtenerPersonaXindex(int index){
        return personas.get(index).toString();
    }

    private Persona buscarPersonaXapellido(String apellido){
        Persona objPersona = new Persona("", "", 0, '-', "");
        for(Persona persona : personas){
            if(persona.getApellido().equalsIgnoreCase(apellido)){
            objPersona = persona;
            break;
            }
        } 
        return objPersona;
    }

    public String consultarPersona(String apellido){
        String infoPersona = "";
        //Iterar el arry personas
        for (Persona persona : personas) {
            if(persona.getApellido().equalsIgnoreCase(apellido)){
                infoPersona += persona.toString();
            }
        }
        return infoPersona;
    }

    public boolean validarPersonaXapellido(String apellido){
        // return buscarPersonaXapellido(apellido).getEdad()==0 ? false : true;
        boolean existe = false;
        if(buscarPersonaXapellido(apellido).getEdad() > 0){
            existe = true;
        }
        return  existe;
    }

    public void actualizarPersonas(String nombre, String apellido, int edad, char sexo, String telefono){
        Persona objPersona = buscarPersonaXapellido(apellido);
        objPersona.setNombre(nombre);
        objPersona.setEdad(edad);
        objPersona.setSexo(sexo);
        objPersona.setTelefono(telefono);
    }

    public void eliminarPersona(String apellido){
        Persona objPersona = buscarPersonaXapellido(apellido);
        personas.remove(objPersona);
    }
}
