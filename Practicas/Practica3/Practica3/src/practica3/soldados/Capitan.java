package practica3.soldados;

import java.util.ArrayList;
import java.util.List;

import practica3.armas.Arma;

/**
 * Clase que representa a un Capitán en la jerarquía militar.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class Capitan implements Rango {

    private String nombre;
    private String formacion;
    private int ataque;
    private int defensa;
    private int velocidad;
    private List<Arma> armas;
    private List<Rango> subordinados;

    public Capitan(String nombre, String formacion) {
        this.nombre = nombre;
        this.formacion = formacion;
        this.nombre = nombre;
        this.ataque = 1;
        this.defensa = 1;
        this.velocidad = 1;
        this.armas = new ArrayList<>();
        this.subordinados = new ArrayList<>();
    }

    @Override
    public void establecerFormacion(String formacion) {
        this.formacion = formacion;
        for (Rango rango : subordinados) {
            rango.establecerFormacion(formacion);
        }
    }

    @Override
    public String obtenerFormacion() {
        return formacion;
    }

    
    public void equiparArma(Arma arma) {
        armas.add(arma);
        this.ataque += arma.getModificadorAtaque();
        this.defensa += arma.getModificadorDefensa();
        this.velocidad += arma.getModificadorVelocidad();
    }

    @Override
    public String generarInforme() {
        StringBuilder informe = new StringBuilder();
        informe.append("Capitán: ").append(nombre).append("\n");
        informe.append("Formación: ").append(formacion).append("\n");
        informe.append("Ataque: ").append(ataque).append("\n");
        informe.append("Defensa: ").append(defensa).append("\n");
        informe.append("Velocidad: ").append(velocidad).append("\n");
        informe.append("Armas equipadas: ");
        for (Arma arma : armas) {
            informe.append(arma.getNombre()).append(", ");
        }
        for (Rango rango : subordinados) {
            informe.append("\n"+rango.generarInforme());
        }
        return informe.toString();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getNombreRango() {
        return "Capitán";
    }

    // Métodos del patrón Composite para manejar subcomponentes
    @Override
    public void agregarSubordinado(Rango rango) {
        subordinados.add(rango);
        rango.establecerFormacion(formacion);
    }

    @Override
    public void eliminarSubordinado(Rango rango) {
        subordinados.remove(rango);
    }

    @Override
    public List<Rango> obtenerSubordinados() {
        return subordinados;
    }
}
