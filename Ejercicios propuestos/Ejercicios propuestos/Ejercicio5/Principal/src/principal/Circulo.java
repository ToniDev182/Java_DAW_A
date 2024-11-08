/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Antonio Atienza Cano
 */
// Definimos una subclase Circulo que hereda de Figura y redefine el método area
public class Circulo extends Figura {
  private double radio;

  public Circulo(double radio) {
    this.radio = radio;
  }

  @Override
  public double area() {
    return Math.PI * radio * radio;
  }
} 