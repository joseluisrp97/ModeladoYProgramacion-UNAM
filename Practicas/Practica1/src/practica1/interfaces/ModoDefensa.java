package practica1.interfaces;

/**
 * Define un contrato para los objetos que pueden defenderse de un ataque.
 * Establece los métodos que cualquier clase que quiera realizar acciones
 * defensivas
 * contra puntos de ataque debe implementar.
 * 
 * <p>
 * Esta interfaz garantiza una estructura uniforme para manejar diferentes
 * modos de defensa en el sistema.
 * </p>
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public interface ModoDefensa {

    /**
     * Ejecuta una acción defensiva contra un ataque especificado.
     * 
     * @param ptsAtaque Los puntos de ataque del adversario.
     * @return Los puntos de daño efectivamente recibidos después de la defensa.
     */
    Integer defender(Integer ptsAtaque);

    /**
     * Retorna una descripción o evento relacionado con la acción defensiva.
     * 
     * @return Una cadena de texto que describe el evento de defensa.
     */
    String evento();
}
