package practica2.menusIteradores;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

import practica2.Restaurante.Platillo;

/**
 * Clase que extiende de la clase Menu, representa al menú especial.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class MenuEspecial extends Menu {

    private Hashtable<Long, Platillo> platillos;

    /**
     * Constructor que inicializa un menú especial con una tabla vacía de platillos.
     */
    public MenuEspecial() {
        platillos = new Hashtable<>();
    }

    /**
     * Constructor que inicializa un menú especial con una colección específica de
     * platillos.
     * 
     * @param platillosDelMenu Colección de platillos que se añadirán al menú
     *                         especial.
     */
    public MenuEspecial(Collection<Platillo> platillosDelMenu) {
        this.platillos = new Hashtable<>();
        for (Platillo platillo : platillosDelMenu) {
            platillos.put(platillo.getId(), platillo);
        }
    }

    /**
     * Representación en cadena de la clase, que genera una representación textual
     * del menú especial.
     * 
     * @return Una cadena que representa los platillos en el menú especial.
     */
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Menú Especial\n\n");
        Iterator<Platillo> it = createIterator();

        while (it.hasNext()) {
            res.append(it.next().toString());
        }

        return res.append('\n').toString();
    }

    /**
     * Método que crea y devuelve un iterador específico para navegar a través
     * de los platillos del menú especial.
     * 
     * @return Un iterador para la colección de platillos del menú especial.
     */
    @Override
    public Iterator<Platillo> createIterator() {
        return new ItMenuEspecial(platillos);
    }
}
