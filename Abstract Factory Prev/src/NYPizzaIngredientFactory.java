//es una clase ConcreteFactory, que implementa los métodos definidos en la interfaz PizzaIngredientFactory.
// Definición de la clase concreta NYPizzaIngredientFactory que implementa la interfaz PizzaIngredientFactory
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	// Método para crear masa de pizza delgada
	public Dough createDough() {
		return new ThinCrustDough();
	}
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Onion() };
		return veggies;
	}
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	public Clams createClam() {
		return new FreshClams();
	}
}
