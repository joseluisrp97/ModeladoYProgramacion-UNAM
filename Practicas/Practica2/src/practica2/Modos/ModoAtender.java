package practica2.Modos;

import java.util.Scanner;
import practica2.Restaurante.Robot;

/**
 * Clase que simula el comportamiento del robot estando en modo atendiendo
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class ModoAtender implements ModoRobot {

    Robot robot;
    private int contador = 0;
    private Scanner scanner = new Scanner(System.in);

    /**
     * Metodo constructor con parametros de la clase
     * 
     * @param robot Instancia de la clase robot
     */
    public ModoAtender(Robot robot) {
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
        System.out.println("PASANDO A " + robot.getModoCocinar());
        System.out.println("PREPARANDO SU PEDIDO");
        robot.setModoActual(robot.getModoCocinar());

        robot.getOrdenActual().stream()
                .forEach(p -> p.preparar());
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
        return "MODO ATENDIENDO";
    }
}
