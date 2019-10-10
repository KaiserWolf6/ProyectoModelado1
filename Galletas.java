public class Galletas extends Dulce {
	
	public String tipo_galletas;

	public Galletas() {
		descripcion = "Galletas";
	}

	@Override
	public String getTipoGalletas() {
		return tipo_galletas;
	}

}