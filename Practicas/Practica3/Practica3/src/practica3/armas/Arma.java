package practica3.armas;

/**
 * Interfaz que representa las armas que pueden ser equipada por un
 * soldado.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public interface Arma {
    int getModificadorAtaque();

    int getModificadorDefensa();

    int getModificadorVelocidad();

    String getNombre();
}