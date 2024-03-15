public class VehiculoFactory {

    public static Vehiculo crearVehiculo(String tipo) {
        switch (tipo) {
            case "Utilitario":
                return new Utilitario();
            case "Familiar":
                return new Familiar();
            case "Monovolumen":
                return new Monovolumen();
            default:
                return null;
        }
    }
}