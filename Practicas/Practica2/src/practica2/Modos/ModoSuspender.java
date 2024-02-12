package practica2.Modos;

import practica2.Restaurante.Robot;

/**
 * Clase que simula el modo suspendido del robot
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class ModoSuspender implements ModoRobot {

    Robot robot;

    /**
     * Metodo constructor con parametros de la clase
     * 
     * @param robot Instancia de la clase Robot
     */
    public ModoSuspender(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void encender() {
        System.err.println("HEY, NO ME VES YA ENCENDIDO?");
    }

    @Override
    public void caminar() {
        System.out.println("Pasando a: " + robot.getModoCaminar());
        System.out.println("MODO CAMINANDO");
        robot.setModoActual(robot.getModoCaminar());
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
        System.out.println("Pasando a: " + robot.getModoApagar());
        System.out.println("APAGANDO...");
        System.exit(0);
    }

    @Override
    public String toString() {
        return "MODO SUSPENDIDO";
    }
}
