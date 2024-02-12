package practica2.Modos;

import practica2.Restaurante.Robot;

/**
 * Clase que simula el comportamiento del robot estando en modo cocinando
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class ModoCocinar implements ModoRobot {

    Robot robot;

    /**
     * Metodo consructor con parametros de la clase
     * 
     * @param robot Instancia de la clase robot
     */
    public ModoCocinar(Robot robot) {
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
        System.out.println("Pasando a: " + robot.getModoEntregar());
        System.out.println("DISFRUTA TU COMIDA, TE ENTREGO");
        robot.setModoActual(robot.getModoEntregar());
        robot.getOrdenActual().clear();
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
        return "MODO COCINANDO";
    }
}
