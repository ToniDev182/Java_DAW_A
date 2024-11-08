/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaelectrodomesticos;

/**
 *
 * @author 34639
 */
    class Lavadora extends Electrodomestico {

    private int carga;

    // Constructores
    public Lavadora(int carga, String color, String consumoEnergetico, int peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    // Métodos get
    public int getCarga() {
        return carga;
    }
}