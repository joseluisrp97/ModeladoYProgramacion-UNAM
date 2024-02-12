package practica1.movimientosDefensa;

import practica1.interfaces.ModoDefensa;

/**
 * Representa un tipo específico de defensa dentro del conjunto de defensas posibles.
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public class DefensaPielDeDragon extends Defensa implements ModoDefensa {
        
    public DefensaPielDeDragon(String hacerDefensa, Integer ptsDefensa) {
        super(hacerDefensa, ptsDefensa);
    }

}
