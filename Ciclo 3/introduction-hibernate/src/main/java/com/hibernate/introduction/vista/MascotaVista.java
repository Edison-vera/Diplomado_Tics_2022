package com.hibernate.introduction.vista;
import java.util.List;

import javax.swing.JOptionPane;

import com.hibernate.introduction.controlador.*;
public class MascotaVista {

    private MascotaControlador controlador;

    public MascotaVista(){
        controlador = new MascotaControlador();
    }

    public void mostrasMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void crearMascota(){
        String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre de la mascota: ");
        String apellido = JOptionPane.showInputDialog(null, "Ingrese apellido del propietario: ");
        String tipoMascota = JOptionPane.showInputDialog(null, "Ingrese tipo de la mascota: ");
        String raza = JOptionPane.showInputDialog(null, "Ingrese la raza de la mascota: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la mascota: "));
        String observacion = JOptionPane.showInputDialog(null, "Observacion: ");
        
        //Enviar los datos
        try {
            controlador.create(nombre, apellido, tipoMascota, raza, edad, observacion);
            JOptionPane.showMessageDialog(null,"Mascota actualizada con éxito");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Intente mas tarde");
        }
    }

    public void actualizarMascota(){
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el id de la mascota"));
        String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre de la mascota: ");
        String apellido = JOptionPane.showInputDialog(null, "Ingrese apellido del propietario: ");
        String tipoMascota = JOptionPane.showInputDialog(null, "Ingrese tipo de la mascota: ");
        String raza = JOptionPane.showInputDialog(null, "Ingrese la raza de la mascota: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la mascota: "));
        String observacion = JOptionPane.showInputDialog(null, "Observacion: ");
        try {
            controlador.update(id,nombre, apellido, tipoMascota, raza, edad, observacion);
            JOptionPane.showMessageDialog(null,"Mascota creada con éxito");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Intente mas tarde");
        }

    }

    public void consultarMascotaXid(){
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el id de la mascota"));
        try {
            String info = controlador.redaById(id);
            mostrasMensaje(info);
        } catch (Exception e) {
            e.printStackTrace();
            mostrasMensaje("Por favor intente mas tarde");
        }
    }

    public void consultarMascotasXapellido(){
        String apellido = JOptionPane.showInputDialog(null, "Por favor ingrese el apellido");
        try {
            List<String> mascotas = controlador.getByLastname(apellido);
            String info = listTostring(mascotas);
            mostrasMensaje(info);
        } catch (Exception e) {
            e.printStackTrace();
            mostrasMensaje("Por favor intente mas tarde");
        }
    }

    public String listTostring(List<String> list){
        String info ="------------------MASCOTAS-----------------";
            for (int i = 0; i < list.size(); i++){
                info += list.get(i);

            }
            return info;
    }

    public void listarMascotas(){
        try {
            List<String> mascotas = controlador.getList();
            String info = listTostring(mascotas);
            mostrasMensaje(info);
        } catch (Exception e) {
            e.printStackTrace();
            mostrasMensaje("Por favor intente mas tarde");
        }
    }

    public void eliminarMascota(){
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el id de la mascota a eliminar"));
        controlador.delete(id);
        mostrasMensaje("Mascota eliminada con exito!");
    }

    public void menu(){
        String info = "1) Registrar Mascota\n";
        info += "2) Consultar mascota por Id\n";
        info += "3) Consultar mascotas por apellido\n";
        info += "4) Actualizar info mascota\n";
        info += "5) Eliminar mascota\n";
        info += "6) Listar mascotas\n";
        info += "-1 Salir\n";

        int opc = 0;
        while(opc != -1){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,info));
            switch(opc){
                case 1:
                crearMascota();
                break;
                case 2:
                consultarMascotaXid();
                break;
                case 3:
                consultarMascotasXapellido();
                break;
                case 4:
                actualizarMascota();
                break;
                case 5:
                eliminarMascota();
                break;
                case 6:
                listarMascotas();
                break;
                case -1:
                break;
                default:
                mostrasMensaje("Por favor ingrese una opcion validad");
                break;
            }
        }
    }
}
