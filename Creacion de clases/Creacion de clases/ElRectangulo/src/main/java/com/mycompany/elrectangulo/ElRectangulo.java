/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elrectangulo;

/**
 *
 * @Antonio Atienza Cano
 */
public class ElRectangulo {

  public static void main(String[] args) {
        // Crear un rectángulo utilizando el constructor parametrizado
        Rectangulo miRectangulo = new Rectangulo(16.0, 10.0);

        // Calcular y mostrar el perímetro y el área
        System.out.println("Perímetro: " + miRectangulo.calcularPerimetro());
        System.out.println("Área: " + miRectangulo.calcularArea());
    }
}
