package practica3.armas;

/**
 * Clase que representa un arma que puede ser equipada por un
 * soldado.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class PistolaPapas implements Arma {

    @Override
    public int getModificadorAtaque() {
        return 2;
    }

    @Override
    public int getModificadorDefensa() {
        return -1;
    }

    @Override
    public int getModificadorVelocidad() {
        return 0;
    }

    @Override
    public String getNombre() {
        return "Pistola de Papas";
    }
}
