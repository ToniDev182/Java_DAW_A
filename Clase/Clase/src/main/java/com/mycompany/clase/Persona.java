/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase;

/**
 *
 * @Antonio Atienza Cano
 */
import java.util.Date;

class Persona {
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected Date fechaNacimiento;

    // Constructor parametrizado de la clase Persona
    public Persona(String nombre, String apellido1, String apellido2, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para calcular la edad basada en la fecha de nacimiento
    public int calcularEdad() {
        Date fechaActual = new Date();
        long tiempo = fechaActual.getTime() - fechaNacimiento.getTime();
        return (int) (tiempo / (1000 * 60 * 60 * 24 * 365.25));
    }

    // Métodos getter para acceder a los atributos de la clase Persona
    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
}