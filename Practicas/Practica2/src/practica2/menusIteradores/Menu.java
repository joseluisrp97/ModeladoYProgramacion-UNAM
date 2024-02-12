package practica2.menusIteradores;

import java.util.Iterator;
import practica2.Restaurante.Platillo;

/**
 * Clase abstracta que representa un menú. Define métodos para crear un iterador
 * sobre platillos y para buscar un platillo específico por su ID.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public abstract class Menu {

    /**
     * Método abstracto que debe ser implementado por clases concretas
     * para crear un iterador específico para la colección de platillos que
     * representan.
     *
     * @return Un iterador para la colección de platillos de este menú.
     */
    public abstract Iterator<Platillo> createIterator();

    /**
     * Método que genera una representación en cadena de caracteres del menú,
     * utilizando
     * el iterador creado por el método createIterator.
     *
     * @return Una cadena que representa al menú, con detalles de cada platillo.
     */
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Menú Del Día\n\n");
        Iterator<Platillo> it = createIterator();

        while (it.hasNext()) {
            res.append(it.next().toString());
        }

        it.remove();

        return res.append("\n").toString();
    }

    /**
     * Método que busca un platillo específico en el menú por su ID.
     *
     * @param id El ID del platillo que se está buscando.
     * @return El platillo encontrado, o null si no se encontró ningún platillo con
     *         ese ID.
     */
    public Platillo buscarPlatillo(Long id) {
        Iterator<Platillo> it = createIterator();

        while (it.hasNext()) {
            Platillo cur = it.next();

            if (cur.getId().equals(id)) {
                return cur;
            }
        }

        return null;
    }
}
