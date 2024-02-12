package practica3.armas;

import practica3.CheemsSoldado.Reliquia;

/**
 * Clase que implementa el Adapter en un arma para hacerla reliquia.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel
 */
public class ArmaReliquiaAdapter implements Reliquia {
    private Arma arma;
    private int id;
    private static int contador = 0;

    public ArmaReliquiaAdapter(Arma arma) {
        this.arma = arma;
        this.id = contador++;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getNombre() {
        return arma.getNombre();
    }

    @Override
    public double getModificador() {
        // Podrías promediar o sumar los modificadores de arma para obtener un único
        // modificador mágico
        return (arma.getModificadorAtaque() + arma.getModificadorDefensa() + arma.getModificadorVelocidad()) / 3.0;
    }

    @Override
    public String getFolklore() {
        return "Adaptado de Arma Estándar";
    }

    @Override
    public String toString() {
        return "Arma adaptada: " + arma.getNombre();
    }

}
