public class Repartidores implements Personal {
	
	private int id;
	private String rfc;
	private String nombre;

	public Repartidores(String nombre, String rfc, int id) {
		this.nombre = nombre;
		this.rfc = rfc;
		this.id = id;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	//@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int getID() {
		return id;
	}

	//@Override
	public void setID(int id) {
		this.id = id;
	}

	@Override 
	public String getRFC() {
		return rfc;
	}

	//@Override
	public void setRFC(String rfc) {
		this.rfc = rfc;
	}

	public void sucursalDestino(Sucursal sucursal, int id) {
		id = getID();
		sucursal.getId();
		String direccion = sucursal.getDireccion();
		System.out.println("Tu destino es: " + direccion);
	}

	public void transportar() {
		System.out.println("Dulces en camino");
	}

	public void recibirLote(int lote, Repartidores r) {
		System.out.println("En mantenimiento");
		if (r.dulce.getCantidad() == 0) {
			
		}	
	}
}