/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase;

import java.util.Date;

/**
 *
 * @Antonio Atienza Cano
 */

// Clase hija Alumno que hereda de Persona
class Alumno extends Persona {
    private int nia;

    // Constructor parametrizado de la clase Alumno
    public Alumno(String nombre, String apellido1, String apellido2, Date fechaNacimiento, int nia) {
        // Llama al constructor de la clase padre (Persona)
        super(nombre, apellido1, apellido2, fechaNacimiento);
        this.nia = nia;
    }

    // Método getter para acceder al atributo nia
    public int getNia() {
        return nia;
    }
}
