public class Chocolate extends Dulce {
	
	public String tipo_chocolate;

	public Chocolate() {
		tipo_chocolate = "Chocolate";
	}

	@Override
	public String getTipoChocolate(){
		return tipo_chocolate;
	}

}