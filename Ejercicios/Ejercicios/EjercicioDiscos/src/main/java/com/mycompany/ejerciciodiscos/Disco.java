/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciodiscos;

/**
 *
 * @Antonio Atienza Cano
 */
// Importamos la clase Scanner para obtener la entrada del usuario
import java.util.Scanner;

// Clase que representa un Disco
public class Disco {
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    // Constructor para inicializar las propiedades del disco
    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    // Métodos getters para acceder a las propiedades privadas
    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    // Método toString para obtener una representación en cadena del objeto
    @Override
    public String toString() {
        return "Disco{" +
                "codigo='" + codigo + '\'' +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}