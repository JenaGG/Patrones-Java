// Definición de la clase Mocha que extiende la clase CondimentDecorator
public class Mocha extends CondimentDecorator {
    // Constructor de la clase Mocha que recibe una bebida como parámetro
    public Mocha(Beverage beverage) {
        this.beverage = beverage; // Asigna la bebida a la variable beverage de la clase CondimentDecorator
    }

    // Método para obtener la descripción del condimento Mocha
    public String getDescription() {
        return beverage.getDescription() + ", Mocha"; // Retorna la descripción de la bebida original con la adición de
                                                      // "Mocha"
    }

    // Método para calcular el costo del condimento Mocha
    public double cost() {
        return .20 + beverage.cost(); // Retorna el costo de la bebida original más el costo del condimento Mocha
    }
}
