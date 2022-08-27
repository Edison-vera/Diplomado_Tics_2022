package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrearUniversidadJframe extends JFrame implements addActionListener {
    
    //Atributos
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JLabel btbCrear;

    //Constructor
    public CrearUniversidadJframe(){
        //Configurar Ventana
        //Indicamor el titulo
        setTitle("Formulario Universidad");
        //Setear layout para trabajar por coordenadas
        getContentPane().setLayout(null);
        //Indicar el tamaño y la ubicacion de la ventana
        setBounds(100, 100, 300, 400);
        //Inicializar los atributos de la ventana
        lblNombre = new JLabel("Nit: ");
        txtNombre = new JTextField(30);
        //Indicar las coordenadas de los elementos
        lblNombre.setBounds(20, 20, 50, 20);
        txtNombre.setBounds(71, 20, 100, 25);

        //....Aqui inicializar btnCrear


        //Manejador de eventos para el boton crear
        btbCrear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //Obtener texto del campo del texto txtNombre
                String nombre = txtNombre.getText();
                
            }
        });

        //Añadir elementos a la ventana
        add(lblNombre);
        add(txtNombre);

        setVisible(true);
    }
    

}
