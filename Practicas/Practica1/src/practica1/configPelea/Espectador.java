package practica1.configPelea;

import practica1.interfaces.Observador;
import practica1.recursosPelea.Formacion;
import practica1.recursosPelea.WriteFile;

/**
 * Representa a un espectador que observa el combate en tiempo real.
 * <p>
 * El espectador recibe notificaciones sobre los eventos que ocurren durante el
 * combate y
 * mantiene un registro en su bitácora personal.
 * </p>
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public class Espectador implements Observador {

    public Long user;
    public Publico publico;
    public Personaje personajeElegido;
    public Bitacora bitacora;
    private static Long contador = (long) 0;

    /**
     * Constructor por defecto. Incrementa el contador de espectadores.
     */
    public Espectador() {
        this.user = contador++;
    }

    /**
     * Constructor que permite especificar diversos atributos del espectador.
     * 
     * @param user             Identificador único del espectador.
     * @param publico          Público general al que pertenece el espectador.
     * @param personajeElegido Personaje por el cual el espectador muestra apoyo.
     * @param bitacora         Bitácora personal del espectador.
     */
    public Espectador(Long user, Publico publico, Personaje personajeElegido, Bitacora bitacora) {
        this.user = user;
        this.publico = publico;
        this.personajeElegido = personajeElegido;
        this.bitacora = bitacora;
    }

    /**
     * Actualiza y añade el registro proporcionado a la bitácora del espectador.
     * 
     * @param registro Evento o detalle del combate a añadir en la bitácora.
     */
    @Override
    public void actualizar(String registro) {
        bitacora.escribir(registro);
    }

    /**
     * Proporciona una representación textual del espectador.
     * 
     * @return Identificador único del espectador en formato de cadena.
     */
    @Override
    public String toString() {
        return user.toString();
    }

    /**
     * Genera y almacena la bitácora completa de eventos del espectador en un
     * archivo.
     */
    public void iniciarBitacora() {
        try {
            String res = String.join("\n", bitacora.getRegistros());
            WriteFile.writeUsingFiles(Formacion.ruta + "Bitacora_" + this.user + ".txt", res);
        } catch (Exception e) {
            System.err.println("Error al guardar la bitácora: " + e.getMessage());
        }
    }
}
