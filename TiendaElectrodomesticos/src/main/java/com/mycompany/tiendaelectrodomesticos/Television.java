/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaelectrodomesticos;

/**
 *
* @author 34639
 */
class Television extends Electrodomestico {

    private int resolucion;
    private boolean sintonizadorTDT;

    // Constructores
    public Television(int resolucion, boolean sintonizadorTDT, int peso) {
        super(null, null, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Métodos get
    public int getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    // Método para calcular el precio final
    @Override
    public int precioFinal() {
        int precioFinalPadre = super.precioFinal(); // Llama al método precioFinal de la clase padre

        // Aumenta el precio en un 30% si la resolución es mayor de 40 pulgadas
        if (resolucion > 40) {
            precioFinalPadre += (precioFinalPadre * 0.3);
        }

        // Aumenta 50 € si tiene sintonizador TDT incorporado
        if (sintonizadorTDT) {
            precioFinalPadre += 50;
        }

        return precioFinalPadre;
    }
}