package practica2.menusIteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import practica2.Restaurante.Platillo;

/**
 * Esta clase implementa la interfaz Iterator, permitiendo iterar
 * sobre una lista de platillos en un menú del día.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class ItMenuDelDia implements Iterator<Platillo> {

    private ArrayList<Platillo> platillos;
    private int indice = 0;

    /**
     * Constructor que inicializa el iterador con una lista de platillos.
     * 
     * @param platillos Lista de platillos para iterar.
     */
    public ItMenuDelDia(ArrayList<Platillo> platillos) {
        this.platillos = platillos;
    }

    /**
     * Método que verifica si hay más elementos en la lista de platillos
     * para iterar.
     *
     * @return Verdadero si hay más elementos, falso en caso contrario.
     */
    @Override
    public boolean hasNext() {
        return indice < platillos.size();
    }

    /**
     * Método que devuelve el siguiente platillo en la lista.
     * Lanza una excepción si se ha alcanzado el final de la lista.
     * 
     * @return El siguiente platillo en la lista.
     * @throws NoSuchElementException Si no hay más elementos para iterar.
     */
    @Override
    public Platillo next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return platillos.get(indice++);
    }

    /**
     * Método que elimina el último platillo devuelto por el método next().
     * Debe ser llamado después de llamar al método next().
     * 
     * @throws IllegalStateException Si el método next() no se ha llamado,
     *                               o el método remove() ya se ha llamado
     *                               después de la última llamada a next().
     */
    @Override
    public void remove() {
        if (indice <= 0) {
            throw new IllegalStateException("No se puede eliminar un elemento antes de llamar a next()");
        }
        platillos.remove(--indice);
    }
}
