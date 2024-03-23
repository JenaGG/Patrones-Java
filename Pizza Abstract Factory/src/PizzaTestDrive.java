import java.util.Scanner;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Scanner scanner = new Scanner(System.in);
        System.err.println("Selecciones una pizza");
        System.err.println("1. Pepperoni");
        System.err.println("2. Clams");

        int choice = scanner.nextInt();
        String pizzaType = "";

        switch (choice) {
            case 1:
                pizzaType = "pepperoni";
                break;
            case 2:
                pizzaType = "clam";
                break;
            default:
                System.out.println("Selección inválida. Por favor, seleccione una opción válida.");
                return;
        }
        Pizza pizza = nyStore.orderPizza(pizzaType);
        System.out.println("Su pizza viene de nuestra tienda en Nueva York");
        scanner.close();
    }

}
