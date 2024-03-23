import java.util.Scanner;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// Creamos instancias de las tiendas de pizza
		PizzaStore nyStore = new NYPizzaStore();

		// Creamos un objeto Scanner para obtener la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Menú para que el usuario elija una pizza
		System.out.println("Bienvenido al sistema de orden de pizzas.");
		System.out.println("Por favor, seleccione el tipo de pizza que desea ordenar:");
		System.out.println("1. Cheese Pizza");
		System.out.println("2. Clam Pizza");
		System.out.println("3. Pepperoni Pizza");
		System.out.println("4. Veggie Pizza");

		// Obtenemos la selección del usuario
		int choice = scanner.nextInt();
		String pizzaType = "";

		// Asignamos el tipo de pizza según la selección del usuario
		switch (choice) {
			case 1:
				pizzaType = "cheese";
				break;
			case 2:
				pizzaType = "clam";
				break;
			case 3:
				pizzaType = "pepperoni";
				break;
			case 4:
				pizzaType = "veggie";
				break;
			default:
				System.out.println("Selección inválida. Por favor, seleccione una opción válida.");
				return;
		}

		// Ordenamos la pizza seleccionada de la tienda de pizza de Nueva York
		Pizza pizza = nyStore.orderPizza(pizzaType);
		System.out.println("Su pizza ordenada desde la tienda de Nueva York: " + pizza.getName());

		// Cerramos el objeto Scanner
		scanner.close();
	}
}
