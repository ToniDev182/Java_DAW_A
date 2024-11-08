/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciofecha;

/**
 *
 * @Antonio Atienza Cano
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    // Constructor que recibe una cadena de fecha en formato "mm/dd/aaaa"
    public Fecha(String f) {
        // Se utiliza SimpleDateFormat para analizar la cadena de caracteres de fecha
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        try {
            Date date = sdf.parse(f);
            // Se obtienen los componentes de la fecha y se asignan a los campos de la clase
            this.dia = Integer.parseInt(new SimpleDateFormat("dd").format(date));
            this.mes = Integer.parseInt(new SimpleDateFormat("MM").format(date));
            this.anio = Integer.parseInt(new SimpleDateFormat("yyyy").format(date));
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
    }
// Método para verificar si la fecha es válida respecto a la fecha actual
public boolean fechaValida() {
    // Obtener la fecha actual
    Date fechaActual = new Date();
    // Crear una nueva fecha con los campos actuales
    Date fechaIngresada = new Date(anio - 1900, mes - 1, dia);
    // Verificar si la fecha ingresada es anterior o igual a la fecha actual
    return !fechaIngresada.after(fechaActual);
}

// Método para calcular la diferencia en días entre dos fechas (solo considerando día y mes)
    public int diferencia(Fecha f) {
    // Calcular la diferencia en días solo considerando día y mes
    int diasEnFecha1 = mes * 30 + dia;  // Asumiendo que cada mes tiene 30 días
    int diasEnFecha2 = f.mes * 30 + f.dia;

    // Calcular y devolver la diferencia en días
    return Math.abs(diasEnFecha2 - diasEnFecha1);

}
}
