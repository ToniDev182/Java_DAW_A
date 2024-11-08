/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioclases2;

/**
 *
 * @author miAsus
 */
// Clase Frigorifico que hereda de Producto
class Frigorifico extends Producto {
    private String tipo;
    private int capacidad;

    public Frigorifico(int codigo, String nombre, double precio, String tipo, int capacidad) {
        super(codigo, nombre, precio);
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
