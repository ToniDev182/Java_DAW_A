/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciofecha;

/**
 *
 * @Antonio Atienza Cano
 */
public class EjercicioFecha {

   public static void main(String[] args) {
    // Ejemplo de uso

    // Crear una instancia de la clase Fecha con la cadena "12/02/2020"
    Fecha fecha1 = new Fecha("12/10/2020");
    
    // Imprimir en la consola si la fecha1 es válida respecto a la fecha actual
    System.out.println("Fecha válida: " + fecha1.fechaValida());

    // Crear otra instancia de la clase Fecha con la cadena "10/10/2018"
    Fecha fecha2 = new Fecha("10/24/2018");

    // Calcular la diferencia en días entre fecha1 y fecha2
    int diasDiferencia = fecha1.diferencia(fecha2);

    // Imprimir en la consola la diferencia en días
    System.out.println("Diferencia en días: " + diasDiferencia);
}
}
