/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioclases2;

/**
 *
 * @author miAsus
 */
// Clase Tv que hereda de Producto
class Tv extends Producto {
    private String marca;
    private String modelo;

    public Tv(int codigo, String nombre, double precio, String marca, String modelo) {
        super(codigo, nombre, precio);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}