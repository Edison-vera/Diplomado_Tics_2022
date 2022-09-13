package com.hibernate.introduction;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotatedClassType;
import org.hibernate.cfg.Configuration;

import com.hibernate.introduction.modelo.Mascota;
import com.hibernate.introduction.vista.MascotaVista;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // //Crear objeto fabricante de sesiones
        // SessionFactory factory = new Configuration()
        // .configure("cfg.xml")
        // .addAnnotatedClass(Mascota.class)
        // .buildSessionFactory();
        // //Abrir sesion
        // Session session = factory.openSession(); 
        // //Preparar la sesion para realizar transacciones
        // session.beginTransaction();

        // //Generar transacciones
        // try {
        //     //CRUD
            
        //     //*******************Create******************
        //     //Mascota mascota = new Mascota("Lupe ","Corredor", "Gato", "Pincher", 10, "Un gato");
        //     //session.persist(mascota);
        //     //session.getTransaction().commit();
        //     //********************Read***********************
        //     //Obtener una sola entida por id
        //     Mascota  mascota = session.find(Mascota.class, 2);
        //         System.out.println(mascota);
        //     Mascota mascota1 = session.byId(Mascota.class).load(3);
        //         System.out.println(mascota1);
            
        //     List<Mascota> mascota2 =session.createQuery("from Mascota", Mascota.class).list();
                
        //         for(int i = 0; i<mascota2.size(); i++){
        //             System.out.println(mascota2.get(i));
        //         }
        //     /********************Udate*************** */
        //     Mascota mascota4 = session.find(Mascota.class, 3);
        //         mascota4.setRaza("Dalmata");
        //         mascota4.setEdad(5);
        //         mascota4.setObservacion("No tiene dueño");
        //     ///Gardar cambios
        //         session.merge(mascota4);
        //         session.getTransaction().commit();
        //     //***********Delete ***************/
        //     Mascota mascota5 = session.find(Mascota.class, 1);
        //             session.remove(mascota5);
        //             session.getTransaction().commit();
        // } catch (Exception e) {
        //     System.out.print("Error");
        // }
        // //Cerrar sesion
        // session.close();

        MascotaVista vista = new MascotaVista();
        //vista.crearMascota();
        //vista.consultarMascotaXid();
        vista.menu();
    }
}
