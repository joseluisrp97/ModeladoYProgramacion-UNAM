package practica3.soldados;

import java.util.ArrayList;
import java.util.List;

import practica3.armas.Arma;

/**
 * Clase que representa a un Teniente en la jerarquía militar.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class Teniente implements Rango {

    private String nombre;
    private String formacion;
    private int ataque;
    private int defensa;
    private int velocidad;
    private List<Arma> armas;
    private List<Rango> subordinados;

    public Teniente(String nombre) {
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
        informe.append("\tTeniente: ").append(nombre).append("\n");
        informe.append("\tFormación: ").append(formacion).append("\n");
        informe.append("\tAtaque: ").append(ataque).append("\n");
        informe.append("\tDefensa: ").append(defensa).append("\n");
        informe.append("\tVelocidad: ").append(velocidad).append("\n");
        informe.append("\tArmas equipadas: ");
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
        return "Teniente";
    }

    @Override
    public void agregarSubordinado(Rango rango) {
        subordinados.add(rango);
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
