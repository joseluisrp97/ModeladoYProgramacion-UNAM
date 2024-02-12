package practica2.menusIteradores;

import java.util.Iterator;
import java.util.NoSuchElementException;
import practica2.Restaurante.Platillo;

/**
 * Clase que implementa un iterador para un menú general,
 * permitiendo la iteración sobre un arreglo de platillos.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class ItMenuGeneral implements Iterator<Platillo> {

    private Platillo[] platillos;
    private int indice = 0;

    /**
     * Constructor que inicializa el iterador con un arreglo de platillos.
     * 
     * @param platillos Arreglo que contiene las instancias de la clase Platillo.
     */
    public ItMenuGeneral(Platillo[] platillos) {
        this.platillos = platillos;
    }

    /**
     * Método que verifica si hay más elementos en el arreglo de platillos
     * para iterar.
     * 
     * @return Verdadero si hay más elementos, falso en caso contrario.
     */
    @Override
    public boolean hasNext() {
        return indice < platillos.length;
    }

    /**
     * Método que retorna el siguiente platillo en el arreglo.
     * Lanza una excepción si se ha alcanzado el final del arreglo.
     * 
     * @return El siguiente platillo en el arreglo.
     * @throws NoSuchElementException Si no hay más elementos para iterar.
     */
    @Override
    public Platillo next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return platillos[indice++];
    }

    /**
     * Método que reinicia el iterador al inicio del arreglo.
     * Nota: Este método no funciona como el remove() típico de un iterador,
     * que elimina el último elemento devuelto por next().
     */
    @Override
    public void remove() {
        indice = 0;
    }
}
