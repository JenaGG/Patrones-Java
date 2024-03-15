public class Monovolumen extends Vehiculo {

    public Monovolumen() {
        super("Monovolumen", 20000.0);
    }

    @Override
    public String getDescripcion() {
        return "Vehículo monovolumen";
    }

    // Implement the abstract method from Vehiculo
    @Override
    public double getPrecioBase() {
        return precioBase;
    }
}
