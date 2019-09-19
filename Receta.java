public class Receta {
	
	private String molde;
	private String ingrediente;
	private String mezcla;
	private int medida;

	public Receta(String molde, String ingrediente, String mezcla, int medida) {
		this.molde = molde;
		this.ingrediente = ingrediente;
		this.mezcla = mezcla;
		this.medida = medida;
	}

	public int getMedida() {
		return medida;
	}

	public void setMedida(int medida) {
		this.medida = medida;
	}

	public String getMolde() {
		return molde;
	}

	public void setMolde(String molde) {
		this.molde = molde;
	}

	public String getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}

	public String getMezcla() {
		return mezcla;
	}

	public void setMezcla(String mezcla) {
		this.mezcla = mezcla;
	}

	public void agregarIngrediente(String ingrediente) {

	}

	public void elegirMolde(String molde) {

	}

	public void ponerMezcla(String mezcla) {
		
	}


}