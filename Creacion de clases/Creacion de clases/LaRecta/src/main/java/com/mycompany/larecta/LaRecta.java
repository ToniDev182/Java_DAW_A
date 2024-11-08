/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.larecta;

/**
 *
 * @Antonio Atienza Cano
 */
public class LaRecta {
    
public static void main(String[] args) {
    Recta recta1 = new Recta(1, 2, 3, 4);
    Recta recta2 = new Recta(2, 3, 4, 5);

    System.out.println("Longitud de la recta 1: " + recta1.longitud());
    System.out.println("Punto (3, 4) pertenece a la recta 1: " + recta1.pertenece(3, 4));
    System.out.println("Pendiente de la recta 1: " + recta1.pendiente());
    System.out.println("Relación entre recta1 y recta2: " + recta1.relacion(recta2));
  }
}