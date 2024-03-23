//es la interfaz AbstractFactory, que declara métodos para crear diferentes familias de productos relacionados
// Definición de la interfaz PizzaIngredientFactory
public interface PizzaIngredientFactory {

	// Método para crear masa de pizza
	public Dough createDough();

	// Método para crear salsa de pizza
	public Sauce createSauce();

	// Método para crear queso de pizza
	public Cheese createCheese();

	// Método para crear vegetales de pizza
	public Veggies[] createVeggies();

	// Método para crear pepperoni de pizza
	public Pepperoni createPepperoni();

	// Método para crear almejas de pizza
	public Clams createClam();
}
