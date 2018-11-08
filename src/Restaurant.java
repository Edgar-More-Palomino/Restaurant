import java.util.List;

public class Restaurant {

	private List<Cliente> clientes;
	private List<Orden> numOrdenes;
	private List<Reservacion> reservaciones;
	private List<Producto> productos;

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Orden> getNumOrdenes() {
		return numOrdenes;
	}

	public void setNumOrdenes(List<Orden> numOrdenes) {
		this.numOrdenes = numOrdenes;
	}

	public List<Reservacion> getReservaciones() {
		return reservaciones;
	}

	public void setReservaciones(List<Reservacion> reservaciones) {
		this.reservaciones = reservaciones;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Restaurant [clientes=" + clientes + ", numOrdenes=" + numOrdenes + ", reservaciones=" + reservaciones
				+ ", productos=" + productos + "]";
	}
	

}
