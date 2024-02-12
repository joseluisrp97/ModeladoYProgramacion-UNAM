package practica2.menusIteradores;

import java.util.Hashtable;
import java.util.Iterator;
import practica2.Restaurante.Platillo;

/**
 * Clase que implementa la interfaz Iterator, facilitando la iteración
 * sobre un menú especial representado mediante una tabla hash.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class ItMenuEspecial implements Iterator<Platillo> {

    private Iterator<Platillo> it;

    /**
     * Constructor que inicializa el iterador con una tabla hash de platillos.
     * 
     * @param platillos Tabla hash que contiene platillos con un identificador único
     *                  como clave.
     */
    public ItMenuEspecial(Hashtable<Long, Platillo> platillos) {
        it = platillos.values().iterator();
    }

    /**
     * Método que verifica si hay más elementos en la tabla hash de platillos
     * para iterar.
     * 
     * @return Verdadero si hay más elementos, falso en caso contrario.
     */
    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    /**
     * Método que retorna el siguiente platillo en la colección.
     * 
     * @return El siguiente platillo en la colección.
     */
    @Override
    public Platillo next() {
        return it.next();
    }

    /**
     * Método que permite eliminar el platillo actual de la colección.
     * Este método debe ser llamado después del método next().
     * 
     * @throws IllegalStateException si el método next() no ha sido
     *                               llamado, o el método remove() ya fue llamado
     *                               después
     *                               de la última llamada a next().
     */
    @Override
    public void remove() {
        it.remove();
    }
}
