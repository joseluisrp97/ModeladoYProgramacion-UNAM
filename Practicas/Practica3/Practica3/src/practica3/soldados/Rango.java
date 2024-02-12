package practica3.soldados;

import java.util.List;

/**
 * Interfaz que representa la jerarquía de cada soldado
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel
 */
public interface Rango {

    void establecerFormacion(String formacion);

    String obtenerFormacion();

    String generarInforme();

    String getNombre();

    String getNombreRango();

    // Métodos adicionales para el patrón Composite, solo Capitan y Teniente
    void agregarSubordinado(Rango rango);

    void eliminarSubordinado(Rango rango);

    List<Rango> obtenerSubordinados();
}
