// Definición de la clase Soy que extiende la clase CondimentDecorator
public class Soy extends CondimentDecorator {
    // Constructor de la clase Soy que recibe una bebida como parámetro
    public Soy(Beverage beverage) {
        this.beverage = beverage; // Asigna la bebida a la variable beverage de la clase CondimentDecorator
    }

    // Método para obtener la descripción del condimento Soy
    public String getDescription() {
        return beverage.getDescription() + ", Soy"; // Retorna la descripción de la bebida original con la adición de
                                                    // "Soy"
    }

    // Método para calcular el costo del condimento Soy
    public double cost() {
        return .15 + beverage.cost(); // Retorna el costo de la bebida original más el costo del condimento Soy
    }
}
