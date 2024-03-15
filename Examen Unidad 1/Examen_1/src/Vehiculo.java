public abstract class Vehiculo {
    protected String tipo;
    protected double precioBase;

    public Vehiculo(String tipo, double precioBase) {
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public abstract String getDescripcion();

    public abstract double getPrecioBase();

    public double getPrecioTotal() {
        return precioBase;
    }

    public void addAccesorio(Accesorio accesorio) {
        precioBase += accesorio.getPrecio();
    }
}
