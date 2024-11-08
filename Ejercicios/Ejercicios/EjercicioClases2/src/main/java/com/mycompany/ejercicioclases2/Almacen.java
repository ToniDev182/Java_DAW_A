/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioclases2;

import java.util.Scanner;

/**
 *
 * @author Antonio Atienza Cano
 */
// Clase Almacen que contiene un vector de Productos
class Almacen {
    private Producto[] productos;
    private int contador;

    // Constructor de la clase Almacen
    public Almacen() {
        productos = new Producto[100];
        contador = 0;
    }

    // Método para añadir un nuevo producto al almacén
    public void anadirProducto() {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        String nombre;
        double precio;
        String tipoProducto;

        System.out.print("Ingrese el código del producto: ");
        codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nombre del producto: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el tipo de producto (Tv o Frigorífico): ");
        tipoProducto = scanner.nextLine();

        // Utilizar un if-else para manejar los dos tipos de productos
        if (tipoProducto.equalsIgnoreCase("Tv")) {
            String marca;
            String modelo;

            System.out.print("Ingrese la marca de la TV: ");
            marca = scanner.nextLine();
            System.out.print("Ingrese el modelo de la TV: ");
            modelo = scanner.nextLine();

            // Crear una instancia de la clase Tv y almacenarla en el vector de productos
            Tv tv = new Tv(codigo, nombre, precio, marca, modelo);
            productos[contador] = tv;
            contador++;
        } else if (tipoProducto.equalsIgnoreCase("Frigorífico")) {
            String tipo;
            int capacidad;

            System.out.print("Ingrese el tipo de frigorífico: ");
            tipo = scanner.nextLine();
            System.out.print("Ingrese la capacidad del frigorífico: ");
            capacidad = scanner.nextInt();

            // Crear una instancia de la clase Frigorifico y almacenarla en el vector de productos
            Frigorifico frigorifico = new Frigorifico(codigo, nombre, precio, tipo, capacidad);
            productos[contador] = frigorifico;
            contador++;
        } else {
            System.out.println("Tipo de producto inválido.");
        }
    }

    // Método para buscar un producto por código
    public void buscarProductoPorCodigo() {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        boolean encontrado = false;

        System.out.print("Ingrese el código del producto a buscar: ");
        codigo = scanner.nextInt();

        // Recorrer el vector de productos para buscar el producto por código
        for (int i = 0; i < contador; i++) {
            if (productos[i].getCodigo() == codigo) {
                encontrado = true;
                System.out.println("Producto encontrado:");
                System.out.println("Nombre: " + productos[i].getNombre());
                System.out.println("Precio: " + productos[i].getPrecio());

                // Si es un Tv, mostrar información adicional
                if (productos[i] instanceof Tv) {
                    Tv tv = (Tv) productos[i];
                    System.out.println("Marca: " + tv.getMarca());
                    System.out.println("Modelo: " + tv.getModelo());
                }
                // Si es un Frigorifico, mostrar información adicional
                else if (productos[i] instanceof Frigorifico) {
                    Frigorifico frigorifico = (Frigorifico) productos[i];
                    System.out.println("Tipo: " + frigorifico.getTipo());
                    System.out.println("Capacidad: " + frigorifico.getCapacidad());
                }

                break; // Salir del bucle una vez que se encuentra el producto
            }
        }

        // Si el producto no se encuentra, mostrar un mensaje
        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }
    }

    // Método para listar todos los productos almacenados
    public void listarTodos() {
        System.out.println("Lista de todos los productos:");

        // Recorrer el vector de productos y mostrar la información de cada uno
        for (int i = 0; i < contador; i++) {
            System.out.println("Código: " + productos[i].getCodigo());
            System.out.println("Nombre: " + productos[i].getNombre());
        }
    }
}