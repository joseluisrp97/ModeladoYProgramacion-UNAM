package practica2.menusIteradores;

import java.util.Collection;
import java.util.Iterator;

import practica2.Restaurante.Platillo;

/**
 * Clase que extiende de Menu y representa el menú general.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class MenuGeneral extends Menu {

    private Platillo[] platillos;

    /**
     * Constructor de la clase que acepta una colección de platillos.
     * 
     * @param platillosDelMenu Colección con las instancias de la clase Platillo.
     */
    public MenuGeneral(Collection<Platillo> platillosDelMenu) {
        this.platillos = platillosDelMenu.toArray(new Platillo[0]);
    }

    /**
     * Constructor predeterminado de la clase que inicializa el array de platillos
     * con una capacidad de 10.
     */
    public MenuGeneral() {
        this.platillos = new Platillo[10];
    }

    /**
     * Método que proporciona una representación en cadena de la clase,
     * mostrando todos los platillos en el menú general.
     * 
     * @return Una cadena que representa el menú general.
     */
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Menú General\n\n");
        Iterator<Platillo> it = createIterator();

        while (it.hasNext()) {
            res.append(it.next().toString());
        }

        return res.toString();
    }

    /**
     * Método que crea y devuelve un iterador para navegar a través
     * de los platillos almacenados en la clase.
     * 
     * @return Un iterador para la colección de platillos.
     */
    @Override
    public Iterator<Platillo> createIterator() {
        return new ItMenuGeneral(platillos);
    }
}
