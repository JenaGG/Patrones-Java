//es la clase AbstractProduct, que representa un producto abstracto
// Definición de la clase abstracta Pizza
public abstract class Pizza {

	// Atributo para almacenar el nombre de la pizza
	String name;

	// Atributos para almacenar los ingredientes de la pizza
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	// Método abstracto para la preparación de la pizza
	abstract void prepare();

	// Método para hornear la pizza
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	// Método para cortar la pizza
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	// Método para empaquetar la pizza
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	// Método para establecer el nombre de la pizza
	void setName(String name) {
		this.name = name;
	}

	// Método para obtener el nombre de la pizza
	String getName() {
		return name;
	}

	// Método toString para representar la pizza como una cadena de texto
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		// Agrega cada ingrediente de la pizza a la cadena de texto resultante
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length - 1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
