package practica1.movimientosAtaque;

import practica1.interfaces.ModoAtaque;

/**
 * Representa un tipo específico de ataque dentro del conjunto de ataques posibles.
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public class AtaqueDanzaDeSombras extends Ataque implements ModoAtaque  {

    public AtaqueDanzaDeSombras(String hacerAtaque, Integer ptsAtaque) {
        super(hacerAtaque, ptsAtaque);
    }

}
