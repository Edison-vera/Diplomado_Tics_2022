package com.ejemplo_mvc;

import java.util.Scanner;

import com.ejemplo_mvc.modelo.Persona;
import com.ejemplo_mvc.vista.PersonaVista;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PersonaVista pVista = new PersonaVista();
        pVista.crearMenu();

        
    }
}
