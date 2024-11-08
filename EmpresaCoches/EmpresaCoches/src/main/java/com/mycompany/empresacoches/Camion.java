/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresacoches;

/**
 *
 * @author Antonio Atienza Cano
 */

class Camion extends Vehiculo {

    // Atributo adicional específico para camiones.
    private int pesoMaximo;

    // Constructor que inicializa las propiedades del camión y llama al constructor de la clase base (Vehiculo).
    public Camion(int pesoMaximo, String matricula) {
        super(matricula);
        this.pesoMaximo = pesoMaximo;
    }

    // Método getter para obtener el peso máximo del camión.
    public double getPesoMaximo() {
        return pesoMaximo;
    }

    // Método de sobreescritura que calcula el costo total del alquiler del camión.
    @Override
    public double calcularCostoAlquiler() {
        // Utiliza el método calcularCostoAlquiler() de la clase base (Vehiculo)
        // y agrega un costo adicional por el peso máximo del camión.
        return super.calcularCostoAlquiler() + (pesoMaximo * 0.5);
    }
}

