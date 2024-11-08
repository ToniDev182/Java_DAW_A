/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionempleados;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author 34639
 */
class EmpleadoFijo extends Empleado {
    private double sueldoBase;
    private Date fechaContratacion;

    public EmpleadoFijo(String nombre, String apellidos, String dni, double sueldoBase, Date fechaContratacion) {
        super(nombre, apellidos, dni);
        this.sueldoBase = sueldoBase;
        this.fechaContratacion = fechaContratacion;
    }
    // Getters y Setters
    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }
    
    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    //Calcula el sueldo del empleado fijo teniendo en cuenta la bonificación por años trabajados.
    @Override
    public double calcularSueldo() {
        Calendar calendar = Calendar.getInstance();
        int añoActual = calendar.get(Calendar.YEAR);
        calendar.setTime(fechaContratacion);
        int añoContratacion = calendar.get(Calendar.YEAR);
        int añosTrabajados = añoActual - añoContratacion;

        double bonificacion = (sueldoBase * añosTrabajados) / 100;

        return sueldoBase + bonificacion;
    }

    
    }
