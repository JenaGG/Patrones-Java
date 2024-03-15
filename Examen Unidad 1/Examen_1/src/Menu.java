import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar menú de vehículos
        System.out.println("**Elige un vehiculo:**");
        System.out.println("1. Utilitario");
        System.out.println("2. Familiar");
        System.out.println("3. Monovolumen");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear vehículo según la opción elegida (Opción con array)
        String[] tiposVehiculo = { "Utilitario", "Familiar", "Monovolumen" };
        Vehiculo vehiculo;

        if (opcion >= 1 && opcion <= 3) {
            vehiculo = VehiculoFactory.crearVehiculo(tiposVehiculo[opcion - 1]);
        } else {
            vehiculo = null; // Manejar el caso de la opción inválida
        }

        // Lista de accesorios seleccionados
        List<Accesorio> accesorios = new ArrayList<>();

        // Mostrar menú de accesorios
        int opcionAccesorio;
        do {
            System.out.println();
            System.out.println("**Elige un accesorio:**");
            System.out.println("1. Aire acondicionado (+$1000)");
            System.out.println("2. Pintura metalizada (+$500)");
            System.out.println("3. Techo solar (+$2000)");
            System.out.println("0. Terminar");

            opcionAccesorio = scanner.nextInt();

            switch (opcionAccesorio) {
                case 1:
                    accesorios.add(new AireAcondicionado());
                    break;
                case 2:
                    accesorios.add(new PinturaMetalizada());
                    break;
                case 3:
                    accesorios.add(new TechoSolar());
                    break;
            }
        } while (opcionAccesorio != 0);

        // Agregar accesorios al vehículo
        for (Accesorio accesorio : accesorios) {
            vehiculo.addAccesorio(accesorio);
        }

        // Generar ticket
        Ticket ticket = new Ticket(vehiculo, accesorios);
        ticket.imprimir();
    }
}
