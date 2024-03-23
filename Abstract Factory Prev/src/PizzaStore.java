// Definición de la clase abstracta PizzaStore
public abstract class PizzaStore {

	// Método abstracto para crear una pizza
	protected abstract Pizza createPizza(String item);

	// Método para ordenar una pizza
	public Pizza orderPizza(String type) {
		// Llama al método createPizza() para crear una instancia de la pizza solicitada
		Pizza pizza = createPizza(type);

		// Imprime un mensaje indicando que se está preparando una pizza específica
		System.out.println("--- Making a " + pizza.getName() + " ---");

		// Llama a los métodos de preparación, horneado, corte y empaquetado de la pizza
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		// Devuelve la pizza preparada
		return pizza;
	}
}
