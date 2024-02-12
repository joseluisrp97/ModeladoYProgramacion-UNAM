package practica3.batallones;

import practica3.soldados.Capitan;
import practica3.soldados.Rango;
import practica3.soldados.Soldado;
import practica3.soldados.Teniente;
import practica3.armas.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un Batallón en la jerarquía militar.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel
 */
public class Batallon {
    public List<Capitan> capitanes;

    /**
     * Constructor
     */
    public Batallon() {
        capitanes = new ArrayList<Capitan>();

        // Batallón 1
        Capitan capitan1 = new Capitan("Carlos Bautista", "Alfa");
        Teniente teniente1 = new Teniente("Maria Rodriguez");
        Teniente teniente2 = new Teniente("Pedro Lopez");
        Soldado soldado1 = new Soldado("Luis Gonzales");
        Soldado soldado2 = new Soldado("Laura Sanchez");
        Soldado soldado3 = new Soldado("Carlos Fernandez");
        Soldado soldado4 = new Soldado("Teresa Ramirez");
        Soldado soldado5 = new Soldado("Javier Garcia");

        capitan1.equiparArma(new Alas());
        teniente1.equiparArma(new EspadaGigante());
        teniente2.equiparArma(new Grafeno());
        soldado1.equiparArma(new Kevlar());
        soldado2.equiparArma(new PistolaPapas());
        soldado3.equiparArma(new RanaGigante());
        soldado4.equiparArma(new Tanque());
        soldado5.equiparArma(new Turbinas());

        capitan1.agregarSubordinado(teniente1);
        capitan1.agregarSubordinado(teniente2);
        teniente1.agregarSubordinado(soldado1);
        teniente1.agregarSubordinado(soldado2);
        teniente1.agregarSubordinado(soldado3);
        teniente2.agregarSubordinado(soldado4);
        teniente2.agregarSubordinado(soldado5);

        capitanes.add(capitan1);

        // Batallón 2
        Capitan capitan2 = new Capitan("Sofia Torres", "beta");
        Teniente teniente3 = new Teniente("Andres Cruz");
        Teniente teniente4 = new Teniente("Carmen Ruiz");
        Soldado soldado6 = new Soldado("David Morales");
        Soldado soldado7 = new Soldado("Patricia Ortiz");
        Soldado soldado8 = new Soldado("Alejandro Castro");
        Soldado soldado9 = new Soldado("Paula Vargas");
        Soldado soldado10 = new Soldado("Manuel Reyes");

        capitan2.equiparArma(new Alas());
        teniente3.equiparArma(new EspadaGigante());
        teniente4.equiparArma(new Grafeno());
        soldado6.equiparArma(new Kevlar());
        soldado7.equiparArma(new PistolaPapas());
        soldado8.equiparArma(new RanaGigante());
        soldado9.equiparArma(new Tanque());
        soldado10.equiparArma(new Turbinas());

        capitan2.agregarSubordinado(teniente1);
        capitan2.agregarSubordinado(teniente2);
        teniente3.agregarSubordinado(soldado6);
        teniente3.agregarSubordinado(soldado7);
        teniente4.agregarSubordinado(soldado8);
        teniente4.agregarSubordinado(soldado9);
        teniente4.agregarSubordinado(soldado10);

        capitanes.add(capitan2);

        // Batallón 3
        Capitan capitan3 = new Capitan("Juan Morales", "Charlie");
        Teniente teniente5 = new Teniente("Daniela Ortega");
        Teniente teniente6 = new Teniente("Roberto Paredes");
        Soldado soldado11 = new Soldado("Isabel Torres");
        Soldado soldado12 = new Soldado("Manuel Peña");
        Soldado soldado13 = new Soldado("Ana Castillo");
        Soldado soldado14 = new Soldado("Diego Herrera");
        Soldado soldado15 = new Soldado("Sofia Aguirre");

        capitan3.equiparArma(new EspadaGigante());
        teniente5.equiparArma(new Kevlar());
        teniente6.equiparArma(new PistolaPapas());
        soldado11.equiparArma(new Alas());
        soldado12.equiparArma(new Grafeno());
        soldado13.equiparArma(new RanaGigante());
        soldado14.equiparArma(new EspadaGigante());
        soldado15.equiparArma(new Kevlar());

        capitan3.agregarSubordinado(teniente5);
        capitan1.agregarSubordinado(teniente6);
        teniente1.agregarSubordinado(soldado11);
        teniente1.agregarSubordinado(soldado12);
        teniente1.agregarSubordinado(soldado13);
        teniente2.agregarSubordinado(soldado14);
        teniente2.agregarSubordinado(soldado15);

        capitanes.add(capitan3);
    }

    public String generarReporteCompleto() {
        String informeCompleto = "";
        for (Capitan capitan : capitanes) {
            informeCompleto += capitan.generarInforme();
        }
        return informeCompleto;
    }

    public String generarReporteBatallon(int numeroBatallon) {
        Capitan capitanBatallon = capitanes.get(numeroBatallon - 1);
        return capitanBatallon.generarInforme();
    }

    public String generarReporteSoldadoRaso(String buscado) {
        for (Capitan capitan : capitanes) {
            List<Rango> tenientes = capitan.obtenerSubordinados();
            for (Rango teniente : tenientes) {
                List<Rango> soldados = teniente.obtenerSubordinados();
                for (Rango soldado : soldados) {
                    String nombre = soldado.getNombre();
                    if (nombre.toLowerCase().equals(buscado.toLowerCase())) {
                        return soldado.generarInforme();
                    }
                }
            }
        }
        return "Soldado no encontrado";
    }

    public void agregarABatallon(int numeroBatallon, Rango soldado) {
        if (numeroBatallon >= 1 && numeroBatallon <= capitanes.size()) {
            Capitan capitanElegido = capitanes.get(numeroBatallon - 1);
            capitanElegido.agregarSubordinado(soldado);
        } else {
            System.out.println("Número de batallón no válido.");
        }
    }

}
