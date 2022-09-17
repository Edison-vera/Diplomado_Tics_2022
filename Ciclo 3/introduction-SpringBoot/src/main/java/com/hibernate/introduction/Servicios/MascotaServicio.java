package com.hibernate.introduction.Servicios;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.hibernate.introduction.modelo.Mascota;


public class MascotaServicio {
    // Atributos
    SessionFactory factory;

    public MascotaServicio() {
        // Crear objeto fabrica de session
        factory = new Configuration()
                .configure("cfg.xml")
                .addAnnotatedClass(Mascota.class)
                .buildSessionFactory();
            
    }
    
    public Session createSession() {
        Session session = factory.openSession();
        session.beginTransaction();
        return session;
    }

    public List<Mascota> getList() throws Exception {
        Session session = createSession();
        List<Mascota> mascotas = session.createQuery("from Mascota", Mascota.class).list();
        session.close();
        return mascotas;
    }

    public Mascota redaById(int id) throws Exception {
        Session session = createSession();
        Mascota mascota = session.find(Mascota.class, id);
        session.close();
        return mascota;
    }


    public List<Mascota> getByLastname( String nombre, String apellido) throws Exception {
        Session session = createSession();
        List<Mascota> objMascotas = session
                .createQuery("from Mascota where nombre = :n and apellido = :ap", Mascota.class)
                .setParameter("n", nombre)
                .setParameter("ap", apellido).list();
        session.close();
        return objMascotas;
        // return mascotas;
    }

    public String create( Mascota mascota) {
        String message = "";
        Session session = createSession();
        try {
        session.persist(mascota);
        session.getTransaction().commit();
        message = "Mascota creada con exito";
        } catch (Exception e) {
            message = e.getMessage();
        }
        session.close();
        return message;
    }
    

    public void update(Mascota mascota) {
        Session session = createSession();
        // Realizar actualizacion de la BD
        session.merge(mascota);
        session.getTransaction().commit();
        session.close();
    }

    public List<String> objToString(List<Mascota> objMascotas) {
        List<String> mascotas = new ArrayList<>();
        for (int i = 0; i < objMascotas.size(); i++) {
            mascotas.add(objMascotas.get(i).toString());
        }
        return mascotas;
    }

    public String delete(int id) {
        Session session = createSession();
        Mascota mascota = session.find(Mascota.class, id);
        deleteService(mascota);
        session.close();
        return "Mascota eliminada con exito";
    }

    public void deleteService(Mascota mascota) {
        Session session = createSession();
        session.remove(mascota);
        session.getTransaction().commit();
        session.close();
    }
    
}
