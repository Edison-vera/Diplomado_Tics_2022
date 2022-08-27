package com.ejemplo_mvc.vista;
import java.util.Scanner;
import com.ejemplo_mvc.controlador.PersonaController;


public class PersonaVista {
    //Atributos
    private PersonaController pController;

    //Constructor
    public PersonaVista() {
        pController = new PersonaController();
    }

    //Interfaz de usuario por consola

    public void crearMenu(){
        //Opciones de menu
        String mensaje = "----------CRUD PERSONAS CON MVC-------------\n";
        mensaje += "1) Crear persona\n";
        mensaje += "2) Mostrar personas\n";
        mensaje += "3) Consultar personas\n";
        mensaje += "4) Actualizar personas\n";
        mensaje += "5) Eliminar personas\n";
        mensaje += "-1) Salir\n";
        mensaje += ">>>";
        //Crear objecto Scanner para capturar los datos por consola

        try (Scanner sc = new Scanner(System.in)){
            //Variable que representa la opcion ingresada por el usuario
            int opcion = 0;
            //Iterar hasta que el usuario indique salir
            while(opcion != -1){
                System.out.print(mensaje);
                //Capturar la opcion ingresada por el usuario
                opcion = sc.nextInt();
                //Evaluar la opcion
                switch (opcion){
                    case 1:
                    //Crear persona
                    crearPersona(sc);
                    break;
                    case 2:
                    //Mostrar personas
                    mostrarPersonas();
                    break;
                    case 3:
                    //Mostrar personas por apellido
                    mostrarPersonaXapellido(sc);
                    break;
                    case 4:
                    //Actializar personas
                    actualizarPersona(sc);
                    break;
                    case 5:
                    //Eliminar personas
                    eliminarPersona(sc);
                    break;
                    default:
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Por favor ingrese valores numericos en el menu");
        }
    }

    public void crearPersona(Scanner sc){
        String encabezado = "--------------------CREAR PERSONA-----------------\n";
        encabezado += "Por favor ingrese la siguiente informacion";
        System.out.println(encabezado);
        //Solicitar datos al usuario
        //Solicitar nombre
        System.out.print("Nombre: ");
        String nombre = sc.next();
        sc.nextLine();
        //Solicitar nombre
        System.out.print("Apellido: ");
        String apellido = sc.next();
        //Solicitar edad
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        //Solicitar sexo
        System.out.print("Sexo: ");
        char sexo = sc.nextLine().charAt(0);
        //Solicitar telefono
        System.out.print("Telefono: ");
        String telefono = sc.next();
        //Crea persona
        pController.crearPersona(nombre, apellido, edad, sexo, telefono);
        System.out.println("\n Perosna creada con exito");
    }

    public void mostrarPersonas(){
        String infoPersonas = "---------------PERSONAS REGISTRADAS---------------\n";
        //Iterarla cantidad de personas que se encuentran registradas
        for (int i = 0; i < pController.getCantidadPersonas(); i++){
            infoPersonas += pController.obtenerPersonaXindex(i);
        }
        System.out.println(infoPersonas);
    }

    public void mostrarPersonaXapellido(Scanner sc){
        System.out.println("-------------------BUSCAR PEROSNA POR APELLIDO-------------------");
        //Solicitar apellido
        System.out.println("Apellido: ");
        String apellido = sc.next();
        sc.nextLine();
        if(pController.validarPersonaXapellido(apellido)){
            String infoPersona = pController.consultarPersona(apellido);
        System.out.println(infoPersona);
        }else {
            System.out.println("\n No existe una persona con el apellido ingresado");
        }
    }

    public void actualizarPersona(Scanner sc){
        //Solicitar datos al usuario
        //Solicitar apellido
        System.out.print("Ingrese el apellido de la persona a actualizar: ");
        String apellido = sc.next();

        if(pController.validarPersonaXapellido(apellido)){
            //Solicitar nombre
        System.out.print("Nombre: ");
        String nombre = sc.next();
        sc.nextLine();
        //Solicitar edad
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        //Solicitar sexo
        System.out.print("Sexo: ");
        char sexo = sc.nextLine().charAt(0);
        //Solicitar telefono
        System.out.print("Telefono: ");
        String telefono = sc.next();

        //Enviar datos al controlador para que actualice la persona
        pController.actualizarPersonas(nombre, apellido, edad, sexo, telefono);
        System.out.println("\n Persona actualizada con exito");

        }else {
            System.out.println("\n No existe una persona con el apellido ingresado");
        }

    }

    public void eliminarPersona(Scanner sc){
        //Solicitar apellido
        System.out.print("Ingrese el apellido de la persona a eliminar: ");
        String apellido = sc.next();
        if(pController.validarPersonaXapellido(apellido)){
            pController.eliminarPersona(apellido);
        }else {
            System.out.println("\n No existe una persona con el apellido ingresado");
        }
    }
}
