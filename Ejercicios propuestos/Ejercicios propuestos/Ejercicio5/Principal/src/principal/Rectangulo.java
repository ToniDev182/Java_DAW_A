/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Antonio Atienza Cano
 */
public class Rectangulo extends Figura {
  private double base;
  private double altura;

  public Rectangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  @Override
  public double area() {
    return base * altura;
  }
}