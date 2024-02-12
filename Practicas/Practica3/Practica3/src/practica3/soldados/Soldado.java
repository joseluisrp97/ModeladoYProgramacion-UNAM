package practica3.soldados;

import practica3.armas.Arma;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un soldado raso en la jerarquía militar.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class Soldado implements Rango {

    private String nombre;
    private String formacion;
    private int ataque;
    private int defensa;
    private int velocidad;
    private List<Arma> armas;

    public Soldado(String nombre) {
        this.nombre = nombre;
        this.ataque = 1;
        this.defensa = 1;
        this.velocidad = 1;
        this.armas = new ArrayList<>();
    }

    @Override
    public void establecerFormacion(String formacion) {
        this.formacion = formacion;
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
        informe.append("\t\tSoldado: ").append(nombre).append("\n");
        informe.append("\t\tFormación: ").append(formacion).append("\n");
        informe.append("\t\tAtaque: ").append(ataque).append("\n");
        informe.append("\t\tDefensa: ").append(defensa).append("\n");
        informe.append("\t\tVelocidad: ").append(velocidad).append("\n");
        informe.append("\t\tArmas equipadas: ");
        for (Arma arma : armas) {
            informe.append(arma.getNombre()).append(", ");
        }
        informe.delete(informe.length() - 2, informe.length());
        informe.append("\n");
        return informe.toString();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getNombreRango() {
        return "Soldado";
    }

    // Los métodos del patrón Composite para manejar subcomponentes no son
    // necesarios aquí
    @Override
    public void agregarSubordinado(Rango rango) {
        // No aplicable para Soldado
    }

    @Override
    public void eliminarSubordinado(Rango rango) {
        // No aplicable para Soldado
    }

    @Override
    public List<Rango> obtenerSubordinados() {
        // No aplicable para Soldado
        return new ArrayList<>();
    }

    public boolean yaTieneIronCheems() {
        return false;
    }
}
