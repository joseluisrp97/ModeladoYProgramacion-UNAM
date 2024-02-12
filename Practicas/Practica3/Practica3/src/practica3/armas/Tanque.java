package practica3.armas;

/**
 * Clase que representa un arma que puede ser equipada por un
 * soldado.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class Tanque implements Arma {

    @Override
    public int getModificadorAtaque() {
        return 0;
    }

    @Override
    public int getModificadorDefensa() {
        return 5;
    }

    @Override
    public int getModificadorVelocidad() {
        return -5;
    }

    @Override
    public String getNombre() {
        return "Armadura de Tanque";
    }
}
