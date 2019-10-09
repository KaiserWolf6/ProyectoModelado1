public class Galleneitor5000 extends AbstractFactoryMaquina {

	private boolean encender;
	private boolean suspender;
	//Pendiente de ver, puede ser una clase
	private String dulce;
	private Receta receta;
	//Pendiente de ver si es una clase
	private int lote;

	public Galleneitor5000(String dulce, Receta receta, int lote) {
		this.dulce = dulce;
		this.lote = lote;
		this.receta = new Receta();
		this.encender = false;
		this.suspender = false;
	}

	@Override
	public Object getTipoDulce(String dulce) {
		return getDulce(dulce);
	}

	public Dulce getDulce(String tipoDulce){
		if (tipoDulce == null) {
			return null;
		} else if (tipoDulce.equalsIgnoreCase("Galletas")) {
			return new;
		} 
		return null;
	}

	/*Metodo que permite encender la maquina*/
	public void encender() {
		this.encender = true;
		System.out.println("La maquina ha sido encendida");
	}

	/*Permite apagar la maquina*/
	public void apagar() {
		this.encender = false;
		System.out.println("La maquina ha sido apagada");
	}

	/*Permite suspender la maquina*/
	public void suspender() {
		this.suspender = true;
		System.out.println("La maquina esta siendo suspendida...");
	}
	
}