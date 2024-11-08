/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciodiscos;

/**
 *
 * @author Antonio Atienza Cano
 */
// Clase que gestiona una colección de discos
import java.util.ArrayList;
import java.util.List;

public class ColeccionDiscos {
    private static final int MAX_DISCOS = 100;
    private List<Disco> discos = new ArrayList<>();
    private int contadorDiscos = 0;

    // Método para agregar un nuevo disco a la colección
    public void agregarDisco(String codigo, String autor, String titulo, String genero, int duracion) {
        if (contadorDiscos < MAX_DISCOS) {
            Disco nuevoDisco = new Disco(codigo, autor, titulo, genero, duracion);
            discos.add(nuevoDisco);
            contadorDiscos++;
            System.out.println("Disco añadido correctamente.");
        } else {
            System.out.println("La colección está llena. No se puede añadir más discos.");
        }
    }

    // Método para buscar un disco por título
    public Disco buscarPorTitulo(String titulo) {
        for (Disco disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(titulo)) {
                return disco;
            }
        }
        return null; // Retorna null si no se encuentra ningún disco con el título dado
    }

    // Método para mostrar todos los discos en la colección
    public void mostrarTodos() {
        if (contadorDiscos == 0) {
            System.out.println("No hay discos en la colección.");
        } else {
            System.out.println("Todos los discos en la colección:");
            for (Disco disco : discos) {
                System.out.println(disco.toString());
            }
        }
    }

    // Método para obtener el número de discos creados
    public int getContadorDiscos() {
        return contadorDiscos;
    }
}