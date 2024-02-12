package practica2.menusIteradores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import practica2.Restaurante.Platillo;

/**
 * Clase que extiende de la clase Menu y representa el menú del día.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class MenuDelDia extends Menu {

    private ArrayList<Platillo> platillos;

    /**
     * Constructor que inicializa un menú del día con una lista vacía de platillos.
     */
    public MenuDelDia() {
        this.platillos = new ArrayList<>();
    }

    /**
     * Constructor que inicializa un menú del día con una colección específica de
     * platillos.
     * 
     * @param platillosDelMenu Colección de platillos que formarán parte del menú
     *                         del día.
     */
    public MenuDelDia(Collection<Platillo> platillosDelMenu) {
        this.platillos = new ArrayList<>(platillosDelMenu);
    }

    /**
     * Método que crea y devuelve un iterador específico para navegar a través
     * de los platillos del menú del día.
     * 
     * @return Un iterador para la colección de platillos del menú del día.
     */
    @Override
    public Iterator<Platillo> createIterator() {
        return new ItMenuDelDia(platillos);
    }
}
