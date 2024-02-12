package practica2.Modos;

import practica2.Restaurante.Robot;

/**
 * Clase que simula el comportamiento del robot al estar en modo apagado.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class ModoApagar implements ModoRobot {

    Robot robot;

    /**
     * Método constructor con parámetros de la clase.
     * 
     * @param robot Instancia de la clase Robot.
     */
    public ModoApagar(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void encender() {
        System.out.println("Pasando a: " + robot.getModoSuspender());
        System.out.println("ENCENDIENDO... Encendido");
        robot.setModoActual(robot.getModoSuspender());
    }

    @Override
    public void caminar() {
        System.err.println("ESTADO EQUIVOCADO, ELIJA OTRA OPCIÓN");
    }

    @Override
    public void atender() {
        System.err.println("ESTADO EQUIVOCADO, ELIJA OTRA OPCIÓN");
    }

    @Override
    public void cocinar() {
        System.err.println("ESTADO EQUIVOCADO, ELIJA OTRA OPCIÓN");
    }

    @Override
    public void entregar() {
        System.err.println("ESTADO EQUIVOCADO, ELIJA OTRA OPCIÓN");
    }

    @Override
    public void suspender() {
        System.err.println("ESTADO EQUIVOCADO, ELIJA OTRA OPCIÓN");
    }

    @Override
    public void apagar() {
        System.err.println("ESTADO EQUIVOCADO, ELIJA OTRA OPCIÓN");
    }

    @Override
    public String toString() {
        return "MODO APAGADO";
    }
}
