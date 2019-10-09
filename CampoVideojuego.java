package mx.unam.ciencias.icc;

/**
 * Enumeración para los campos de un {@link Videojuegos}.
 */
public enum CampoVideojuego {

    /** El nombre del videojuego. */
    NOMBRE,
    /** El genero del videojuego. */
    GENERO,
    /** El precio del videojuego. */
    PRECIO,
    /** Consola a la que esta disponible. */    
    CONSOLA,
    /** Puntuacion segun los criticos. */
    PUNTUACION;

    /**
     * Regresa una representación en cadena del campo para ser usada en
     * interfaces gráficas.
     * @return una representación en cadena del campo.
     */
    @Override public String toString() {
        switch (this) {
        case NOMBRE:   return "Nombre";
        case GENERO:   return "Genero";
        case PRECIO:   return "# Precio";
        case CONSOLA:   return "Consola";
        case PUNTUACION: return "Puntuacion";
        default:       return "";
        }
    }
}
