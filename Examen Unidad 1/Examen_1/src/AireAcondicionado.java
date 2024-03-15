public class AireAcondicionado extends Accesorio {

    public AireAcondicionado() {
        super("Aire acondicionado", 1000.0);
    }

    @Override
    public String getNombre() {
        return "Aire acondicionado";
    }

    @Override
    public double getPrecio() {
        return 1000.0;
    }
}
