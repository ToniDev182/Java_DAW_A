/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciodiscos;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Antonio Atienza Cano
 */
// Clase Main para probar el código
public class EjercicioDiscos {
   // Método principal para probar la funcionalidad
    public static void main(String[] args) {
        // Crear una colección de discos
        ColeccionDiscos coleccion = new ColeccionDiscos();
        
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle principal para interactuar con el usuario
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir Disco");
            System.out.println("2. Buscar por Título");
            System.out.println("3. Mostrar Todos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Añadir Disco
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Género: ");
                    String genero = scanner.nextLine();
                    System.out.print("Duración (minutos): ");
                    int duracion = scanner.nextInt();
                    coleccion.agregarDisco(codigo, autor, titulo, genero, duracion);
                    break;

                case 2:
                    // Buscar por Título
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el título a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    Disco discoEncontrado = coleccion.buscarPorTitulo(tituloBuscar);
                    if (discoEncontrado != null) {
                        System.out.println("Disco encontrado: " + discoEncontrado.toString());
                    } else {
                        System.out.println("No se encontró ningún disco con el título '" + tituloBuscar + "'.");
                    }
                    break;

                case 3:
                    // Mostrar Todos
                    coleccion.mostrarTodos();
                    break;

                case 4:
                    // Salir
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);
        
        // Cerrar el scanner al salir
        scanner.close();
    }
}
