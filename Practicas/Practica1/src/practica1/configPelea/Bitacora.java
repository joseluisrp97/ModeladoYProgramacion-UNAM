package practica1.configPelea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representa una bitácora para registrar eventos de un combate.
 * <p>
 * Esta clase permite mantener un registro de los eventos que suceden durante
 * un combate, garantizando que estos puedan ser anotados y consultados
 * posteriormente.
 * </p>
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public class Bitacora {

    protected List<String> registros;

    /**
     * Inicializa una nueva bitácora con un mensaje de bienvenida.
     * <p>
     * Al crear una instancia de la clase, esta añade automáticamente un mensaje
     * inicial que indica la bienvenida y la elección de personajes.
     * </p>
     */
    public Bitacora() {
        this.registros = new ArrayList<>();
        this.registros.add("BIENVENIDOS A SUPER SLAM BRAWL \n Hora de elegir a sus personajes:\n ");
    }

    /**
     * Añade un nuevo registro o evento al listado de la bitácora.
     * 
     * @param registro El mensaje o evento a registrar.
     */
    public void escribir(String registro) {
        registros.add(registro + "\n");
    }

    /**
     * Proporciona acceso de solo lectura a los registros.
     * 
     * @return Una lista no modificable de registros.
     */
    public List<String> getRegistros() {
        return Collections.unmodifiableList(registros);
    }
}
