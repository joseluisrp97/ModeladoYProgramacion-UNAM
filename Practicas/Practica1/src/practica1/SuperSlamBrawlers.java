package practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import practica1.configPelea.*;
import practica1.recursosPelea.Formacion;

import static practica1.recursosPelea.Formacion.println;

/**
 * Representa el juego SuperSlamBrawlers y su funcionalidad.
 * Permite al usuario configurar espectadores y simular peleas.
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public class SuperSlamBrawlers {

    private List<Espectador> espectadores;
    private Publico publico;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SuperSlamBrawlers main = new SuperSlamBrawlers();
        main.ejecutarJuego();
    }

    /**
     * Comienza la ejecución del juego SuperSlamBrawlers.
     */
    public void ejecutarJuego() {
        mostrarMensajeBienvenida();
        configurarEspectadores();
        publico.notificar("Preparados, listos.. Peleen!\n");
        empezarPelea();
        println("Gracias por formar parte de nuestro stream. Nos vemos pronto con más SUPER SLAM BRAWLERS");
    }

    /**
     * Muestra el mensaje de bienvenida al juego.
     */
    public void mostrarMensajeBienvenida() {
        println("Bienvenido al sistema de transmisiones oficial de De La Rosa. Presentamos una nueva partida de SUPER SLAM BRAWLERS");
    }

    /**
     * Permite al usuario configurar a los espectadores y seleccionar el vencedor de
     * la pelea.
     */
    public void configurarEspectadores() {
        println("Pelea a simular: ");
        println("0. Gana Korby");
        println("1. Gana MeganMan");
        println("2. Gana Dittuu\n");

        seleccionarVencedor();

        espectadores = new ArrayList<>();
        agregarEspectadores();
        seleccionarPersonajePorEspectador();

        publico = new Publico(espectadores);
        notificarSeleccionDeEspectadores();
    }

    /**
     * Permite al usuario seleccionar el vencedor de la pelea.
     */
    private void seleccionarVencedor() {
        try {
            int eleccion = scanner.nextInt();
            if (0 <= eleccion && eleccion <= 2) {
                Formacion.vencedor = eleccion;
            } else {
                throw new Exception("Introducir un número válido\n");
            }
        } catch (Exception e) {
            println(e.getMessage());
            configurarEspectadores();
        } finally {
            scanner = new Scanner(System.in);
        }
    }

    /**
     * Agrega espectadores al juego.
     */
    private void agregarEspectadores() {
        espectadores.addAll(
                List.of(
                        new Espectador(1L, publico, null, new Bitacora()),
                        new Espectador(2L, publico, null, new Bitacora()),
                        new Espectador(3L, publico, null, new Bitacora()),
                        new Espectador(4L, publico, null, new Bitacora())));
    }

    /**
     * Permite a cada espectador seleccionar un personaje.
     */
    private void seleccionarPersonajePorEspectador() {
        for (Espectador actual : espectadores) {
            boolean seleccionCompleta = false;
            while (!seleccionCompleta) {
                seleccionCompleta = realizarSeleccionDePersonaje(actual);
            }
        }
    }

    /**
     * Ayuda a un espectador a seleccionar su personaje.
     * 
     * @param espectador Espectador que está realizando la selección.
     * @return Verdadero si la selección fue exitosa, falso en caso contrario.
     */
    private boolean realizarSeleccionDePersonaje(Espectador espectador) {
        try {
            println("\n------------- Espectador " + espectador.toString() + " -------------");
            println("------------- ¿Quién será tu personaje? -------------");
            println("0. Korby");
            println("1. MeganMan");
            println("2. Dittuu\n");

            int eleccion = scanner.nextInt();
            if (0 <= eleccion && eleccion <= 2) {
                espectador.personajeElegido = Formacion.personajes.get(eleccion);
                return true;
            } else {
                throw new Exception("Introducir un número válido\n");
            }
        } catch (Exception e) {
            println(e.getMessage());
            return false;
        } finally {
            scanner = new Scanner(System.in);
        }
    }

    /**
     * Notifica al público la selección de personaje de cada espectador.
     */
    private void notificarSeleccionDeEspectadores() {
        for (Espectador e : espectadores) {
            publico.notificar("El espectador " + e.toString() + " ha seleccionado como su personaje a: "
                    + e.personajeElegido.toString());
        }
    }

    /**
     * Inicia una nueva pelea en el juego.
     */
    public void empezarPelea() {
        Pelea pelea = new Pelea(Formacion.personajes);
        publico.pelea = pelea;
        pelea.publico = publico;
        publico.pelea.iniciarPelea();
    }
}
