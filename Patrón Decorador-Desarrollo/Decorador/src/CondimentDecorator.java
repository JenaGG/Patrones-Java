// Definición de la clase abstracta CondimentDecorator que extiende la clase Beverage
public abstract class CondimentDecorator extends Beverage {
    // Variable para almacenar la bebida que se decorará con el condimento
    Beverage beverage;

    // Método abstracto para obtener la descripción del condimento
    public abstract String getDescription();
}
