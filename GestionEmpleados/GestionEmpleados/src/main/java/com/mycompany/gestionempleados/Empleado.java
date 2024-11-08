/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionempleados;

/**
 *
 * @author 34639
 */

// Clase abstracta Empleado
abstract class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;

    public Empleado(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    // Método abstracto para calcular el sueldo (debe ser implementado por las clases hijas)
    public abstract double calcularSueldo();

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }
}
