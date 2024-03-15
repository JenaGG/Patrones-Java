public class TechoSolar extends Accesorio {

    public TechoSolar() {
        super("Techo solar", 2000.0);
    }

    @Override
    public String getNombre() {
        return "Techo solar";
    }

    @Override
    public double getPrecio() {
        return 2000.0;
    }
}