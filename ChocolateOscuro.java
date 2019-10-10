public class ChocolateOscuro extends Chocolate{

	public int ingredientes;
	public int cantidad;
	public String tipo_dulce;

	public ChocolateOscuro() {
		ingredientes = 0;
		cantidad = 0;
		tipo_dulce = "Chocolate Oscuro";		
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