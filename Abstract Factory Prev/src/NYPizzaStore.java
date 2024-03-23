// Definición de la clase concreta NYPizzaStore que extiende la clase abstracta PizzaStore
public class NYPizzaStore extends PizzaStore {

	// Método para crear una pizza específica según el tipo proporcionado
	protected Pizza createPizza(String item) {
		// Inicializa una instancia de pizza como nula
		Pizza pizza = null;
		// Crea una fábrica de ingredientes de pizza específica para el estilo de pizza
		// de Nueva York
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		// Verifica el tipo de pizza solicitado y crea una instancia correspondiente
		// utilizando la fábrica de ingredientes de pizza de Nueva York
		if (item.equals("clam")) {
			// Crea una pizza de almejas utilizando la fábrica de ingredientes de pizza de
			// Nueva York
			pizza = new ClamPizza(ingredientFactory);
			// Establece el nombre de la pizza
			pizza.setName("New York Style Clam Pizza");
		} else if (item.equals("pepperoni")) {
			// Crea una pizza de pepperoni utilizando la fábrica de ingredientes de pizza de
			// Nueva York
			pizza = new PepperoniPizza(ingredientFactory);
			// Establece el nombre de la pizza
			pizza.setName("New York Style Pepperoni Pizza");
		}
		// Devuelve la pizza creada
		return pizza;
	}
}
