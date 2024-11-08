/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tiendaelectrodomesticos;

/**
 *
 * @author 34639
 */
import java.util.Scanner;

public class TiendaElectrodomesticos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        System.out.println("¡Bienvenido a la tienda de electrodomésticos!");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Comprar lavadora");
        System.out.println("2. Comprar televisión");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt()

        switch (opcion) {
            case 1:
                comprarLavadora(scanner, electrodomesticos);
                break;
            case 2:
                comprarTelevision(scanner, electrodomesticos);
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void comprarLavadora(Scanner scanner, Electrodomestico[] electrodomesticos) {
        System.out.println("Elija las características de la lavadora:");

        System.out.print("Carga: ");
        int carga = scanner.nextInt();

        System.out.print("Color (blanco, negro, rojo, azul, gris): ");
        String color = scanner.next().toLowerCase();

        System.out.print("Consumo energético (A-F): ");
        String consumoEnergetico = scanner.next().toUpperCase();

        System.out.print("Peso: ");
        int peso = scanner.nextInt();

        Lavadora lavadora = new Lavadora(carga, color, consumoEnergetico, peso);

        System.out.println("Precio final de la lavadora: " + lavadora.precioFinal());
    }

    private static void comprarTelevision(Scanner scanner, Electrodomestico[] electrodomesticos) {
        System.out.println("Elija las características de la televisión:");

        System.out.print("Resolución (pulgadas): ");
        int resolucion = scanner.nextInt();

        System.out.print("¿Tiene sintonizador TDT incorporado? (true/false): ");
        boolean sintonizadorTDT = scanner.nextBoolean();

        System.out.print("Peso: ");
        int peso = scanner.nextInt();

        Television television = new Television(resolucion, sintonizadorTDT, peso);

        System.out.println("Precio final de la televisión: " + television.precioFinal());
    }
}
