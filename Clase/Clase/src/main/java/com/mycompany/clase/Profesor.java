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
// Clase hija Profesor que hereda de Trabajador
class Profesor extends Trabajador {
    private String departamento;

    // Constructor parametrizado de la clase Profesor
    public Profesor(String nombre, String apellido1, String apellido2, Date fechaNacimiento, int nrp, String departamento) {
        // Llama al constructor de la clase padre (Trabajador)
        super(nombre, apellido1, apellido2, fechaNacimiento, nrp);
        this.departamento = departamento;
    }

    // Método getter para acceder al atributo departamento
    public String getDepartamento() {
        return departamento;
    }
}