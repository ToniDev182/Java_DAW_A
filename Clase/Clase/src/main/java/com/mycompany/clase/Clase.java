/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase;

import java.util.Date;

/**
 *
 * @Antonio Atienza Cano
 */
public class Clase {
    public static void main(String[] args) {
       // Crear dos instancias de la clase Alumno
        Date fechaNacimientoAlumno1 = new Date(90, 0, 1);  // Asumiendo año 1990 (1900 + 100), enero es el mes 0
        Alumno alumno1 = new Alumno("Antonio", "Atienza", "Cano", fechaNacimientoAlumno1, 26048811);

        Date fechaNacimientoAlumno2 = new Date(110, 4, 9);  // Asumiendo año 2010 (1900 + 102), mayo es el mes 4
        Alumno alumno2 = new Alumno("Daniel", "Ramos", "Cano", fechaNacimientoAlumno2, 58766411);

        // Crear tres instancias de la clase Profesor
        Date fechaNacimientoProfesor1 = new Date(85, 3, 10); // Asumiendo año 1985
        Profesor profesor1 = new Profesor("Carlos", "Rodriguez", "Vivez", fechaNacimientoProfesor1, 87654321, "Informatica");

        Date fechaNacimientoProfesor2 = new Date(78, 7, 20); // Asumiendo año 1978
        Profesor profesor2 = new Profesor("Ana", "Pulgarin", "Jimenez", fechaNacimientoProfesor2, 12345678, "Matematicas");

        Date fechaNacimientoProfesor3 = new Date(90, 9, 5); // Asumiendo año 1990
        Profesor profesor3 = new Profesor("Pedro", "Sanchez", "Candel", fechaNacimientoProfesor3, 19283746, "Informatica");

        // información de los alumnos mayores de 18 años
        System.out.println("Alumnos mayores de 18 años:");
        if (alumno1.calcularEdad() > 18) {
            System.out.println("Alumno 1: DNI - " + alumno1.getNia() + ", Nombre: " + alumno1.getNombre() +
                    " " + alumno1.getApellido1() + " " + alumno1.getApellido2());
        }
        if (alumno2.calcularEdad() > 18) {
            System.out.println("Alumno 2: DNI - " + alumno2.getNia() + ", Nombre: " + alumno2.getNombre() +
                    " " + alumno2.getApellido1() + " " + alumno2.getApellido2());
        }

        //  información de los profesores del departamento de Informatica
        System.out.println("\nProfesores del departamento de Informatica:");
        if (profesor1.getDepartamento().equals("Informatica")) {
            System.out.println("Profesor 1: DNI - " + profesor1.getNrp() + ", Nombre: " + profesor1.getNombre() +
                    " " + profesor1.getApellido1() + " " + profesor1.getApellido2());
        }
        if (profesor2.getDepartamento().equals("Informatica")) {
            System.out.println("Profesor 2: DNI - " + profesor2.getNrp() + ", Nombre: " + profesor2.getNombre() +
                    " " + profesor2.getApellido1() + " " + profesor2.getApellido2());
        }
        if (profesor3.getDepartamento().equals("Informatica")) {
            System.out.println("Profesor 3: DNI - " + profesor3.getNrp() + ", Nombre: " + profesor3.getNombre() +
                    " " + profesor3.getApellido1() + " " + profesor3.getApellido2());
        }
    }
}
