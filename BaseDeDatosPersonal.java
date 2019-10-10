public class BaseDeDatosPersonal extends BaseDeDatos {
    /**
     * Crea un repartidor en blanco.
     * @return un repartidor en blanco.
     */
    @Override public Repartidores creaRegistro() {
        Repartidores r = new Repartidores("", "", 0);
        return r;        
    }

    private String getCadenaCampo(Repartidores r, CampoRepartidores c) {
        switch (c) {
            case NOMBRE:
                return r.getNombre();

            case ID:
                return r.getID();

            case RFC:
                return r.getRFC();
            default:
                return "";
        }
    }
    

    /**
     * Busca repartidores por un campo específico.
     * @param campo el campo del registro por el cuál buscar.
     * @param texto el texto a buscar.
     * @return una lista con los repartidores tales que en el campo especificado
     *         contienen el texto recibido.
     * @throws IllegalArgumentException si el campo no es instancia de
     *         {@link CampoRepartidores}.
     */
    @Override public Lista buscaRegistros(Enum campo, String texto) {
        // Aquí va su código.
        if (!(campo instanceof CampoRepartidores)) 
            throw new IllegalArgumentException("Fallo");
        CampoRepartidores c = (CampoRepartidores) campo;
        Lista r = new Lista();
        registros.primero();
        while (registros.iteradorValido()) {
           Repartidores e = (Repartidores)registros.get();
           String s = getCadenaCampo(e, c);
           if (s.indexOf(texto) != -1) 
                r.agregaFinal(e);
            registros.siguiente();
        }
        return r;
    }	
}