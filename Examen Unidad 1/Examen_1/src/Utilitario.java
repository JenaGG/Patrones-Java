public class Utilitario extends Vehiculo {

    public Utilitario() {
        super("Utilitario", 10000.0); // Call the parent constructor with the specific price
    }

    @Override
    public String getDescripcion() {
        return "Vehículo utilitario";
    }

    // Implement the abstract method from Vehiculo
    @Override
    public double getPrecioBase() {
        return precioBase; // Return the inherited priceBase
    }
}
