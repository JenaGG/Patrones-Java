public abstract class Accesorio {
    protected String nombre;
    protected double precio;

    public Accesorio(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract String getNombre();

    public abstract double getPrecio();

    // Implementacion de getDescripcion()
    public String getDescripcion() {
        return nombre + " (" + precio + "$)";
    }
}
