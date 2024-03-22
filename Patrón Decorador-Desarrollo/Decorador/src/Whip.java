// Definición de la clase Whip que extiende la clase CondimentDecorator
public class Whip extends CondimentDecorator {
    // Constructor de la clase Whip que recibe una bebida como parámetro
    public Whip(Beverage beverage) {
        this.beverage = beverage; // Asigna la bebida a la variable beverage de la clase CondimentDecorator
    }

    // Método para obtener la descripción del condimento Whip
    public String getDescription() {
        return beverage.getDescription() + ", Whip"; // Retorna la descripción de la bebida original con la adición de
                                                     // "Whip"
    }

    // Método para calcular el costo del condimento Whip
    public double cost() {
        return .10 + beverage.cost(); // Retorna el costo de la bebida original más el costo del condimento Whip
    }
}
