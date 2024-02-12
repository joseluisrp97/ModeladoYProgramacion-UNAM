package practica1.interfaces;

import practica1.configPelea.Personaje;

/**
 * Define un contrato para los objetos que pueden atacar a un personaje.
 * Establece los métodos que cualquier clase que quiera realizar ataques
 * a instancias de la clase Personaje debe implementar.
 * 
 * <p>
 * Esta interfaz proporciona una manera uniforme de gestionar diferentes
 * modos de ataque en el sistema.
 * </p>
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public interface ModoAtaque {
    /**
     * Ejecuta un ataque contra el personaje especificado.
     * 
     * @param rival El personaje que recibirá el ataque.
     */
    void atacar(Personaje rival);

    /**
     * Retorna una descripción o evento relacionado con el ataque.
     * 
     * @return Una cadena de texto que describe el evento del ataque.
     */
    String evento();
}
