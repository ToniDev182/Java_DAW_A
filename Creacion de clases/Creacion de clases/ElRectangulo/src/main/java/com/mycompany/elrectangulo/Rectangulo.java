/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elrectangulo;

/**
 *
 * @Antonio Atienza Cano
 */
public class Rectangulo {
    // Campos de la clase
    private double longitud;
    private double ancho;

    // Constructor por defecto
    public Rectangulo() {
        // Puedes inicializar los campos con valores predeterminados si lo deseas
        this.longitud = 0.0;
        this.ancho = 0.0;
    }

    // Constructor parametrizado con todos los parámetros
    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    // Método que calcula el perímetro
    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }

    // Método para calcular el área
    public double calcularArea() {
        return longitud * ancho;
    }

  //getter y setter 
    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}