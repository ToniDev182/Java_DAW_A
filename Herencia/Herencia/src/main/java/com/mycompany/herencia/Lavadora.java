/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Antonio Atienza cano
 */
public class Lavadora extends Electrodomestico {

    // Atributo específico de Lavadora
    private double carga;

    // Constante por defecto para la carga
    private static final double CARGA_DEFECTO = 5;

    // Constructor por defecto
    public Lavadora() {
        super(); // Llama al constructor por defecto de la clase padre (Electrodomestico)
        this.carga = CARGA_DEFECTO;
    }

    // Constructor con precio y peso, el resto por defecto
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso); // Llama al constructor de la clase padre con precio y peso
        this.carga = CARGA_DEFECTO;
    }

    // Constructor con carga y el resto de atributos heredados
    public Lavadora(double carga, String color, char consumoEnergetico, double precioBase, double peso) {
        super(color, consumoEnergetico, precioBase, peso); // Llama al constructor de la clase padre con todos los atributos
        this.carga = carga;
    }

    // Método get de carga
    public double getCarga() {
        return carga;
    }

    // Método para calcular el precio final de la Lavadora
    @Override
    protected double precioFinal() {
        // Llama al método precioFinal de la clase padre (Electrodomestico)
        double precioFinal = super.precioFinal();

        // Incrementa el precio en 50 € si la carga es mayor de 30 kg
        if (carga > 30) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}
