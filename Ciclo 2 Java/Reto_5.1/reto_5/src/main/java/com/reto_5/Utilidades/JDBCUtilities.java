package com.reto_5.Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import var;

public class JDBCUtilities { 
    // Atributos de clase para gestión de conexión con la base de datos
    private static final String UBICACION_BD = "ProyectosConstruccion.db";

    public static var getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }
} 