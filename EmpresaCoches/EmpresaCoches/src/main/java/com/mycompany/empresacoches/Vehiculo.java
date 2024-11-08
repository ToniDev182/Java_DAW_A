/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresacoches;

/**
 *
 * @author Antonio Atienza Cano
 */
class Vehiculo {

    // Atributos que describen las características del vehículo.
    protected String matricula;
    protected double precioBase;
    protected boolean alquilado;
    protected int diasAlquiler;
    protected String idCliente;

    // Constructor que inicializa las propiedades básicas del vehículo.
    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.precioBase = 50;
        this.alquilado = false;
        this.diasAlquiler = 0;
        this.idCliente = "";
    }

    // Métodos getter y setter para acceder y modificar los atributos.
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    // Método para calcular el costo total del alquiler del vehículo.
    public double calcularCostoAlquiler() {
        return diasAlquiler * precioBase;
    }
}
