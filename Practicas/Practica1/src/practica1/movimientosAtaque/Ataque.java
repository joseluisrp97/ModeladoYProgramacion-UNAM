package practica1.movimientosAtaque;

import practica1.configPelea.Personaje;

/**
 * Representa un ataque que un personaje puede llevar a cabo. Un ataque tiene una descripción y 
 * una cantidad de puntos de daño asociados.
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public class Ataque {

    public String hacerAtaque; // Descripción del ataque.
    public Integer ptsAtaque;  // Puntos de daño que el ataque produce.

    /**
     * Constructor por defecto que inicializa el ataque con valores predeterminados.
     */
    public Ataque() {
        this.hacerAtaque = "";
        this.ptsAtaque = 0;
    }

    /**
     * Constructor que permite especificar una descripción y puntos de daño para el ataque.
     * 
     * @param hacerAtaque Descripción del ataque.
     * @param ptsAtaque Puntos de daño que el ataque produce.
     */
    public Ataque(String hacerAtaque, Integer ptsAtaque) {
        this.hacerAtaque = hacerAtaque;
        this.ptsAtaque = ptsAtaque;
    }

    /**
     * Permite a un personaje ejecutar este ataque contra un rival.
     * 
     * @param rival El personaje que recibirá el ataque.
     */
    public void atacar(Personaje rival) {
    }

    /**
     * Proporciona una descripción textual del ataque.
     * 
     * @return La descripción del ataque.
     */
    public String evento() {
        return this.hacerAtaque;
    }

    /**
     * Representación textual del ataque, en este caso, su descripción.
     * 
     * @return La descripción del ataque.
     */
    @Override
    public String toString() {
        return evento();
    }
}
