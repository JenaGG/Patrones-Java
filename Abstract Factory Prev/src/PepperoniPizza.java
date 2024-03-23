//es una clase ConcreteProduct, que representa una implementación específica de un producto (Pizza en este caso) que será creada por una fábrica concreta.

// Definición de la clase concreta PepperoniPizza que extiende la clase abstracta Pizza
public class PepperoniPizza extends Pizza {

	// Atributo para almacenar la fábrica de ingredientes de pizza
	PizzaIngredientFactory ingredientFactory;

	// Constructor que recibe una fábrica de ingredientes de pizza
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	// Implementación del método prepare() para preparar la pizza de pepperoni
	void prepare() {
		// Imprime un mensaje indicando que se está preparando la pizza
		System.out.println("Preparing " + name);

		// Utiliza la fábrica de ingredientes de pizza para crear los ingredientes
		// específicos de la pizza de pepperoni
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
	}
}
