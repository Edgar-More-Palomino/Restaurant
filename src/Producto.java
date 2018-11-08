
public class Producto {
	private String bebida;
	private String insumo;

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public String getInsumo() {
		return insumo;
	}

	public void setInsumo(String insumo) {
		this.insumo = insumo;
	}

	@Override
	public String toString() {
		return "Producto [bebida=" + bebida + ", insumo=" + insumo + "]";
	}

}
