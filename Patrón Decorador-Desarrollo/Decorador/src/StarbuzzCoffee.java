import java.util.ArrayList;
import java.util.Scanner;

public class StarbuzzCoffee {
        public static void main(String args[]) {
                // ArrayList para almacenar las bebidas ordenadas
                ArrayList<Beverage> order = new ArrayList<>();
                // Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in);

                while (true) {
                        // Menú para elegir la bebida
                        System.out.println("Choose a beverage:");
                        System.out.println("1. Espresso");
                        System.out.println("2. House Blend");
                        System.out.println("3. Dark Roast");
                        System.out.println("4. Decaf");
                        System.out.println("5. Finish order");

                        int choice = scanner.nextInt(); // Leer la opción del usuario
                        scanner.nextLine(); // Consumir el carácter de nueva línea

                        Beverage beverage = null; // Inicializar la variable de bebida como nula
                        switch (choice) {
                                // Crear una instancia de la bebida seleccionada por el usuario
                                case 1:
                                        beverage = new Espresso();
                                        break;
                                case 2:
                                        beverage = new HouseBlend();
                                        break;
                                case 3:
                                        beverage = new DarkRoast();
                                        break;
                                case 4:
                                        beverage = new Decaf();
                                        break;
                                case 5:
                                        break; // Salir del bucle si el usuario termina de ordenar
                                default:
                                        System.out.println("Invalid choice"); // Mensaje para opción inválida
                                        continue; // Volver a mostrar el menú
                        }

                        if (choice == 5) {
                                break; // Salir del bucle si el usuario termina de ordenar
                        }

                        // Bucle para agregar condimentos a la bebida seleccionada
                        while (true) {
                                System.out.println("Add condiments (y/n)?");
                                String addCondiments = scanner.nextLine();
                                if (!addCondiments.equalsIgnoreCase("y")) {
                                        break; // Salir del bucle si el usuario no desea agregar más condimentos
                                }

                                // Menú para elegir el condimento
                                System.out.println("Choose condiments:");
                                System.out.println("1. Mocha");
                                System.out.println("2. Whip");
                                System.out.println("3. Soy");
                                System.out.println("4. Milk");
                                System.out.println("5. Done adding condiments");

                                int condimentChoice = scanner.nextInt(); // Leer la opción del usuario
                                scanner.nextLine(); // Consumir el carácter de nueva línea

                                // Agregar el condimento seleccionado a la bebida
                                switch (condimentChoice) {
                                        case 1:
                                                beverage = new Mocha(beverage);
                                                break;
                                        case 2:
                                                beverage = new Whip(beverage);
                                                break;
                                        case 3:
                                                beverage = new Soy(beverage);
                                                break;
                                        case 4:
                                                beverage = new Milk(beverage);
                                                break;
                                        case 5:
                                                break; // Salir del bucle si el usuario termina de agregar condimentos
                                        default:
                                                System.out.println("Invalid choice"); // Mensaje para opción inválida
                                }

                                if (condimentChoice == 5) {
                                        break; // Salir del bucle si el usuario termina de agregar condimentos
                                }
                        }

                        order.add(beverage); // Agregar la bebida al pedido
                }

                // Imprimir el resumen del pedido
                double subtotal = 0;
                System.out.println("\nOrder Summary:");
                System.out.println("Cantidad  Descripción                       Total");
                for (int i = 0; i < order.size(); i++) {
                        Beverage beverage = order.get(i);
                        System.out.printf("%-10d %-30s $%.2f\n", i + 1, beverage.getDescription(), beverage.cost());
                        subtotal += beverage.cost(); // Calcular el subtotal
                }

                double iva = (subtotal * 0.16); // Calcular el IVA
                double total = subtotal + iva; // Calcular el total
                System.out.printf("Subtotal                                       $%.2f\n", subtotal);
                System.out.printf("IVA 16%%  1                                      $%.2f\n", iva); // Imprimir el IVA
                System.out.printf("Total                                          $%.2f\n", total); // Imprimir el total
                System.out.println("Gracias por su compra!"); // Mensaje de agradecimiento por la compra
        }
}
