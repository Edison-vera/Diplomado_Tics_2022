package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class menu extends JFrame implements ActionListener {
    JPanel panel01;
    JButton btn01;
    JButton btn02;
    JButton btn03;

    public menu(){
        setTitle("Informes de Proyectos");
        setSize(300, 320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        btn01 = new JButton("1. Primer informe");
        btn01.setBounds(70, 40 ,150, 40);
        btn01.addActionListener((ActionListener) this);
        add(btn01);

        btn02 = new JButton("2. Primer informe");
        btn02.setBounds(70, 120 ,150, 40);
        btn02.addActionListener((ActionListener) this);
        add(btn02);

        btn03 = new JButton("3. Primer informe.");
        btn03.setBounds(70, 200 ,150, 40);
        btn03.addActionListener((ActionListener) this);
        add(btn03);


        panel01 = new JPanel();
        add(panel01);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn01){
        new Interfaz1();
        }
        else if(e.getSource() == btn02){
            new Interfaz2();
        }
        else if(e.getSource() == btn03){
            new Interfaz3();
        }
}
}

