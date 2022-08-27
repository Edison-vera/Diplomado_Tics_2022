package view;


import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

import model.vo.Consulta3Vo;

public class Interfaz3 extends JFrame {
    
    JPanel panelg;
    JTable tabla;
    JScrollPane scpanel01;
    DefaultTableModel modelo;

    public Interfaz3(){
        setTitle("3. Tercer informe.");
        setSize(500, 500);
        setResizable(false);

        panelg = new JPanel();
        panelg.setBackground(new Color(40 ,144, 73));
        String [] columnas = {"ID_Compra", "Constructora", "Banco"};
        ArrayList<String[]> d = Consulta3Vo.valores();
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
        scpanel01.setBounds(20, 20, 440 , 345);
        add(scpanel01);

        add(panelg);
        setVisible(true);

    }
}
