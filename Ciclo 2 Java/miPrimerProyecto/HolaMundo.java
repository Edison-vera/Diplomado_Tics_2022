
package miPrimerProyecto;

public class HolaMundo{
    public static void main(String[] args) {
        
        //Mostrar mensaje en consola
        System.out.println("Hola mundo");
        System.out.print("Otra linea");

        //Variables
        int entero;
        entero = 10;
        double decimales = 5.5;
        boolean bandera = true;
        String nombre = "Edison";
        char caracter = 'a';

        //Concatenando dentro de in print
        System.out.println("Entero->"+entero);
        System.out.println("Decimales->"+decimales);
        System.out.println("Boolean->"+bandera);
        System.out.println("String->"+nombre);
        System.out.println("Char->"+caracter);

        //
        double suma;
        suma = 10 + 10;
        double mult = 5 * 10;
        int modulo = 10%2;
        double div = 10 / 2;
        int resta = 10 - 5;

        suma += 10;
        mult *= 2;
        div /= 2;
        resta -= 2;
        System.out.println("Suma->" +suma);
        //Incrementa una unidad
        suma++;
        System.out.println("Suma->" +suma);

        System.out.println("Resta->" +resta);
        //Decrementa una unidad
        resta--;
        System.out.println("Resta->" +resta);
        //Llamar funcion INCREMENTAL
        incremental();
        decrementar();
        operadores_logicos();
        cadenas();
        libreria_math();
        
    }

    public static void incremental(){
        System.out.println("---------------------------------INCREMENTAL-----------------------------");
        int x = 0;
        //Inprimir valor inicial de "X"
        System.out.println(x);
        //Incremental
        System.out.println("INCREMENTAL");
        System.out.println(++x);
        System.out.println(++x);

        //Postincremental
        System.out.println("POSTINCREMENTAL");
        System.out.println(x++);
        System.out.println(x);
        x++;
        System.out.println(x);
    }

    public static void decrementar(){
        System.out.println("DECREMENTAL");
        int x = 10;
        //Imprimir valor inicial de x
        System.out.println(x);
        System.out.println(--x);
        System.out.println(--x);

        //Postdecremental
        System.out.println("POSTDECREMENTAL");
        System.out.println(x--);
        System.out.println(x);
    }

    public static void operadores_logicos(){
        
        System.out.println("OPERADORES LOGICOS");
        int n1 = 10;
        int n2 = 10;
        int n3 = 5;
        int n4 = 8;
        boolean resultado;

        resultado = n1 == n2;
        System.out.println(resultado);
        resultado = n1 > n3;
        System.out.println(resultado);
        resultado = n4 <= n3;
        System.out.println(resultado);
        resultado = n4 != n3;
        System.out.println(resultado);
    }

    public static void cadenas(){
        
        System.out.println("CADENAS DE TEXTO");

        String mensaje_1 = "Hola mundo";
        String mensaje_2 = "TCIS 2022";
        int n1 = 10;
        double n2 = 3.1416;

        String mensaje = mensaje_1 + " " + mensaje_2;
        System.out.println(mensaje);
        
        mensaje = mensaje_1 + " " + n1;
        System.out.println(mensaje);

        mensaje = mensaje_2 + " " + n2;
        System.out.println(mensaje);
        
        // Convertir en mayuscula
        mensaje = mensaje_1.toUpperCase();
        System.out.println(mensaje);
        // converir en minisculas
        mensaje = mensaje.toLowerCase();
        System.out.println(mensaje);

        //Obtener tamaño
        int tama = mensaje_1.length();
        System.out.println(tama);
        //Obtener caracter a partir de su posicion
        char caracter = mensaje_1.charAt(5);
        System.out.println("Caracter->" + caracter);
        //Obtener posicion de un caracter
        int index = mensaje_1.indexOf('H');
        System.out.println(index);
        //Igualar cadena de caracter eqauls diferencia entre mayusculas y minusculas
        mensaje_1 = "HOLA";
        mensaje_2 = "hola";
        boolean igual = mensaje_1.equals(mensaje_2);
        System.out.println("Igual ->" +igual);

        igual = mensaje_1.equalsIgnoreCase(mensaje_2);
        System.out.println("Igual ->" +igual);
    }

    public static void libreria_math(){
        
        //Elevar a la potencia un numero 
        double resultado = Math.pow(5, 2);
        System.out.println("5^2 ->" + resultado);
        //Raiz cuadra
        resultado = Math.sqrt(500);
        System.out.println("Raiz cuadrada de 500 ->" + resultado);
    }
} 

