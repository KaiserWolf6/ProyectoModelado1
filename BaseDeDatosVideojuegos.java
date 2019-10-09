package mx.unam.ciencias.icc;

/**
 * Clase para base de datos videojuegos.
 */
public class BaseDeDatosVideojuegos extends BaseDeDatos {

    /**
     * Crea un videojuego en blanco.
     * @return un videojuego en blanco.
     */
    @Override public Videojuegos creaRegistro() {
        Videojuegos z = new Videojuegos("", "", 0, "", 0.0);
        return z;        
    }

    private String getCadenaCampo(Videojuegos v, CampoVideojuego c) {
        switch (c) {
            case NOMBRE:
                return v.getNombre();

            case GENERO:
                return v.getGenero();

            case PRECIO:
                return Integer.toString(v.getPrecio());
                

            case CONSOLA:
                return v.getConsola();
                

            case PUNTUACION:
                return Double.toString(v.getPuntuacion());

            default:
                return "";
        }
    }
    

    /**
     * Busca videojuegos por un campo específico.
     * @param campo el campo del registro por el cuál buscar.
     * @param texto el texto a buscar.
     * @return una lista con los videojuegos tales que en el campo especificado
     *         contienen el texto recibido.
     * @throws IllegalArgumentException si el campo no es instancia de
     *         {@link CampoVideojuego}.
     */
    @Override public Lista buscaRegistros(Enum campo, String texto) {
        // Aquí va su código.
        if (!(campo instanceof CampoVideojuego)) 
            throw new IllegalArgumentException("Fallo");
        CampoVideojuego c = (CampoVideojuego) campo;
        Lista r = new Lista();
        registros.primero();
        while (registros.iteradorValido()) {
           Videojuegos e = (Videojuegos)registros.get();
           String s = getCadenaCampo(e, c);
           if (s.indexOf(texto) != -1) 
                r.agregaFinal(e);
            registros.siguiente();
        }
        return r;
    }
}
