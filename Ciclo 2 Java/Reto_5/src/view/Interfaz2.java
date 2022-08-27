package view;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

import model.vo.Consulta2Vo;

public class Interfaz2 extends JFrame {
    
    JPanel panelg;
    JTable tabla;
    JScrollPane scpanel01;
    DefaultTableModel modelo;

    public Interfaz2(){
        setTitle("2. Segundo informe.");
        setSize(500, 500);
        setResizable(false);

        panelg = new JPanel();
        panelg.setBackground(new Color(40 ,144, 73));

        String [] columnas = {"ID_Proyecto", "Constructora", "Numero_Habitaciones"};
        ArrayList<String[]> d = Consulta2Vo.valores();
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
