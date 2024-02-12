package practica1.interfaces;

/**
 * Define un contrato para los objetos que actúan como observadores en el patrón
 * Observador-Sujeto. Estos observadores se actualizan en respuesta a las
 * notificaciones
 * enviadas por un sujeto al cual están suscritos.
 * 
 * <p>
 * Esta interfaz garantiza que cualquier clase que actúe como un observador
 * tenga
 * un método de actualización para recibir notificaciones del sujeto.
 * </p>
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public interface Observador {

    /**
     * Se invoca para actualizar el observador con la última notificación
     * o mensaje enviado por el sujeto.
     * 
     * @param registro El mensaje o notificación que el observador recibe del
     *                 sujeto.
     */
    void actualizar(String registro);
}
