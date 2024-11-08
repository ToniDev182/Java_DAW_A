/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioclases2;

/**
 *
 * @author miAsus
 */

import java.util.Scanner;

// Clase principal que contiene el método main
public class EjercicioClases2 {
    public static void main(String[] args) {
        // Crear una instancia de la clase Almacen
        Almacen almacen = new Almacen();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menú principal con un bucle do-while
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Añadir Producto");
            System.out.println("2. Buscar Producto por código");
            System.out.println("3. Listar Todos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            // Utilizar un switch para manejar las opciones del menú
            switch (opcion) {
                case 1:
                    almacen.anadirProducto();
                    break;
                case 2:
                    almacen.buscarProductoPorCodigo();
                    break;
                case 3:
                    almacen.listarTodos();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }
}