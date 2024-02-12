package practica1.configPelea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static practica1.recursosPelea.Formacion.randEntre;

/**
 * Representa una franquicia de la cual se derivan diferentes personajes.
 * <p>
 * Cada franquicia posee un conjunto de transformaciones disponibles que
 * pueden ser asociadas a personajes.
 * </p>
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public class Empresa {

    public String nombre;
    public List<Transformacion> transformaciones;

    /**
     * Inicializa una nueva franquicia con una lista vacía de transformaciones.
     */
    public Empresa() {
        this.transformaciones = new ArrayList<>();
    }

    /**
     * Crea una nueva franquicia especificando su nombre y transformaciones
     * asociadas.
     * 
     * @param nombre           El nombre de la franquicia.
     * @param transformaciones Lista inicial de transformaciones vinculadas a la
     *                         franquicia.
     */
    public Empresa(String nombre, List<Transformacion> transformaciones) {
        this.nombre = nombre;
        this.transformaciones = transformaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Proporciona acceso de solo lectura a la lista de transformaciones.
     * 
     * @return Una lista no modificable de transformaciones.
     */
    public List<Transformacion> getTransformaciones() {
        return Collections.unmodifiableList(transformaciones);
    }

    /**
     * Añade una transformación a la lista de transformaciones.
     * 
     * @param transformacion La transformación a añadir.
     */
    public void addTransformacion(Transformacion transformacion) {
        this.transformaciones.add(transformacion);
    }

    /**
     * Selecciona y retorna una transformación aleatoria de la lista de
     * transformaciones disponibles.
     * 
     * @return Una transformación escogida de forma aleatoria.
     */
    public Transformacion getTransformacionRandom() {
        if (transformaciones.isEmpty()) {
            return null; // or throw an exception depending on your needs
        }
        return transformaciones.get(randEntre(0, transformaciones.size() - 1));
    }

    /**
     * Proporciona la representación textual de la franquicia.
     * 
     * @return La denominación de la franquicia.
     */
    @Override
    public String toString() {
        return this.nombre;
    }
}
