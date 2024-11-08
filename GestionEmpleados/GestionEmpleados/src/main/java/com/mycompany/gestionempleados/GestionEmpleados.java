/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestionempleados;

/**
 *
 * @author 34639
 */
//Bibliotecas
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Vector;
import java.util.Date;

public class GestionEmpleados {

    //inicializa un objeto Scanner para la entrada estándar y un vector (Vector) que almacenará objetos de la clase Empleado.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Empleado> empleados = new Vector<>(10);

        int opcion;
        // Menú principal
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Listar todos los empleados");
            System.out.println("2. Listar un empleado ( dni)");
            System.out.println("3. Añadir nuevo empleado");
            System.out.println("4. Modificar empleado ( dni)");
            System.out.println("5. Eliminar empleado ( dni)");
            System.out.println("6. Fin");

            System.out.print("\nIngrese la opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar entrada
// Switch para manejar las opciones del menú
            switch (opcion) {
                case 1:
                    listarTodosEmpleados(empleados);
                    break;
                case 2:
                    listarEmpleadoPorDni(empleados, scanner);
                    break;
                case 3:
                    añadirNuevoEmpleado(empleados, scanner);
                    break;
                case 4:
                    modificarEmpleado(empleados, scanner);
                    break;
                case 5:
                    eliminarEmpleado(empleados, scanner);
                    break;
                case 6:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 6);
    }
// Método para listar todos los empleados

    private static void listarTodosEmpleados(Vector<Empleado> empleados) {
        System.out.println("\nLista de todos los empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " " + empleado.getApellidos() + " - DNI: " + empleado.getDni());
        }
    }
    // Método para listar un empleado por su DNI

    private static void listarEmpleadoPorDni(Vector<Empleado> empleados, Scanner scanner) {
        System.out.print("\nIngrese el DNI del empleado: ");
        String dniBuscado = scanner.nextLine();

        for (Empleado empleado : empleados) {
            if (empleado.getDni().equals(dniBuscado)) {
                System.out.println("\nEmpleado encontrado:");
                System.out.println("Nombre: " + empleado.getNombre());
                System.out.println("Apellidos: " + empleado.getApellidos());
                System.out.println("DNI: " + empleado.getDni());
                return;
            }
        }

        System.out.println("Empleado no encontrado con el DNI proporcionado.");
    }

    private static void añadirNuevoEmpleado(Vector<Empleado> empleados, Scanner scanner) {
        System.out.println("\nSeleccione el tipo de empleado:");
        System.out.println("1. Empleado Fijo");
        System.out.println("2. Empleado Por Horas");
        System.out.println("3. Empleado Por Comisión");
        System.out.print("Ingrese la opción: ");

        int tipoEmpleado = scanner.nextInt();
        scanner.nextLine();  // Limpiar entrada

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese los apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingrese el DNI: ");
        String dni = scanner.nextLine();
// Switch para manejar el tipo de empleado seleccionado
        switch (tipoEmpleado) {
            // Añadir empleado fijo

            case 1:
                System.out.print("Ingrese el sueldo base: ");
                double sueldoBase = scanner.nextDouble();

                System.out.print("Ingrese la fecha de contratación (en formato yyyy-mm-dd): ");
                String fechaContratacionStr = scanner.next();
                Date fechaContratacion = obtenerFechaDesdeString(fechaContratacionStr);

                empleados.add(new EmpleadoFijo(nombre, apellidos, dni, sueldoBase, fechaContratacion));
                break;
            // Añadir empleado por horas
            case 2:
                System.out.print("Ingrese las horas trabajadas: ");
                double horasTrabajadas = scanner.nextDouble();

                System.out.print("Ingrese el precio por hora: ");
                double precioPorHora = scanner.nextDouble();

                empleados.add(new EmpleadoPorHoras(nombre, apellidos, dni, horasTrabajadas, precioPorHora));
                break;
// Añadir empleado por comisión
            case 3:
                System.out.print("Ingrese las ventas totales: ");
                double ventasTotales = scanner.nextDouble();

                System.out.print("Ingrese el porcentaje de comisión: ");
                double porcentajeComision = scanner.nextDouble();

                empleados.add(new EmpleadoPorComision(nombre, apellidos, dni, ventasTotales, porcentajeComision));
                break;

            default:
                System.out.println("Opción no válida. No se ha añadido ningún empleado.");
        }

        System.out.println("Nuevo empleado añadido correctamente.");
    }

    private static Date obtenerFechaDesdeString(String fechaStr) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            return formatoFecha.parse(fechaStr);
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha. Se usará la fecha actual.");
            return new Date();
        }
    }
// modificar tipos de empleados con for / if 

    private static void modificarEmpleado(Vector<Empleado> empleados, Scanner scanner) {
        System.out.print("\nIngrese el DNI del empleado a modificar: ");
        String dniModificar = scanner.nextLine();

        for (Empleado empleado : empleados) {
            if (empleado.getDni().equals(dniModificar)) {
                if (empleado instanceof EmpleadoFijo) {
                    // Modificar empleado fijo
                    modificarEmpleadoFijo((EmpleadoFijo) empleado, scanner);
                } else if (empleado instanceof EmpleadoPorHoras) {
                    // Modificar empleado por horas
                    modificarEmpleadoPorHoras((EmpleadoPorHoras) empleado, scanner);
                } else if (empleado instanceof EmpleadoPorComision) {
                    // Modificar empleado por comisión
                    modificarEmpleadoPorComision((EmpleadoPorComision) empleado, scanner);
                }

                System.out.println("Empleado modificado correctamente.");
                return;
            }
        }

        System.out.println("Empleado no encontrado con el DNI proporcionado.");
    }
// modificar empleado fijo

    private static void modificarEmpleadoFijo(EmpleadoFijo empleadoFijo, Scanner scanner) {
        System.out.println("\nModificando empleado fijo:");

        System.out.print("Ingrese el nuevo sueldo base: ");
        double nuevoSueldoBase = scanner.nextDouble();
        empleadoFijo.setSueldoBase(nuevoSueldoBase);

        System.out.print("Ingrese la nueva fecha de contratación (en formato yyyy-mm-dd): ");
        String nuevaFechaContratacionStr = scanner.next();
        Date nuevaFechaContratacion = obtenerFechaDesdeString(nuevaFechaContratacionStr);
        empleadoFijo.setFechaContratacion(nuevaFechaContratacion);
    }
    //modificar empleado por horas

    private static void modificarEmpleadoPorHoras(EmpleadoPorHoras empleadoPorHoras, Scanner scanner) {
        System.out.println("\nModificando empleado por horas:");

        System.out.print("Ingrese las nuevas horas trabajadas: ");
        double nuevasHorasTrabajadas = scanner.nextDouble();
        empleadoPorHoras.setHorasTrabajadas(nuevasHorasTrabajadas);

        System.out.print("Ingrese el nuevo precio por hora: ");
        double nuevoPrecioPorHora = scanner.nextDouble();
        empleadoPorHoras.setPrecioPorHora(nuevoPrecioPorHora);
    }
// modificar empleado por comision

    private static void modificarEmpleadoPorComision(EmpleadoPorComision empleadoPorComision, Scanner scanner) {
        System.out.println("\nModificando empleado por comisión:");

        System.out.print("Ingrese las nuevas ventas totales: ");
        double nuevasVentasTotales = scanner.nextDouble();
        empleadoPorComision.setVentasTotales(nuevasVentasTotales);

        System.out.print("Ingrese el nuevo porcentaje de comisión: ");
        double nuevoPorcentajeComision = scanner.nextDouble();
        empleadoPorComision.setPorcentajeComision(nuevoPorcentajeComision);
    }

    // Meliminar empleado
    private static void eliminarEmpleado(Vector<Empleado> empleados, Scanner scanner) {
        System.out.print("\nIngrese el DNI del empleado a eliminar: ");
        String dniEliminar = scanner.nextLine();

        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getDni().equals(dniEliminar)) {
                empleados.remove(i);
                System.out.println("Empleado eliminado correctamente.");
                return;
            }
        }

        System.out.println("Empleado no encontrado con el DNI proporcionado.");
    }
}
