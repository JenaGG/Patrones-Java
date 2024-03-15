public class PinturaMetalizada extends Accesorio {

    public PinturaMetalizada() {
        super("Pintura metalizada", 500.0);
    }

    @Override
    public String getNombre() {
        return "Pintura metalizada";
    }

    @Override
    public double getPrecio() {
        return 500.0;
    }
}
