/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionempleados;

/**
 *
 * @author 34639
 */
// Clase EmpleadoPorComision que hereda de Empleado
class EmpleadoPorComision extends Empleado {
    private double ventasTotales;
    private double porcentajeComision;
    //Constructor parametrizado
    public EmpleadoPorComision(String nombre, String apellidos, String dni, double ventasTotales, double porcentajeComision) {
        super(nombre, apellidos, dni);
        this.ventasTotales = ventasTotales;
        this.porcentajeComision = porcentajeComision;
    }
    // Getters and Setters
    public double getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(double ventasTotales) {
        this.ventasTotales = ventasTotales;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    // Metodo para calcular el sueldo por comision 
    @Override
    public double calcularSueldo() {
        return (ventasTotales * porcentajeComision) / 100;
    }

   
}
