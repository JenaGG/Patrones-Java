// Definición de la clase HouseBlend que extiende la clase Beverage
public class HouseBlend extends Beverage {
    // Constructor de la clase HouseBlend
    public HouseBlend() {
        description = "House Blend Coffee"; // Establece la descripción de la bebida
    }

    // Implementación del método cost para calcular el costo de la bebida HouseBlend
    public double cost() {
        return .89; // Devuelve el costo de la bebida HouseBlend
    }
}
