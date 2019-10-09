public class ChocolateLeche extends Receta {
	
	private Dulce dulce;

	public ChocolateLeche(Dulce dulce) {
		this.dulce = dulce;
	}

	@Override
	public String getDescripcion() {
		return dulce.getDescripcion() + "+ "
	}

}