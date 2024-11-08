/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 *  * @Antonio Atienza Cano
 */
public class Electrodomestico {

    // Atributos protegidos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    // Constantes por defecto
    protected static  String COLOR_DEFECTO = "blanco";
    protected static  char CONSUMO_ENERGETICO_DEFECTO = 'F';
    protected static  double PRECIO_BASE_DEFECTO = 100;
    protected static  double PESO_DEFECTO = 5;

// Array de colores disponibles para los electrodomésticos
protected static String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};

// Array de precios según la letra de consumo energético
protected static final double[] PRECIOS_LETRA = {100.0, 80.0, 60.0, 50.0, 30.0, 10.0};

// Array de precios según el peso del electrodoméstico
protected static final double[] PRECIOS_PESO = {10.0, 50.0, 80.0, 100.0};


    // Constructores

// Constructor por defecto
public Electrodomestico() {
    // Inicializa el precio base con el valor por defecto
    this.precioBase = PRECIO_BASE_DEFECTO;
    
    // Inicializa el color con el valor por defecto
    this.color = COLOR_DEFECTO;
    
    // Inicializa el consumo energético con el valor por defecto
    this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
    
    // Inicializa el peso con el valor por defecto
    this.peso = PESO_DEFECTO;
    
}

// Constructor con precio y peso, el resto por defecto
public Electrodomestico(double precioBase, double peso) {
    // Llama al constructor por defecto para inicializar los atributos comunes
    this();
    
    // Establece el precio base con el valor proporcionado como parámetro
    this.precioBase = precioBase;
    
    // Establece el peso con el valor proporcionado como parámetro
    this.peso = peso;
}

    

// Constructor con todos los atributos
public Electrodomestico(String color, char consumoEnergetico, double precioBase, double peso) {
    // Establece el precio base con el valor proporcionado como parámetro
    this.precioBase = precioBase;
    
    // Establece el peso con el valor proporcionado como parámetro
    this.peso = peso;
    
    // Establece el color después de validarlo utilizando el método de comprobación
    this.color = comprobarColor(color);
    
    // Establece el consumo energético después de validarlo utilizando el método de comprobación
    this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
}


    // Métodos get

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    // Métodos de comprobación
    private char comprobarConsumoEnergetico(char letra) {
        // Verifica que la letra esté en el rango A-F, si no, utiliza la letra por defecto
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return CONSUMO_ENERGETICO_DEFECTO;
        }
    }

    private String comprobarColor(String color) {
        // Verifica que el color esté en la lista de colores disponibles, si no, utiliza el color por defecto
        for (String col : COLORES_DISPONIBLES) {
            if (col.equalsIgnoreCase(color)) {
                return color;
            }
        }
        return COLOR_DEFECTO;
    }

    // Método para calcular el precio final del electrodoméstico
    protected double precioFinal() {
        double precioFinal = PRECIOS_LETRA[consumoEnergetico - 'A'] + calcularPrecioPorPeso();
        return precioFinal;
    }

    // Método privado para calcular el precio por peso
    private double calcularPrecioPorPeso() {
        if (peso < 20) {
            return PRECIOS_PESO[0];
        } else if (peso < 50) {
            return PRECIOS_PESO[1];
        } else if (peso < 80) {
            return PRECIOS_PESO[2];
        } else {
            return PRECIOS_PESO[3];
        }
    }
}
