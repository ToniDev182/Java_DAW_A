/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionempleados;

/**
 *
 * @author 34639
 */
class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double precioPorHora;
 // Constructor parametrizado
    public EmpleadoPorHoras(String nombre, String apellidos, String dni, double horasTrabajadas, double precioPorHora) {
        super(nombre, apellidos, dni);
        this.horasTrabajadas = horasTrabajadas;
        this.precioPorHora = precioPorHora;
    }
// getters y setters 
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    // Calcular el sueldo por horas
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * precioPorHora;
    }

    
}