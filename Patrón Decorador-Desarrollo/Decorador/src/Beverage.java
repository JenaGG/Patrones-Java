// Definición de la clase abstracta Beverage
public abstract class Beverage {
    // Variable para almacenar la descripción de la bebida
    String description = "Unknown Beverage";

    // Método para obtener la descripción de la bebida
    public String getDescription() {
        return description;
    }

    // Método abstracto para calcular el costo de la bebida
    public abstract double cost();
}
