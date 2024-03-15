import java.util.List;

public class Ticket {

    private Vehiculo vehiculo;
    private List<Accesorio> accesorios;

    public Ticket(Vehiculo vehiculo, List<Accesorio> accesorios) {
        this.vehiculo = vehiculo;
        this.accesorios = accesorios;
    }

    public String getDescripcion() {
        StringBuilder sb = new StringBuilder();
        sb.append("**Vehículo:**").append(vehiculo.getDescripcion()).append("\n");
        sb.append("**Precio base:**").append(vehiculo.getPrecioBase()).append("€\n");
        sb.append("**Accesorios:**\n");
        for (Accesorio accesorio : accesorios) {
            sb.append("- ").append(accesorio.getDescripcion()).append(" (").append(accesorio.getPrecio())
                    .append("€)\n");
        }
        sb.append("**Precio total:**").append(vehiculo.getPrecioTotal()).append("€\n");

        return sb.toString();
    }

    public void imprimir() {
        System.out.println("------ Ticket ------");
        System.out.println(getDescripcion());
        System.out.println("------ ---------");
    }
}
