public class GalletasChispas extends Galletas {
	
	public int ingredientes;
	public int cantidad;
	public String tipo_dulce;
	
	public GalletasChispas() {
		ingredientes = 0;
		cantidad = 0;
		tipo_dulce = "Galletas Chispas";
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