/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.larecta;

/**
 *
 * @Antonio Atienza Cano
 */


// Esta es la clase Recta
public class Recta {

  // Declaramos los puntos de la clase
  private double x1;
  private double y1;
  private double x2;
  private double y2;

  // Constructor por defecto: crea una recta con los puntos (0,0) y (1,1)
  public Recta() {
    this.x1 = 0;
    this.y1 = 0;
    this.x2 = 1;
    this.y2 = 1;
  }

  // Constructor parametrizado con un punto: crea una recta con el punto dado y el origen de coordenadas
  public Recta(double x1, double y1) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = 0;
    this.y2 = 0;
  }

  // Constructor parametrizado con todos los parámetros: crea una recta con los dos puntos dados
  public Recta(double x1, double y1, double x2, double y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  // Método que devuelve la longitud de una recta: usa la fórmula de la distancia entre dos puntos
  public double longitud() {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }

  // Método que devuelve si un punto (x,y) pertenece a la recta: usa la ecuación de la recta y = mx + b
  public boolean pertenece(double x, double y) {
    // Calculamos la pendiente m y el término independiente b de la recta
    double m = (y2 - y1) / (x2 - x1);
    double b = y1 - m * x1;
    // Comprobamos si el punto satisface la ecuación de la recta
    return y == m * x + b;
  }

  // Método que devuelve la pendiente de una recta: usa la fórmula m = (y2 - y1) / (x2 - x1)
  public double pendiente() {
    return (y2 - y1) / (x2 - x1);
  }

  // Método que dada una recta comprueba si ésta es paralela o perpendicular respecto a nuestra recta, a partir de sus pendientes
  public String relacion(Recta r) {
    // Calculamos la pendiente de la recta dada
    double m = r.pendiente();
    // Comparamos la pendiente de la recta dada con la de nuestra recta
    if (m == this.pendiente()) {
      // Si son iguales, las rectas son paralelas
      return "paralela";
    } else if (m == -1 / this.pendiente()) {
      // Si son inversas y opuestas, las rectas son perpendiculares
      return "perpendicular";
    } else {
      // Si no, las rectas son oblicuas
      return "oblicua";
    }
  }
}