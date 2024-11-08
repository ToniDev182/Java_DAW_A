/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author Antonio Atienza Cano
 */
public class Principal {
  public static void main(String[] args) {
    // Creamos un array de Figuras con dos elementos
    Figura[] figuras = new Figura[2];

    // Asignamos a cada elemento una instancia de una subclase de Figura
    figuras[0] = new Circulo(2.0); // Un círculo de radio 2.0
    figuras[1] = new Rectangulo(3.0, 4.0); // Un rectángulo de base 3.0 y altura 4.0

    // Calculamos el área total de las figuras
    double areaTotal = 0.0;
    for (Figura f : figuras) {
      // Invocamos al método area de cada figura
      // Aquí se produce la ejecución polimorfa, ya que se llama al método adecuado según el tipo real de cada objeto
      areaTotal += f.area();
    }

    // Mostramos el resultado
    System.out.println("El área total de las figuras es: " + areaTotal);
  }
}