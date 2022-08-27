package miPrimerProyecto;

import java.util.Scanner;
import java.util.function.Function;

public class ejercicio_1 {
    
    public static void main(String[] args){
        /*  */

        Calcular_numero_suerte();
    }

    public static void Calcular_numero_suerte(){
        //Capturar datos por consola
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor ingrese su dia de nacimiento: ");
        int dia = entrada.nextInt();
        System.out.println("Por favor ingrese su mes de nacimiento: ");
        int mes = entrada.nextInt();
        System.out.println("Por favor ingrese su año de nacimiento: ");
        int year = entrada.nextInt();

        String suma = ""+ dia + mes + year;
        int suerte = Integer.parseInt(""+suma.charAt(0));
        suerte += Integer.parseInt(""+suma.charAt(1));
        suerte += Integer.parseInt(""+suma.charAt(2));
        suerte += Integer.parseInt(""+suma.charAt(3));
        System.out.println("Numero de la suerte"+suerte);
    
    }
}
