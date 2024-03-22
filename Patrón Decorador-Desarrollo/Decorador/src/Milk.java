// Definición de la clase Milk que extiende la clase CondimentDecorator
public class Milk extends CondimentDecorator {
    // Constructor de la clase Milk que recibe una bebida como parámetro
    public Milk(Beverage beverage) {
        this.beverage = beverage; // Asigna la bebida a la variable beverage de la clase CondimentDecorator
    }

    // Método para obtener la descripción del condimento Milk
    public String getDescription() {
        return beverage.getDescription() + ", Milk"; // Retorna la descripción de la bebida original con la adición de
                                                     // "Milk"
    }

    // Método para calcular el costo del condimento Milk
    public double cost() {
        return .10 + beverage.cost(); // Retorna el costo de la bebida original más el costo del condimento Milk
    }
}
