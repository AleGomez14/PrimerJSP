
package com.modelo;

/**
 * Nombre de la clase:Empleado
 * Fecha:4/09/2017
 * Version:1.0
 * Copyright:ITCA-FEPADE
 * @author Gabriela Gomez
 */
public class Empleado {
    private int codigo;
    private String nombre;
    private int edad;
    private String genero;
    private String cargo;
    private double sueldo;
    private String[] intereses;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, int edad, String genero, String cargo, double sueldo, String[] intereses) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.intereses = intereses;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String[] getIntereses() {
        return intereses;
    }

    public void setIntereses(String[] intereses) {
        this.intereses = intereses;
    }
    
    
    
    
    
}
