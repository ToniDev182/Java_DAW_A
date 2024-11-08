/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresacoches;

/**
 *
 * @author Antonio Atienza Cano
 */
class Coche extends Vehiculo {

    // Atributo adicional específico para coches.
    private int numPlazas;

    // Constructor que inicializa las propiedades del coche y llama al constructor de la clase base (Vehiculo).
    public Coche(int numPlazas, String matricula) {
        super(matricula);
        this.numPlazas = numPlazas;
    }

    // Método setter para establecer el número de plazas del coche.
    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    // Método de sobreescritura que calcula el costo total del alquiler del coche.
    @Override
    public double calcularCostoAlquiler() {
        // Utiliza el método calcularCostoAlquiler() de la clase base (Vehiculo)
        // y agrega un costo adicional por cada plaza multiplicado por los días de alquiler.
        return super.calcularCostoAlquiler() + (numPlazas * 1.5 * getDiasAlquiler());
    }
}