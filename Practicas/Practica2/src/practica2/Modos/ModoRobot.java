package practica2.Modos;

/**
 * Interfaz que modela las acciones que puede realizar un robot, dependiendo
 * de su estado actual.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public interface ModoRobot {

    /**
     * Método que representa la acción de encender al robot.
     */
    void encender();

    /**
     * Método que representa la acción de caminar que puede realizar el robot.
     */
    void caminar();

    /**
     * Método que representa la acción de que el robot atienda a una tarea o a un
     * individuo.
     */
    void atender();

    /**
     * Método que representa la acción de cocinar que puede realizar el robot.
     */
    void cocinar();

    /**
     * Método que representa la acción de entregar comida que puede realizar el
     * robot.
     */
    void entregar();

    /**
     * Método que representa la acción de suspender las operaciones del robot.
     */
    void suspender();

    /**
     * Método que representa la acción de apagar al robot.
     */
    void apagar();
}
