package mx.unam.ciencias.icc;

import java.util.NoSuchElementException;

/**
 * <p>Clase para listas doblemente ligadas.</p>
 *
 * <p>Las listas nos permiten agregar elementos al inicio o final de la lista,
 * eliminar elementos de la lista, comprobar si un elemento está o no en la
 * lista, y otras operaciones básicas.</p>
 *
 * <p>Las listas tienen un iterador para poder recorrerlas, y no aceptan a
 * <code>null</code> como elemento.</p>
 */
public class Lista {

    /* Clase Nodo privada para uso interno de la clase Lista. */
    private class Nodo {
        /* El elemento del nodo. */
        public Object elemento;
        /* El nodo anterior. */
        public Nodo anterior;
        /* El nodo siguiente. */
        public Nodo siguiente;

        /* Construye un nodo con un elemento. */
        public Nodo(Object elemento) {
            // Aquí va su código.
            this.elemento = elemento;
            this.anterior = null;
            this.siguiente = null;
        }
    }

    /* Primer elemento de la lista. */
    private Nodo cabeza;
    /* Último elemento de la lista. */
    private Nodo rabo;
    /* Nodo iterador. */
    private Nodo iterador;
    /* Número de elementos en la lista. */
    private int longitud;

    /**
     * Regresa la longitud de la lista.
     * @return la longitud de la lista, el número de elementos que contiene.
     */
    public int getLongitud() {
        // Aquí va su código.
        return longitud;
    }

    /**
     * Nos dice si la lista es vacía.
     * @return <code>true</code> si la lista es vacía, <code>false</code> en
     *         otro caso.
     */
    public boolean esVacia() {
        // Aquí va su código.
        if (longitud == 0)
            return true;
        return false;
    }

    /**
     * Agrega un elemento al final de la lista. Si la lista no tiene elementos,
     * el elemento a agregar será el primero y último. Después de llamar este
     * método, el iterador apunta a la cabeza de la lista.
     * @param elemento el elemento a agregar.
     * @throws IllegalArgumentException si <code>elemento</code> es
     *         <code>null</code>.
     */
    public void agregaFinal(Object elemento) {
        // Aquí va su código.
        if (elemento == null) 
            throw new IllegalArgumentException("El elemento es null");
        Nodo l = new Nodo(elemento);
        if (rabo == null){
        	cabeza = rabo = l;
        } 
         else {
            rabo.siguiente = l;
            l.anterior = rabo;
            rabo = l;
        }
        longitud ++;
        iterador = cabeza;        
    }

    /**
     * Agrega un elemento al inicio de la lista. Si la lista no tiene elementos,
     * el elemento a agregar será el primero y último. Después de llamar este
     * método, el iterador apunta a la cabeza de la lista.
     * @param elemento el elemento a agregar.
     * @throws IllegalArgumentException si <code>elemento</code> es
     *         <code>null</code>.
     */
    public void agregaInicio(Object elemento) {
        // Aquí va su código.
        if (elemento == null) 
            throw new IllegalArgumentException("El elemento es null");
        Nodo b = new Nodo(elemento);
        if (cabeza == null) {
        	rabo = cabeza = b;
        } else {
            cabeza.anterior = b;
            b.siguiente = cabeza;
            cabeza = b;
        }
        longitud ++;
        iterador = cabeza;        
    }

    /**
     * Elimina un elemento de la lista. Si el elemento no está contenido en la
     * lista, el método no la modifica. Si un elemento de la lista es
     * modificado, el iterador se mueve al primer elemento.
     * @param elemento el elemento a eliminar.
     */
    public void elimina(Object elemento) {
        // Aquí va su código.
        Nodo n = buscaNodo(elemento, cabeza);
        if (n != null) {
            if (cabeza == rabo) {
                cabeza = rabo = null;
                longitud --;
                return;
            }
            if (cabeza == n) {
                eliminaPrimero();
                return;
            }
            if (rabo == n) {
                eliminaUltimo();
                return;
            }
            n.anterior.siguiente = n.siguiente;
            n.siguiente.anterior = n.anterior;
            longitud --;
            iterador = cabeza;
        }        
    }

    /**
     * Elimina el primer elemento de la lista y lo regresa.
     * @return el primer elemento de la lista antes de eliminarlo.
     * @throws NoSuchElementException si la lista es vacía.
     */
    public Object eliminaPrimero() {
        // Aquí va su código.
        if (longitud == 0) 
            throw new NoSuchElementException("Esta vacia");
        Object r = cabeza.elemento;
        if (longitud == 1) { 
             cabeza = rabo = iterador = null;
             longitud --;
             return r;
        } else {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
            longitud --;
            iterador = cabeza;
            return r;
        }        
    }

    /**
     * Elimina el último elemento de la lista y lo regresa.
     * @return el último elemento de la lista antes de eliminarlo.
     * @throws NoSuchElementException si la lista es vacía.
     */
    public Object eliminaUltimo() {
        // Aquí va su código.
        if (longitud == 0) 
            throw new NoSuchElementException("Esta vacia");
        Object r = rabo.elemento;
        if (longitud == 1) {
            cabeza = rabo = iterador = null;
            longitud --;
            return r;
        } else {
            rabo = rabo.anterior;
            rabo.siguiente = null;
            longitud --;
            return r;
        }        
    }

    private Nodo buscaNodo(Object elemento, Nodo n){
        if (n == null) 
            return null;
        return n.elemento.equals(elemento) ? n : buscaNodo(elemento, n.siguiente);      
    }
    
    /**
     * Nos dice si un elemento está en la lista. El iterador no se mueve.
     * @param elemento el elemento que queremos saber si está en la lista.
     * @return <tt>true</tt> si <tt>elemento</tt> está en la lista,
     *         <tt>false</tt> en otro caso.
     */
    public boolean contiene(Object elemento) {
        // Aquí va su código.
        Nodo aux = cabeza;
        return buscaNodo(elemento, aux) != null;
    }

    /**
     * Regresa la reversa de la lista.
     * @return una nueva lista que es la reversa la que manda llamar el método.
     */
    public Lista reversa() {
        // Aquí va su código.
        Lista l = new Lista();
        if (longitud == 0) 
            return l;
        Nodo n = cabeza;
        while ( n!= null) {
            l.agregaInicio(n.elemento);
            n = n.siguiente;
        }
        return l;
    }

    /**
     * Regresa una copia de la lista. La copia tiene los mismos elementos que la
     * lista que manda llamar el método, en el mismo orden.
     * @return una copiad de la lista.
     */
    public Lista copia() {
        // Aquí va su código.
        Lista lc = new Lista();
        if (longitud == 0) 
            return lc;
        Nodo n = cabeza;
        while ( n!= null) {
            lc.agregaFinal(n.elemento);
            n = n.siguiente;
        }
        return lc;
    }

    /**
     * Limpia la lista de elementos. El llamar este método es equivalente a
     * eliminar todos los elementos de la lista.
     */
    public void limpia() {
        // Aquí va su código.
        cabeza = rabo = iterador = null;
        longitud = 0;
    }

    /**
     * Regresa el primer elemento de la lista.
     * @return el primer elemento de la lista.
     * @throws NoSuchElementException si la lista es vacía.
     */
    public Object getPrimero() {
        // Aquí va su código.
        if (longitud == 0) 
            throw new NoSuchElementException("Esta vacia");
        return cabeza.elemento;        
    }

    /**
     * Regresa el último elemento de la lista.
     * @return el primer elemento de la lista.
     * @throws NoSuchElementException si la lista es vacía.
     */
    public Object getUltimo() {
        // Aquí va su código.
        if (longitud == 0) 
            throw new NoSuchElementException("Esta vacia");
        return rabo.elemento;        
    }

    /**
     * Regresa el <em>i</em>-ésimo elemento de la lista.
     * @param i el índice del elemento que queremos.
     * @return el <em>i</em>-ésimo elemento de la lista.
     * @throws ExcepcionIndiceInvalido si <em>i</em> es menor que cero o mayor o
     *         igual que el número de elementos en la lista.
     */
    public Object get(int i) {
        // Aquí va su código.
        if (i < 0 || longitud <= i) 
            throw new ExcepcionIndiceInvalido("i es menor que cero");
        Nodo t = cabeza;
        while (i-- > 0) {
            t = t.siguiente;
        }
            return t.elemento;        
    }

    /**
     * Regresa el índice del elemento recibido en la lista.
     * @param elemento el elemento del que se busca el índice.
     * @return el índice del elemento recibido en la lista, o -1 si
     *         el elemento no está contenido en la lista.
     */
    public int indiceDe(Object elemento) {
        // Aquí va su código.
        Nodo n = cabeza;
        int i = 0;
        while ( n!= null) {
            if (n.elemento.equals(elemento)) {
                return i;
            }
            i ++;
            n = n.siguiente;
         } 
         return -1;        
    }

    /**
     * Regresa una representación en cadena de la lista.
     * @return una representación en cadena de la lista.
     */
    @Override public String toString() {
        // Aquí va su código.
        Nodo n = cabeza;
        String s = "[";
        if (longitud == 0) 
            return "[]";        
        for (int i = 0; i < longitud - 1 ; i ++ ) {
            s += String.format("%s, ", n.elemento);
            n = n.siguiente;
        }
        return s += String.format("%s]", rabo.elemento);        
    }

    /**
     * Mueve el iterador de la lista a su primer elemento.
     * @throws NoSuchElementException si la lista es vacía.
     */
    public void primero() {
        // Aquí va su código.
        if (longitud == 0) 
        	throw new NoSuchElementException("Esta vacia");
        iterador = cabeza;      
    }

    /**
     * Mueve el iterador de la lista a su último elemento.
     * @throws NoSuchElementException si la lista es vacía.
     */
    public void ultimo() {
        // Aquí va su código.
        if (longitud == 0) 
        	throw new NoSuchElementException("Esta vacia");
        iterador = rabo;        
    }

    /**
     * Mueve el iterador al elemento siguiente.
     * @throws NoSuchElementException si no hay elemento siguiente.
     */
    public void siguiente() {
        // Aquí va su código.
        if (!iteradorValido()) 
        	throw new NoSuchElementException("Null");
        iterador = iterador.siguiente;        
    }

    /**
     * Mueve el iterador al elemento anterior.
     * @throws NoSuchElementException si no hay elemento anterior.
     */
    public void anterior() {
        // Aquí va su código.
        if (!iteradorValido()) 
        	throw new NoSuchElementException("Null");
        iterador = iterador.anterior;        
    }

    /**
     * Regresa el elemento al que el iterador apunta.
     * @return el elemento al que el iterador apunta.
     * @throws NoSuchElementException si el iterador es inválido.
     */
    public Object get() {
        // Aquí va su código.
        if (!iteradorValido())
            throw new NoSuchElementException("Iterador es invalido");
        return iterador.elemento;        
    }

    /**
     * Nos dice si el iterador es válido.
     * @return <tt>true</tt> si el iterador es válido; <tt>false</tt> en otro
     *         caso.
     */
    public boolean iteradorValido() {
        // Aquí va su código.
        if (iterador != null) {
            return true;
        }
        return false;
    }

    /**
     * Nos dice si la lista es igual al objeto recibido.
     * @param o el objeto con el que hay que comparar.
     * @return <tt>true</tt> si la lista es igual al objeto recibido;
     *         <tt>false</tt> en otro caso.
     */
    @Override public boolean equals(Object o) {
        // Aquí va su código.
       if (o instanceof Lista) {
            Lista l = (Lista) o;
            Nodo n = this.cabeza;
            Nodo m = l.cabeza;
            if (l.longitud == this.longitud) {
                while (n != null) {
                    if (n.elemento.equals(m.elemento)){ 
                        n = n.siguiente;
                        m = m.siguiente;
                } 
                else {
                    return false;
                    }
                }
            
            return true;
            }
        }
      return false;   
    }
}
