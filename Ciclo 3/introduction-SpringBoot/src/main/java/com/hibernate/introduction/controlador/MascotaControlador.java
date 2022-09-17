package com.hibernate.introduction.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.introduction.Servicios.MascotaServicio;
import com.hibernate.introduction.modelo.Mascota;

@RestController
@RequestMapping("/mascotas")
public class MascotaControlador {

    private MascotaServicio servicio;

    public MascotaControlador() {
        this.servicio = new MascotaServicio();
    }

    @GetMapping
    //Dar permisos de dominio CrossOrigin
    @CrossOrigin("*")
    public List<Mascota> getList() {
        List<Mascota> mascotas = new ArrayList<>();
        try {
            mascotas = servicio.getList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mascotas;
    }

    @GetMapping("/{id}")
    //Dar permisos de dominio CrossOrigin
    @CrossOrigin("*")
    public Mascota redaById(@PathVariable(name = "id") int id) {
        Mascota mascota = new Mascota();
        try {
            mascota = servicio.redaById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mascota;
    }

    @GetMapping("/fullname")
    //Dar permisos de dominio CrossOrigin
    @CrossOrigin("*")
    public List<Mascota> getByLastname(@RequestParam String nombre, @RequestParam String apellido) {
        List<Mascota> mascotas = new ArrayList<>();
        try {
            mascotas = servicio.getByLastname(nombre, apellido);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mascotas;
        // return mascotas;
    }

    @PostMapping
    //Dar permisos de dominio CrossOrigin
    @CrossOrigin("*")
    public String create(@RequestBody Mascota mascota) {
        return servicio.create(mascota);

    }

    @PutMapping
    //Dar permisos de dominio CrossOrigin
    @CrossOrigin("*")
    public String update(@RequestBody Mascota mascota) {
        String message = "";
        try {
            servicio.update(mascota);
            message = "Mascota actualizada con exito";
        } catch (Exception e) {
            message = e.getMessage();
        }
        return message;
    }

    @DeleteMapping("/{id}")
    //Dar permisos de dominio CrossOrigin
    @CrossOrigin("*")
    public String delete(@PathVariable(name = "id") int id) {
        return servicio.delete(id);
    }

}
