public class Sucursal {
	
	private int id;
	private String inventario;
	private String direccion;

	public Sucursal(int id, String inventario, String direccion) {
		this.id = id;
		this.inventario = inventario;
		this.direccion = direccion;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInventario() {
		return this.inventario;
	}

	public void setInventario(String inventario) {
		this.inventario = inventario;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



}