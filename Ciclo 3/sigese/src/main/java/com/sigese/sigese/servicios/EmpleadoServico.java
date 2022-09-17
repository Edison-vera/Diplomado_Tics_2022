package com.sigese.sigese.servicios;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.sigese.sigese.modelo.EmpleadoModelo;

public class EmpleadoServico {
    //Atributos
    SessionFactory factory;

    public EmpleadoServico() {
        // Crear objeto fabrica de session
        factory = new Configuration()
                .configure("cfg.xml")
                .addAnnotatedClass(EmpleadoModelo.class)
                .buildSessionFactory();
    }
    
    public Session createSession() {
        Session session = factory.openSession();
        session.beginTransaction();
        return session;
    }

    

}
