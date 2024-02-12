package practica1.interfaces;

/**
 * /**
 * Define un contrato para los objetos que actúan como sujetos en el patrón
 * Observador-Sujeto. Estos sujetos son responsables de notificar a todos sus
 * observadores suscritos cuando ocurre un evento relevante.
 * 
 * <p>
 * Esta interfaz asegura que cualquier clase que actúe como un sujeto
 * proporcione
 * un método para enviar notificaciones o alertas a sus observadores.
 * </p>
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public interface Sujeto {

    /**
     * Se invoca para enviar una notificación o alerta a todos los observadores
     * suscritos al sujeto.
     * 
     * @param evento El mensaje o notificación que el sujeto envía a sus
     *               observadores.
     */
    void notificar(String evento);
}
