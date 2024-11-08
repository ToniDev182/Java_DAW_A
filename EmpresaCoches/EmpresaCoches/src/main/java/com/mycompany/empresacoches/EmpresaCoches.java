/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.empresacoches;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antonio Atienza Cano
 */
public class EmpresaCoches {
    
    public static void main(String[] args) {
         // Creación de una instancia de la clase EmpresaAlquiler
        EmpresaAlquiler empresa = new EmpresaAlquiler();
        // Creación de ArrayList para almacenar vehículos y clientes.
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>(10);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
         // Agregar algunos vehículos y clientes a las listas.
        vehiculos.add(new Coche(5, "2424FSZ"));
        vehiculos.add(new Coche(2, "5678MDS"));
        vehiculos.add(new Camion(3000, "5690KKJ"));
        
        clientes.add(new Cliente("Antonio", "Atienza", "26048811T"));
        clientes.add(new Cliente("Juan", "De Jesus", "26905983Y"));

        //Le pasamos a empresa los Arrays
        empresa.setClientes(clientes);
        empresa.setVehiculos(vehiculos);

        // Creamos Un menú 
        Scanner op = new Scanner(System.in);
        // Mostrar opciones del menú.
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("Elija una opción");
            System.out.println("1- Mostrostrar todos los vehiculos");
            System.out.println("2- Mostrar vehiculos alquilados");
            System.out.println("3- Agregar vehiculo");
            System.out.println("4- Alquilar un vehiculo");
            System.out.println("5- Anular Alquiler");
            System.out.println("6- Salir");
            System.out.print("Opción: ");
            String opcionTexto = op.nextLine();
            try {
                // Leer la opción ingresada por el usuario.
                opcion = Integer.parseInt(opcionTexto);
                
            } catch (Exception e) {
                // En caso de error, establecer la opción a 0 e informar al usuario.
                opcion = 0;
                System.out.println("Ingrese un valor valido");
                
            }
            // Realizar acciones según la opción seleccionada.
            switch (opcion) {
                case 1 -> {
                    empresa.mostrarVehiculos();
                }
                
                case 2 -> {
                    empresa.mostrarVehiculosAlquilados();
                }
                    
                     // Agregar un vehículo según el tipo seleccionado por el usuario.
                    // Manejar posibles excepciones al ingresar valores inválidos.
                    // Informar al usuario sobre la adición exitosa del vehículo.
                case 3 -> {
                    System.out.println("Indique tipo de Vehiculo");
                    System.out.println("1- Coche");
                    System.out.println("2- Camión");
                    try {
                        int tipoVehiculo = Integer.parseInt(op.nextLine());
                        
                        if (tipoVehiculo == 1) {
                            System.out.println("Ingrese matricula");
                            String matricula = op.nextLine();
                            System.out.println("Ingrese numero de plazas");
                            int numPlazas = Integer.parseInt(op.nextLine());
                            //agregar coche despues de pedir los datos
                            empresa.agregarCoche(matricula, numPlazas);
                            
                            System.out.println("Coche " + matricula + " agregado correctamete");
                        }
                        
                        if (tipoVehiculo == 2) {
                            System.out.println("Ingrese matricula");
                            String matricula = op.nextLine();
                            System.out.println("Ingrese Peso");
                            int peso = Integer.parseInt(op.nextLine());
                            //agregar Camion despues de pedir los datos
                            empresa.agregarCamion(matricula, peso);
                            
                            System.out.println("Camion " + matricula + " agregado correctamete");
                        }
                        if (tipoVehiculo != 1 && tipoVehiculo != 2) {
                            System.out.println("Opcion no valida");
                        }
                    } catch (Exception e) {
                        System.out.println("Valores no validos Intentelo de nuevo");
                    }
                }
                
                // Realizar el proceso de alquiler de un vehículo.
                // Mostrar información y manejar posibles excepciones.
                case 4 -> {
                    System.out.println("Alquiler de Vehiculo");
                    System.out.println("Elegir Cliente");
                    empresa.mostrarClientes();
                    System.out.println("Ingrese DNI del cliente");
                    String dniCliente = (op.nextLine());
                    
                    try {
                        System.out.println("Elegir un Vehiculo");
                        empresa.mostrarVehiculos();
                        System.out.println("Ingrese la matricula del vehiculo que desea alquilar");
                        String matricula = op.nextLine();
                        System.out.println("Ingrese dias de Alquiler");
                        int dias = Integer.parseInt(op.nextLine());
                        empresa.alquilarCoche(dniCliente, matricula, dias);
                        System.out.println("Vehiculo alquilado con exito");
                        
                    } catch (Exception e) {
                        System.out.println("Introduzca un valor valido");
                    }
                    
                }
                // Cancelar un alquiler proporcionando la matrícula del vehículo.
                case 5 -> {
                    System.out.println("Cancelar un alquiler");
                    empresa.mostrarVehiculosAlquilados();
                    System.out.println("Ingrese la matricula del vehiculo para finalizar alquiler");
                    String matricula = op.nextLine();
                    empresa.anularAlquier(matricula);
                }
                
                case 6 -> {
                    System.out.println("Gracias no vuelva");
                }
                default -> {
                    System.out.println("Opción no valida");
                }
                
            }
        }
    }
}
