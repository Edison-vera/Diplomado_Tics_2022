public class App {
    public static void main(String[] args) throws Exception {
        //Construir un objecto de tipo persona 
        Persona objPersona1 = new Persona("Edison","Vera",25,"1121871159",'M');
        //Obtener el nombre y apellido
        String nombre = objPersona1.getNombre();
        String apellido = objPersona1.getApellido();
        //Imprimir en consola 
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido);

        objPersona1.setNombre("Santiago");
        objPersona1.setApellido("Vera");
        nombre = objPersona1.getNombre();
        apellido = objPersona1.getApellido();
        //Imprimir en consola 
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido);

        //Crear mas personas
        Persona objPersona2 = new Persona("Fernando", "Corredor", 20, "1121871115", 'M');
        objPersona2.setCelular("3017598957");
        objPersona2.setEmail("correo@correo.com");

        Persona objPersona3 = new Persona("Lorena", "Velasquez", 16, "1125471115", 'F');
        objPersona3.setCelular("3017598900");
        objPersona3.setEmail("correo_1@correo.com");

        Persona objPersona4 = new Persona("Angie", "Fernandez", 35, "1125471115", 'F');
        objPersona4.setCelular("3017598880");
        objPersona4.setEmail("correo_2@correo.com");

        Persona objPersona5 = new Persona("Felipe", "Sanchez", 51, "1125471144", 'M');
        objPersona5.setCelular("3017597800");
        objPersona5.setEmail("correo_3@correo.com");

         //Obtener valor nomina
        double nomina;
        apellido = objPersona1.getApellido();
        nomina = objPersona1.calcular_nomina(10);
        System.out.println(apellido+"- Nomina:"+nomina);

        apellido = objPersona2.getApellido();
        nomina = objPersona2.calcular_nomina(10);
        System.out.println(apellido+"- Nomina:"+nomina);

        apellido = objPersona3.getApellido();
        nomina = objPersona3.calcular_nomina(10);
        System.out.println(apellido+"- Nomina:"+nomina);

        apellido = objPersona4.getApellido();
        nomina = objPersona4.calcular_nomina(10);
        System.out.println(apellido+"- Nomina:"+nomina);

        apellido = objPersona5.getApellido();
        nomina = objPersona5.calcular_nomina(10);
        System.out.println(apellido+"- Nomina:"+nomina);

        objPersona1.crear_carro();
    }
}

