public enum CampoSucursal {
        ID,
        INVENTARIO,
        DIRECCION;

	@Override public String toString() {
                switch (this) {
                case INVENTARIO:   return "Inventario";
                case ID:   return "Id";
                case DIRECCION:   return "Direccion";
                default:       return "";
                }		
        }
}