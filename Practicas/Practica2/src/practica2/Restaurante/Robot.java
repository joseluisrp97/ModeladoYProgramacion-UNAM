package practica2.Restaurante;

import java.util.ArrayList;
import java.util.Collection;

import practica2.Modos.*;

/**
 * Clase que simula a un robot con diferentes estados.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class Robot {

    private ModoRobot modoActual;
    private Collection<Platillo> ordenActual;
    private Platillo platillo;
    private ModoApagar modoApagar;
    private ModoSuspender modoSuspender;
    private ModoAtender modoAtender;
    private ModoCaminar modoCaminar;
    private ModoCocinar modoCocinar;
    private ModoEntregar modoEntregar;
    private Carta carta;

    /**
     * Constructor que inicializa un robot con estado predeterminado "Apagado" y
     * un ArrayList vacía para la orden actual.
     */
    public Robot() {
        this.modoActual = new ModoApagar(this);
        this.modoApagar = new ModoApagar(this);
        this.modoSuspender = new ModoSuspender(this);
        this.modoAtender = new ModoAtender(this);
        this.modoCaminar = new ModoCaminar(this);
        this.modoCocinar = new ModoCocinar(this);
        this.modoEntregar = new ModoEntregar(this);
        this.carta = new Carta();
        this.ordenActual = new ArrayList<>();
        System.out.println("Modo actual " + getModoApagar());
        setModoActual(modoApagar);
    }

    /**
     * Metodo para modificar el valor del atributo platillo
     * 
     * @param platillo Instancia de la clase Platillo
     */
    public void setPlatillo(Platillo platillo) {
        this.platillo = platillo;
    }

    /**
     * Metodo para obtener el platillo que tiene el robot
     * 
     * @return Platillo
     */
    public Platillo getPlatillo() {
        return this.platillo;
    }

    /**
     * Metodo para conocer el estado actual del robot, representado por un modo
     * 
     * @return ModoRobot
     */
    public ModoRobot getModoActual() {
        return modoActual;
    }

    /**
     * Metodo que regresa el modo apagado del robot
     * 
     * @return ModoRobot
     */
    public ModoRobot getModoApagar() {
        return this.modoApagar;
    }

    /**
     * Metodo que regresa el modo suspendido del robot
     * 
     * @return ModoRobot
     */
    public ModoRobot getModoSuspender() {
        return this.modoSuspender;
    }

    /**
     * Metodo que regresa el modo cocinando del robot
     * 
     * @return ModoRobot
     */
    public ModoRobot getModoCocinar() {
        return this.modoCocinar;
    }

    /**
     * Metodo que regresa el modo caminando del robot
     * 
     * @return ModoRobot
     */
    public ModoRobot getModoCaminar() {
        return this.modoCaminar;
    }

    /**
     * Metodo que regresa el modo atendiendo del robot
     * 
     * @return ModoRobot
     */
    public ModoRobot getModoAtender() {
        return this.modoAtender;
    }

    /**
     * Metodo que regresa el modo entregar comida del robot
     * 
     * @return ModoRobot
     */
    public ModoRobot getModoEntregar() {
        return this.modoEntregar;
    }

    /**
     * Metodo para modificar el estado del robot
     * 
     * @param modoActual Instancia de la clase EstadoRobot que sera el nuevo
     *                   estado
     */
    public void setModoActual(ModoRobot modoActual) {
        this.modoActual = modoActual;
    }

    /**
     * Metodo para obtener la orden actual
     * 
     * @return Collection<Platillo>
     */
    public Collection<Platillo> getOrdenActual() {
        return ordenActual;
    }

    /**
     * Metodo para modificar la orden actual
     * 
     * @param ordenActual Coleccion de instancias de la clase Platillo
     */
    public void setOrdenActual(Collection<Platillo> ordenActual) {
        this.ordenActual = ordenActual;
    }

    /**
     * Método para obtener la carta actual del robot.
     * 
     * @return Carta
     */
    public Carta getCarta() {
        return carta;
    }

}
