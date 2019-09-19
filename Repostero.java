public class Repostero implements Personal {
	
	private int id;
	private String rfc;
	private String nombre;

	public Repostero(String nombre, String rfc, int id) {
		this.nombre = nombre;
		this.rfc = rfc;
		this.id = id;		
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int getID() {
		return id;
	}

	@Override
	public void setID(int id) {
		this.id = id;
	}

	@Override 
	public String getRFC() {
		return rfc;
	}

	@Override
	public void setRFC(String rfc) {
		this.rfc = rfc;
	}	

	public void asignarSucursal() {

	}

	public void perdirDulces() {
		
	}

}