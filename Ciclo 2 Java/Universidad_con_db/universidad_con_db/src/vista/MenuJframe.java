package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuJframe extends JFrame {
    
    //Atriutos
    private JButton btnCrearUniversidad;
    private JButton btnMostrarUniversidades;

    //Constructor
    public MenuJframe(){
        //Setear el titulo
        setTitle("CRUD DE UNIVERSIDADES");
        //Setear el layout
        getContentPane().setLayout(null);
        //Indicar cerrar programa (x)
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Indicar el tamaño de la ventana
        setBounds(100, 100, 400, 200);
        //Inicializar los atributos
        btnCrearUniversidad = new JButton("Crear Universidad");
        btnCrearUniversidad.setBounds(20, 20, 160 , 40);

        btnMostrarUniversidades = new JButton("Mostrar Universidades");
        btnMostrarUniversidades.setBounds(190, 20, 160 , 40);

        //Manejadores de eventos
        btnCrearUniversidad.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                CrearUniversidadJframe cUniversidadJframe = new CrearUniversidadJframe();
            }
        });

        btnMostrarUniversidades.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
                
                
            }
        });

        //Añadir elementos a la ventana
        add(btnCrearUniversidad);
        add(btnMostrarUniversidades);

        setVisible(true);


    }
    
}
