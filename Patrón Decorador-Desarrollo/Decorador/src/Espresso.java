// Definición de la clase Espresso que extiende la clase Beverage
public class Espresso extends Beverage {
    // Constructor de la clase Espresso
    public Espresso() {
        description = "Espresso"; // Establece la descripción de la bebida
    }

    // Implementación del método cost para calcular el costo de la bebida Espresso
    public double cost() {
        return 1.99; // Devuelve el costo de la bebida Espresso
    }
}
