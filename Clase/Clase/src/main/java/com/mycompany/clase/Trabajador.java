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
// Clase hija Trabajador que hereda de Persona
class Trabajador extends Persona {
    private int nrp;

    // Constructor parametrizado de la clase Trabajador
    public Trabajador(String nombre, String apellido1, String apellido2, Date fechaNacimiento, int nrp) {
        // Llama al constructor de la clase padre (Persona)
        super(nombre, apellido1, apellido2, fechaNacimiento);
        this.nrp = nrp;
    }

    // Método getter para acceder al atributo nrp
    public int getNrp() {
        return nrp;
    }
}