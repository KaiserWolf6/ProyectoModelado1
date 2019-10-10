public enum CampoRepartidores {
	ID,
	NOMBRE,
	RFC;

	@Override public String toString() {
        switch (this) {
        case NOMBRE:   return "Nombre";
        case ID:   return "Id";
        case RFC:   return "RFC";
        default:       return "";
        }		
	}
}