package com.sigese.sigese.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cargos_empleados")
public class CargoEmpleadoModelo {
    
    //Creando atributos para la base de datos
    @Id
    private int id;
    private String cargo_empleado;

    //Constructor
    public CargoEmpleadoModelo(int id, String cargo_empleado) {
        this.id = id;
        this.cargo_empleado = cargo_empleado;
    }

    //Consultores y modificadores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo_empleado() {
        return cargo_empleado;
    }

    public void setCargo_empleado(String cargo_empleado) {
        this.cargo_empleado = cargo_empleado;
    }


}
