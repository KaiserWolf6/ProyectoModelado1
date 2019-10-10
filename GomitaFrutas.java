public class GomitaFrutas extends Gomitas{

	public int ingredientes;
	public int cantidad;
	public String tipo_dulce;

	public GomitaFrutas() {
		ingredientes = 0;
		cantidad = 0;
		tipo_dulce = "Gomitas Frutas";
	}

	public int getCantidad() {
		return cantidad;
	}

	public int getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(int ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getTipoDulce() {
		return tipo_dulce;
	}

	public void preparacion() {
		
	}	

}