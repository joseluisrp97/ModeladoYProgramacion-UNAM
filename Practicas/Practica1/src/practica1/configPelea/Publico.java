package practica1.configPelea;

import java.util.List;

import practica1.interfaces.Observador;
import practica1.interfaces.Sujeto;

import static practica1.recursosPelea.Formacion.println;

/**
 * Representa a un público o audiencia que observa un combate. Esta clase
 * facilita la comunicación
 * entre las peleas y los espectadores. El público está compuesto por una lista
 * de espectadores que
 * reaccionan a los eventos del combate.
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 * 
 */
public class Publico implements Sujeto, Observador {

    public List<Espectador> espectadores;
    public Pelea pelea;

    /**
     * Crea una nueva instancia de Publico con una lista de espectadores.
     * 
     * @param espectadores Lista de espectadores que formarán parte del público.
     */
    public Publico(List<Espectador> espectadores) {
        this.espectadores = espectadores;
        this.pelea = null;
    }

    /**
     * Crea una nueva instancia de Publico con una lista de espectadores y un
     * combate específico.
     * 
     * @param espectadores Lista de espectadores que formarán parte del público.
     * @param pelea        El combate que será observado por el público.
     */
    public Publico(List<Espectador> espectadores, Pelea pelea) {
        this.espectadores = espectadores;
        this.pelea = pelea;
    }

    /**
     * Notifica a todos los espectadores de un evento específico. Si no hay
     * espectadores,
     * simplemente imprime el evento. Si el combate ha terminado, genera las
     * bitácoras
     * para cada espectador basadas en lo que observaron.
     * 
     * @param evento El evento del cual se notificará a los espectadores.
     */
    @Override
    public void notificar(String evento) {

        // Simplemente imprime el evento si aun no hay espectadores
        if (espectadores.isEmpty()) {
            println(evento);
        }

        // Informales a todos de los acontecimientos
        espectadores.forEach(
                espectador -> {
                    espectador.actualizar(evento);

                    // Cuando el combate termine genera las bitacoras de lo que vio cada espectador
                    if (pelea != null) {
                        if (pelea.fin) {

                            if (pelea.vencedor.equals(espectador.personajeElegido)) {
                                espectador.actualizar("Tu personaje es el vencedor!");
                            }

                            espectador.iniciarBitacora();
                        }
                    }
                });

    }

    /**
     * Actualiza las bitácoras de los espectadores basadas en un registro o evento
     * específico.
     * 
     * @param registro El evento que se registrará en las bitácoras.
     */
    @Override
    public void actualizar(String registro) {
        notificar(registro);
    }

}
