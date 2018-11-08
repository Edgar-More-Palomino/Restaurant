import java.util.ArrayList;
import java.util.List;

public class Application_Restaurant {

	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(construirCliente());
		clientes.add(construirCliente());

		List<Orden> numOrdenes = new ArrayList<>();
		numOrdenes.add(construirOrden());
		numOrdenes.add(construirOrden());

		List<Reservacion> reservaciones = new ArrayList<>();
		reservaciones.add(construirReservacion());
		reservaciones.add(construirReservacion());

		List<Producto> productos = new ArrayList<>();
		productos.add(construirProducto());
		productos.add(construirProducto());

		Restaurant restaurant = new Restaurant();
		restaurant.setClientes(clientes);
		restaurant.setNumOrdenes(numOrdenes);
		restaurant.setReservaciones(reservaciones);
		restaurant.setProductos(productos);

		System.out.println(restaurant);

	}

	private static Cliente construirCliente() {
		Cliente cliente = new Cliente();
		cliente.setNombre("edgar");
		cliente.setDni(12341234);
		return cliente;
	}

	private static Orden construirOrden() {
		Orden orden = new Orden();
		orden.setNumOrden(1234);
		return orden;

	}

	private static Reservacion construirReservacion() {
		Reservacion reservacion = new Reservacion();
		reservacion.setNumReserva(1234567);
		return reservacion;

	}

	private static Producto construirProducto() {
		Producto producto = new Producto();
		producto.setBebida("crush");
		producto.setInsumo("carnes");
		return producto;

	}

}
