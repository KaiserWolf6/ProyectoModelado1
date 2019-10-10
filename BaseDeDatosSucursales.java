public class BaseDeDatosSucursales extends BaseDeDatos {
	
	@Override public Sucursal creaRegistro() {
		Sucursal s = new Sucursal(0,"","");
		return s;
	}

	private String getCadenaCampo(Sucursal s, CampoSucursal c) {
		switch (c) {
			case ID:
				return s.getId();
			case INVENTARIO:
				return s.getInventario();
			case DIRECCION:
				return s.getDireccion();
			default:
				return "";
		}
	}

    @Override public Lista buscaRegistros(Enum campo, String texto) {
        // Aquí va su código.
        if (!(campo instanceof CampoSucursal)) 
            throw new IllegalArgumentException("Fallo");
        CampoSucursal c = (CampoSucursal) campo;
        Lista r = new Lista();
        registros.primero();
        while (registros.iteradorValido()) {
           Sucursal e = (Sucursal)registros.get();
           String s = getCadenaCampo(e, c);
           if (s.indexOf(texto) != -1) 
                r.agregaFinal(e);
            registros.siguiente();
        }
        return r;
    }	

}