package practica1.configPelea;

import practica1.interfaces.ModoAtaque;
import practica1.interfaces.ModoDefensa;

/**
 * Representa una transformación o mejora que un personaje puede adquirir en un
 * combate.
 * Cada transformación tiene un nombre distintivo y modifica la forma en que el
 * personaje ataca
 * y defiende durante el combate. Las transformaciones son esenciales para
 * adaptarse a diferentes
 * situaciones de combate y obtener una ventaja sobre el adversario.
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public class Transformacion {

    public String nombre;
    public ModoAtaque modoAtaque;
    public ModoDefensa modoDefensa;

    /**
     * Crea una nueva transformación para un personaje con un nombre específico,
     * un modo de ataque y un modo de defensa.
     * 
     * @param nombre      Nombre distintivo de la transformación.
     * @param modoAtaque  Forma especializada de ataque que el personaje adquiere
     *                    con esta transformación.
     * @param modoDefensa Forma especializada de defensa que el personaje adquiere
     *                    con esta transformación.
     */
    public Transformacion(String nombre,
            ModoAtaque modoAtaque,
            ModoDefensa modoDefensa) {
        this.nombre = nombre;
        this.modoAtaque = modoAtaque;
        this.modoDefensa = modoDefensa;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Proporciona una representación textual de la transformación, lo que permite
     * una fácil identificación.
     * 
     * @return El nombre de la transformación.
     */
    @Override
    public String toString() {
        return this.nombre;
    }
}
