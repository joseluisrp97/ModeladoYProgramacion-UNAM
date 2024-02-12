package practica1.configPelea;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import practica1.interfaces.Sujeto;
import practica1.recursosPelea.Formacion;

import static practica1.recursosPelea.Formacion.randEntre;

/**
 * La clase Pelea simula un combate entre diferentes personajes.
 * Implementa la interfaz Sujeto para notificar a los espectadores
 * de los eventos que ocurren durante el combate.
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public class Pelea implements Sujeto {

    private List<Personaje> rivales;
    Personaje vencedor;
    public Publico publico;

    public Personaje korby;
    public Personaje meganMan;
    public Personaje dittuu;
    public boolean fin = true;

    /**
     * Constructor sin parámetros. Inicializa una lista vacía de rivales.
     */
    public Pelea() {
        this.rivales = new ArrayList<>();
    }

    /**
     * Constructor que acepta una lista de contrincantes.
     * 
     * @param contrincantes Los personajes que participarán en el combate.
     */
    public Pelea(List<Personaje> rivales) {
        this.rivales = rivales;
        korby = rivales.get(0);
        meganMan = rivales.get(1);
        dittuu = rivales.get(2);
    }

    /**
     * Selecciona un personaje al azar y le otorga un potenciador.
     * Los demás personajes pierden sus potenciadores y uno de ellos ataca.
     */
    public void potenciadorRandom() {

        Personaje personajeElegido = rivales.get(Formacion.vencedor);

        personajeElegido.potenciador = personajeElegido.empresa.getTransformacionRandom();

        notificar(personajeElegido.nombre
                + " ha obtenido un potenciador y se hace más fuerte! Ahora consigue los poderes de: "
                + personajeElegido.potenciador.toString());

        List<Personaje> rivales = this.rivales
                .stream()
                .filter(c -> !personajeElegido.equals(c))
                .collect(Collectors.toList());

        Personaje contraAtaque = rivales.get(
                randEntre(0, rivales.size()));

        contraAtaque.atacar(personajeElegido);

        notificar(
                String.format("%s ataca a %s %s (- %s ptsVida)",
                        contraAtaque.nombre,
                        personajeElegido.nombre,
                        contraAtaque.mostrarAtaque(),
                        contraAtaque.getPtsAtaque()));
        contraAtaque.atacar(personajeElegido);
        notificar(
                String.format("%s se defiende %s (+ %s ptsVida)",
                        personajeElegido.nombre,
                        personajeElegido.mostrarDefensa(),
                        personajeElegido.getPtsDefensa()));

        rivales.forEach(c -> {
            c.potenciador = null;
        });

    }

    /**
     * Inicia el combate entre los personajes hasta que solo quede uno con vida.
     */
    public void iniciarPelea() {

        fin = false;
        int turnoActual = 0;

        while (!finPelea()) {
            if (turnoActual % 3 == 0) {
                potenciadorRandom();
            } else {
                quitarPotenciador();
            }

            Personaje personajeActual = obtenerPersonajeGanador();
            accionesPelea(personajeActual);

            turnoActual++;
        }

        notificar(vencedor.toString() + " ha ganado! SALUDEN AL NUEVO CAMPEON DE SUPER SLAM BRAWLERS");
    }

    private Personaje obtenerPersonajeGanador() {
        switch (Formacion.vencedor.intValue()) {
            case 0:
                return korby;
            case 1:
                return meganMan;
            case 2:
                return dittuu;
            default:
                return korby;
        }
    }

    /**
     * Muestra una acción de combate en función de la acción especificada.
     * Si la acción es un "ataque", se muestra un mensaje donde el personaje
     * atacante lanza un ataque al defensor.
     * En caso contrario, se muestra un mensaje de defensa del personaje defensor
     * recuperando puntos de vida.
     *
     * @param atacante El personaje que realiza la acción.
     * @param defensor El personaje que recibe la acción.
     * @param accion   La acción realizada, puede ser "ataque" o "defensa".
     */
    private void mostrarAccionPelea(Personaje atacante, Personaje defensor, String accion) {
        if ("ataque".equals(accion)) {
            notificar(String.format("%s lanza un %s a %s. ¡%s pierde %s puntos de vida!",
                    atacante.nombre, atacante.mostrarAtaque(), defensor.nombre, defensor.nombre,
                    atacante.getPtsAtaque()));
        } else {
            notificar(String.format("Gracias a su %s, ¡%s recupera %s puntos de vida!",
                    defensor.mostrarDefensa(), defensor.nombre, defensor.getPtsDefensa()));
        }
    }

    /**
     * Realiza las acciones de combate para un personaje atacante.
     * Este método identifica a los posibles defensores (que son distintos al
     * atacante y aún están vivos).
     * Luego, para cada defensor, el atacante lanza un ataque y el defensor se
     * defiende.
     * Ambas acciones son notificadas usando el método mostrarAccionCombate.
     *
     * @param atacante El personaje que iniciará las acciones de combate.
     */
    private void accionesPelea(Personaje atacante) {
        rivales.stream().filter(defensor -> !defensor.equals(atacante) && defensor.conVida()).forEach(defensor -> {
            mostrarAccionPelea(atacante, defensor, "ataque");
            atacante.atacar(defensor);

            // Añadir lógica para decidir si el defensor debe defenderse o no
            if (defensor.ptsVida < 50) { // Por ejemplo, solo defiende si su salud es menor a 50
                mostrarAccionPelea(defensor, atacante, "defensa");
            }
        });
    }

    /**
     * Verifica si el combate ha finalizado, es decir, si solo queda un
     * personaje con vida.
     * 
     * @return Verdadero si el combate ha terminado, falso en caso contrario.
     */

    public boolean finPelea() {

        if (!fin) {
            mostrarPtsVida();
        }

        if (korby.conVida() && !meganMan.conVida() && !dittuu.conVida()) {
            this.vencedor = korby;
            fin = true;
        } else if (!korby.conVida() && meganMan.conVida() && !dittuu.conVida()) {
            this.vencedor = meganMan;
            fin = true;
        } else if (!korby.conVida() && !meganMan.conVida() && dittuu.conVida()) {
            this.vencedor = dittuu;
            fin = true;
        }

        return fin;
    }

    public void mostrarPtsVida() {
        notificar("\n ----------------------------------------------------------\n");
        rivales.forEach(c -> notificar(c.ptsVida > 0
                ? "Vida de " + c.nombre + ": " + c.ptsVida + "/" + Formacion.ptsVidaIniciales
                : c.nombre + " ha muerto! Press F to pay respect."));
        notificar("\n ----------------------------------------------------------\n");
    }

    public void quitarPotenciador() {
        rivales.forEach(c -> c.potenciador = null);
    }

    /**
     * Metodo que notifica a los espectadores los eventos ocurridos durante el
     * combate
     * 
     * @param evento Cadena de texto con lo que ocurre durante el combate
     */
    @Override
    public void notificar(String evento) {
        this.publico.actualizar(evento);
    }

}
