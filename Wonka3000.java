public class Wonka3000 extends AbstractFactoryMaquina {
	
	Repartidores repartidor;
	private boolean encender;
	private boolean suspender;
	//Pendiente de ver, puede ser una clase
	private String dulce;
	private Receta receta;
	//Pendiente de ver si es una clase
	private int lote;

	public Wonka3000(String dulce, Receta receta, int lote) {
		this.dulce = dulce;
		this.receta = new Receta();
		this.lote = lote;
		encender = false;
		suspender = false;
	}

	@Override
	public Object getTipoDulce(String dulce) {
		return getDulce(dulce);
	}

	public Dulce getDulce(String tipoDulce){
		if (tipoDulce == null) {
			return null;
		} else if (tipoDulce.equalsIgnoreCase("Chocolate")) {
			return new;
		} else if (tipoDulce.equalsIgnoreCase("Gomitas")) {
			return new;
		}
		return null;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
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

	@Override
	public void entregarPaquete(int id) {
		id=repartidor.getId();
		int num_paquetes = 0;

	}

	@Override
	public void guardarRecetas() {

	}

	@Override
	public int empaquetar(int cantidad_dulces) {
		int lote = 0;
		do {
			if (cantidad_dulces ==0) {
				System.out.println("Error");
			} else if (cantidad_dulces <= 9) {
				System.out.println("No es un lote");
			} else{
				lote++;
			}

		} while(cantidad_dulces<=10);
		return lote;
	}

	@Override
	public void prepararDulces(String dulce) {

	}




}