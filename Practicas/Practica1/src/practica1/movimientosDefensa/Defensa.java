package practica1.movimientosDefensa;

/**
 * Clase que modela el comportamiento general y propiedades de una defensa.
 * Cada defensa tiene una descripción y puede proteger contra un cierto número
 * de puntos de daño durante una pelea.
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public class Defensa {

    public String hacerDefensa;
    public Integer ptsDefensa;

    /**
     * Constructor por defecto que inicializa la defensa sin una descripción
     * específica y sin puntos de protección.
     */
    public Defensa() {
        this.hacerDefensa = "";
        this.ptsDefensa = 0;
    }

    /**
     * Constructor que inicializa la defensa con una descripción específica y
     * puntos de protección.
     * 
     * @param hacerDefensa Describe la acción o forma de la defensa.
     * @param ptsDefensa   Puntos de protección que ofrece la defensa.
     */
    public Defensa(String hacerDefensa, Integer ptsDefensa) {
        this.hacerDefensa = hacerDefensa;
        this.ptsDefensa = ptsDefensa;
    }

    /**
     * Método que procesa la defensa contra un ataque entrante.
     * 
     * @param ptsAtaque Puntos de daño del ataque enemigo.
     * @return Puntos de daño tras aplicar la defensa.
     */
    public Integer defender(Integer ptsAtaque) {
        return ptsAtaque;
    }

    /**
     * Retorna la descripción o forma en que se realiza la defensa.
     * 
     * @return Descripción de la defensa.
     */
    public String evento() {
        return this.hacerDefensa;
    }

    /**
     * Representación textual de la defensa, facilitando su presentación.
     * 
     * @return Descripción de la defensa.
     */
    @Override
    public String toString() {
        return evento();
    }
}
