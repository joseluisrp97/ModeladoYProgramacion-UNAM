package practica2.Modos;

import practica2.Restaurante.Robot;

/**
 * Clase que simula el comportamiento del robot estando en modo de entregar
 * comida
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class ModoEntregar implements ModoRobot {

    Robot robot;

    /**
     * Metodo constructor con parametros de la clase
     * 
     * @param robot Instancia de la clase robot
     */
    public ModoEntregar(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void encender() {
        System.err.println("HEY, NO ME VES YA ENCENDIDO?");
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
        System.out.println("Pasando a: " + robot.getModoSuspender());
        System.out.println("SUSPENDIENDO...");
        robot.setModoActual(robot.getModoSuspender());
    }

    @Override
    public void apagar() {
        System.err.println("ESTADO EQUIVOCADO, ELIJA OTRA OPCIÓN");
    }

    @Override
    public String toString() {
        return "MODO ENTREGANDO COMIDA";
    }
}
