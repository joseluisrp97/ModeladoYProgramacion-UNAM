package practica2.Modos;

import practica2.Restaurante.*;
import static practica2.Restaurante.Pedidos.solicitarPedido;

/**
 * Clase que simula el comportamiento del robot estando en modo caminando
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class ModoCaminar implements ModoRobot {

    Robot robot;

    /**
     * Constructor con parametros de la clase
     * 
     * @param robot Instancia de la clase robot
     */
    public ModoCaminar(Robot robot) {
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
        System.out.println("Pasando a: " + robot.getModoAtender());
        System.out.println("ATENDIENDO...");

        robot.setModoActual(robot.getModoAtender());
        System.out.println(this.robot.getCarta().toString());
        System.err.println("Escribe el ID del platillo a ordenar: ");

        Platillo pedido = solicitarPedido(this.robot);

        System.out.println(pedido.toString());
        this.robot.getOrdenActual().add(pedido);
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
        return "MODO CAMINANDO";
    }
}
