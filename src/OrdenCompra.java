import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdenCompra {


    public static int identificador = 0;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;


    public List<Producto> getProductos() {
        return productos;
    }

    private List<Producto> productos = new ArrayList<>();

    public OrdenCompra(){
        icrementarIdentificador();

    }
    public OrdenCompra(String descripcion){
        icrementarIdentificador();
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }





    public int granTotalPrecios(){
        return 0;
    }

    private static void icrementarIdentificador(){
        identificador++;
    }
    public void addProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {

        String detalle = "";
        for (Producto prod:productos
        ) {
            detalle =detalle + " "+ prod.getNombre() + " " +prod.getFabricante()+" "+ prod.getPrecio();
        }
         return "OrdenCompra{  numero de orden: " + identificador +
        "\ndescripcion='" + descripcion + '\'' +
        "\nfecha=" + fecha +
        "\ncliente=" + cliente.getNombre() +" Apellidos: "+ cliente.getApellido()+
        "productos=" + " [ "+detalle +" ] "+ " }";




    }
}
