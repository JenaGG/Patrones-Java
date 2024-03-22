// Definición de la clase Decaf que extiende la clase Beverage
public class Decaf extends Beverage {
    // Constructor de la clase Decaf
    public Decaf() {
        description = "Decaf Coffee"; // Establece la descripción de la bebida
    }

    // Implementación del método cost para calcular el costo de la bebida Decaf
    public double cost() {
        return 1.05; // Devuelve el costo de la bebida Decaf
    }
}
