package com.hibernate.introduction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotatedClassType;
import org.hibernate.cfg.Configuration;

import com.hibernate.introduction.modelo.Mascota;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Crear objeto fabricante de sesiones
        SessionFactory factory = new Configuration()
        .configure("cfg.xml")
        .addAnnotatedClass(Mascota.class)
        .buildSessionFactory();
        //Abrir sesion
        Session session = factory.openSession(); 
        //Preparar la sesion para realizar transacciones
        session.beginTransaction();

        //Generar transacciones
        try {
            //CRUD
            
            //Create
            Mascota mascota = new Mascota("Niño","Vera", "Perro", "Pincher", 15, "Un perro");
            session.persist(mascota);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.print("Error");
        }
        //Cerrar sesion
        session.close();
    }
}
