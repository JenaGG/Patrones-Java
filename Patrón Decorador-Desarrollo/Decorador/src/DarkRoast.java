// Definición de la clase DarkRoast que extiende la clase Beverage
public class DarkRoast extends Beverage {
    // Constructor de la clase DarkRoast
    public DarkRoast() {
        description = "Dark Roast Coffee"; // Establece la descripción de la bebida
    }

    // Implementación del método cost para calcular el costo de la bebida DarkRoast
    public double cost() {
        return .99; // Devuelve el costo de la bebida DarkRoast
    }
}
