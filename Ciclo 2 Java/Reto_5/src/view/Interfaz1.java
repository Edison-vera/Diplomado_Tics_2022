package view;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.vo.Consulta1Vo;


import java.awt.*;
import java.util.ArrayList;



public class Interfaz1 extends JFrame {
    
    JPanel panelg;
    JTable tabla;
    JScrollPane scpanel01;
    DefaultTableModel modelo;

    public Interfaz1(){
        setTitle("1. Primer informe.");
        setSize(500, 500);
        setResizable(false);

        panelg = new JPanel();
        panelg.setBackground(new Color(40 ,144, 73));

        String [] columnas = {"ID", "Nombre", "Apellido", "Ciudad"};
        ArrayList<String[]> d = Consulta1Vo.valores();
        String[][] datos = new String[d.size()][4];

        for (int i = 0; i < d.size(); i++){
            int j = 0;
            for(String s : d.get(i)){
                datos[i][j] = s;
                j++;
            }
        }
        
        modelo = new DefaultTableModel(datos, columnas);
        tabla = new JTable(modelo);


        scpanel01 = new JScrollPane(tabla);
        scpanel01.setBounds(20, 20, 440 , 420);
        add(scpanel01);

        add(panelg);
        setVisible(true);

    }
}
