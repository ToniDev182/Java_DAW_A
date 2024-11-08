

class Electrodomestico {

    protected static final int PRECIO_BASE = 100;
    protected String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
    protected String[] consumoEnergetico = {"A", "B", "C", "D", "E", "F"};
    protected int peso = 5;

    public static final int[] PRECIOS_NUMERO = {100, 80, 60, 50, 30, 10};
    public static final int[] PRECIOS_PESO = {10, 50, 80, 100};

    // Constructores
    public Electrodomestico() {
        // Constructor por defecto
    }

    public Electrodomestico(String color, String consumoEnergetico, int peso) {
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    // Métodos get
    public int getPeso() {
        return peso;
    }

    // Métodos de validación
    private void comprobarConsumoEnergetico(String consumo) {
        for (String nivel : consumoEnergetico) {
            if (nivel.equals(consumo)) {
                return; // El consumo es válido
            }
        }
        // Si no es válido, usar el consumo por defecto "F"
        System.out.println("Consumo energético no válido. Se utilizará el consumo por defecto 'F'.");
    }

    private void comprobarColor(String color) {
        for (String col : coloresDisponibles) {
            if (col.equalsIgnoreCase(color)) {
                return; // El color es válido
            }
        }
        // Si no es válido, usar el color por defecto "blanco"
        System.out.println("Color no válido. Se utilizará el color por defecto 'blanco'.");
    }

    // Método para calcular el precio final
    public int precioFinal() {
        int precioConsumo = obtenerPrecioConsumo();
        int precioPeso = obtenerPrecioPeso();

        return PRECIO_BASE + precioConsumo + precioPeso;
    }

    private int obtenerPrecioConsumo() {
        int indiceConsumo = -1;
        for (int i = 0; i < consumoEnergetico.length; i++) {
            if (consumoEnergetico[i].equals(consumoEnergetico)) {
                indiceConsumo = i;
                break;
            }
        }
        return (indiceConsumo != -1) ? PRECIOS_NUMERO[indiceConsumo] : PRECIOS_NUMERO[5]; // Por defecto "F"
    }

    private int obtenerPrecioPeso() {
        if (peso >= 0 && peso < 20) {
            return PRECIOS_PESO[0];
        } else if (peso < 50) {
            return PRECIOS_PESO[1];
        } else if (peso < 80) {
            return PRECIOS_PESO[2];
        } else {
            return PRECIOS_PESO[3];
        }
    }
}