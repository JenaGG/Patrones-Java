public class Familiar extends Vehiculo {

    public Familiar() {
        super("Familiar", 15000.0);
    }

    @Override
    public String getDescripcion() {
        return "Vehículo familiar";
    }

    // Implement the abstract method from Vehiculo
    @Override
    public double getPrecioBase() {
        return precioBase;
    }
}
