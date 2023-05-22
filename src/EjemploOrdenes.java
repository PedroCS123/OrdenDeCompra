import java.util.ArrayList;
import java.util.List;

public class EjemploOrdenes {

    public static void main (String args[]){

        Producto producto = null;


        List<Producto> listaProductosJuan = new ArrayList<>();
        List<Producto> listaProductosPedro = new ArrayList<>();
        List<Producto> listaProductosLucy = new ArrayList<>();

        OrdenCompra ordencompraJuan = new OrdenCompra("Primera orden");
        ordencompraJuan.setCliente(new Cliente("Juan", "Perez"));
        ordencompraJuan.setFecha(new java.util.Date());
        listaProductosJuan.add ( new Producto("coca-cola","coca-cola", 20 ) ) ;
        listaProductosJuan.add ( new Producto("cafe","nescafe", 50) ) ;
        listaProductosJuan.add ( new Producto("zucaritas","kellogs", 70 ) ) ;
        listaProductosJuan.add ( new Producto("sidral","coca-cola", 20 ) ) ;
        ordencompraJuan.addProductos(listaProductosJuan);
        System.out.println( ordencompraJuan.toString());



        OrdenCompra ordencompraPedro = new OrdenCompra("Segunda orden");
        ordencompraPedro.setCliente(new Cliente("Pedro", "Martinez"));
        ordencompraPedro.setFecha(new java.util.Date());
        listaProductosPedro.add( new Producto("audifonos","JBL", 200));
        listaProductosPedro.add( new Producto("cuaderno","Scribe", 20));
        listaProductosPedro.add( new Producto("Lapiz","BIC", 15));
        listaProductosPedro.add( new Producto("regla","BIC", 18));
        ordencompraPedro.addProductos(listaProductosPedro);
        System.out.println( ordencompraPedro.toString() );



        OrdenCompra ordencompraLucy = new OrdenCompra("Tercera orden");
        ordencompraLucy.setCliente(new Cliente("Lucy", "Nuñez"));
        ordencompraLucy.setFecha(new java.util.Date());
        listaProductosLucy.add( new Producto("Borrador","Pelicano", 5));
        listaProductosLucy.add( new Producto("colores","premium", 70));
        listaProductosLucy.add( new Producto("pluma","BIC", 15));
        listaProductosPedro.add( new Producto("Agenda","scribe", 70));
        ordencompraLucy.addProductos(listaProductosLucy);
        System.out.println( ordencompraLucy.toString() );

    }
}
