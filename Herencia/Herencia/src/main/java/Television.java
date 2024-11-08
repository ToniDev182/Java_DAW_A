/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomestico;

/**
 *
 * @author Antonio Atienza Cano
 */
public class Television extends Electrodomestico {

    // Atributos específicos de Television
    private double resolucionPulgadas;
    private boolean sintonizadorTDT;

    // Constantes por defecto para Television
    private static final double RESOLUCION_DEFECTO = 20;
    private static final boolean SINTONIZADOR_TDT_DEFECTO = false;

    // Constructores
    // Constructor por defecto
    public Television() {
        super(); // Llama al constructor por defecto de la clase padre (Electrodomestico)
        this.resolucionPulgadas = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_TDT_DEFECTO;
    }

    // Constructor con precio y peso, el resto por defecto
    public Television(double precioBase, double peso) {
        super(precioBase, peso); // Llama al constructor de la clase padre con precio y peso
        this.resolucionPulgadas = RESOLUCION_DEFECTO;
        this.sintonizadorTDT = SINTONIZADOR_TDT_DEFECTO;
    }

    // Constructor con resolución, sintonizador TDT y el resto de atributos heredados
    public Television(double resolucionPulgadas, boolean sintonizadorTDT, String color, char consumoEnergetico, double precioBase, double peso) {
        super(color, consumoEnergetico, precioBase, peso); // Llama al constructor de la clase padre con todos los atributos
        this.resolucionPulgadas = resolucionPulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    // Métodos get de resolución y sintonizador TDT
    public double getResolucionPulgadas() {
        return resolucionPulgadas;
    }

    public boolean tieneSintonizadorTDT() {
        return sintonizadorTDT;
    }

    // Método para calcular el precio final de la televisión
    @Override
    protected double precioFinal() {
        // Llama al método precioFinal de la clase padre (Electrodomestico)
        double precioFinal = super.precioFinal();

        // Incrementa el precio en un 30% si la resolución es mayor de 40 pulgadas
        if (resolucionPulgadas > 40) {
            precioFinal *= 1.3;
        }

        // Aumenta 50 € si tiene un sintonizador TDT incorporado
        if (sintonizadorTDT) {
            precioFinal += 50;
        }

        return precioFinal;
    }
}
