/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresacoches;

import java.util.ArrayList;

/**
 *
 * @author Antonio Atienza Cano
 */
public class EmpresaAlquiler {

    // Listas que almacenan los vehículos y clientes de la empresa.
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Cliente> clientes;

    // Constructor para inicializar una empresa sin vehículos ni clientes al principio.
    public EmpresaAlquiler() {
        this.vehiculos = new ArrayList<>(10);
        this.clientes = new ArrayList<>();
    }

    // Métodos para obtener y establecer la lista de vehículos.
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    // Métodos para obtener y establecer la lista de clientes.
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    //Es un setter que se utiliza para establecer la lista de clientes de la empresa
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    // Método para mostrar todos los vehículos y su estado.
    public void mostrarVehiculos() {
        System.out.println("Mostrar todos los vehículos ");

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Matrícula: " + vehiculo.getMatricula());
            if (vehiculo.isAlquilado()) {
                System.out.println("Alquilado: Si");
                System.out.println("Días: " + vehiculo.getDiasAlquiler());
            } else {
                System.out.println("Alquilado: No");
            }

            System.out.println();
        }
    }

    // Método para mostrar la información de todos los clientes.
    public void mostrarClientes() {
        int contador = 1;
        for (Cliente cliente : clientes) {
            System.out.println(contador + " - Nombre:  " + cliente.getNombre() + " - Apellido:  " + cliente.getApellido() + " - " + cliente.getDni());
            contador++;
        }
    }

    // Método para mostrar los vehículos actualmente alquilados.
    public void mostrarVehiculosAlquilados() {
        System.out.println("Mostrar todos los vehículos alquilados");

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.isAlquilado()) {
                System.out.println("Matrícula: " + vehiculo.getMatricula());
                System.out.println("Alquilado: Si");
                System.out.println("Días: " + vehiculo.getDiasAlquiler());
            }
        }
    }

    // Método para agregar un coche a la lista de vehículos.
    public void agregarCoche(String matricula, int plaza) {
        vehiculos.add(new Coche(plaza, matricula));
    }

    // Método para agregar un camión a la lista de vehículos.
    public void agregarCamion(String matricula, int peso) {
        vehiculos.add(new Camion(peso, matricula));
    }

    // Método para realizar el proceso de alquiler de un vehículo.
    public void alquilarCoche(String dni, String matricula, int dias) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.setAlquilado(true);
                vehiculo.setDiasAlquiler(dias);
                vehiculo.setIdCliente(dni);
                System.out.println("Precio Total del Alquiler: " + vehiculo.calcularCostoAlquiler());
            }
        }
    }

    // Método para cancelar un alquiler proporcionando la matrícula del vehículo.
    public void anularAlquier(String matricula) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                vehiculo.setAlquilado(false);
                vehiculo.setDiasAlquiler(0);
                vehiculo.setIdCliente("");
                System.out.println("Fin de Alquiler");
            }
        }
    }
}
