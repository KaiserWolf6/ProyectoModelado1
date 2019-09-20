public class Wonka3000 implements Maquina {
	
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

	public String getDulce() {
		return dulce;
	}

	public void setDulce(String dulce) {
		this.dulce = dulce;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	@Override
	public void encender() {
		this.encender = true;
		System.out.println("La maquina ha sido encendida");
	}

	@Override
	public void apagar() {
		this.encender = false;
		System.out.println("La maquina ha sido apagada");
	}

	@Override
	public void suspender() {
		this.suspender = true;
		System.out.println("La maquina esta siendo suspendida...");
	}

	@Override
	public void entregarPaquete() {

	}

	@Override
	public void guardarRecetas() {

	}

	@Override
	public void empaquetar() {

	}

	@Override
	public void prepararDulces(String dulce) {

	}




}