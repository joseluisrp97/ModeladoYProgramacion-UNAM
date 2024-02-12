package practica1.recursosPelea;

import java.util.List;

import practica1.configPelea.Empresa;
import practica1.configPelea.Personaje;
import practica1.configPelea.Transformacion;

import static practica1.recursosPelea.Ataques.*;
import static practica1.recursosPelea.Defensas.*;

/* 
/**
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 * Clase con las constantes que seran utilizadas para el torneo
 */
public final class Formacion {

    public static final String ruta = "./bitacorasPelea/";

    public static final Integer ptsAtaqueInicial = 30;
    public static final Integer ptsDefensaInicial = 10;
    public static final Integer ptsVidaIniciales = 150;
    public static Integer vencedor = 0;

    public static List<Transformacion> transformacionesNientiendo = List.of(
            new Transformacion(
                    "Plumberio",
                    ataqueDanzaDeSombras,
                    defensaAuraMistica),
            new Transformacion(
                    "Yoshizo",
                    ataqueDescargaGalactica,
                    defensaCantoSirena),
            new Transformacion(
                    "Hongocho",
                    ataqueEcoSonico,
                    defensaCupulaTemporal));

    public static List<Transformacion> transformacionesCopcam = List.of(
            new Transformacion(
                    "Chun-Loco",
                    ataqueEspejismoDesertico,
                    defensaDanzaDeLasAuroras),
            new Transformacion(
                    "Doctor Vicio",
                    ataqueGarraHuracan,
                    defensaEspejoIlusorio),
            new Transformacion(
                    "Zombiezote",
                    ataqueLluviaAcida,
                    defensaLaberintoMental));

    public static List<Transformacion> transformacionesChinpokomon = List.of(
            new Transformacion(
                    "Bulbañero",
                    ataqueMantoDeEspinas,
                    defensaNidoDeFenix),
            new Transformacion(
                    "Magikarretero",
                    ataqueMeteoritoEstelar,
                    defensaPielDeDragon),
            new Transformacion(
                    "Psychochito",
                    ataqueOndaPsi,
                    defensaVeloSombra));

    public static List<Empresa> empresas = List.of(
            new Empresa(
                    "Nientiendo",
                    Formacion.transformacionesNientiendo),
            new Empresa(
                    "Copcam",
                    Formacion.transformacionesCopcam),
            new Empresa(
                    "Chinpokomon",
                    Formacion.transformacionesChinpokomon));

    public static final List<Personaje> personajes = List.of(
            new Personaje(empresas.get(0), "Korby", 20, 10, ptsVidaIniciales),
            new Personaje(empresas.get(1), "MeganMan", 30, 20, ptsVidaIniciales),
            new Personaje(empresas.get(2), "Dittuu", 25, 30, ptsVidaIniciales));

    /**
     * Metodo para imprimir en pantalla un texto
     * 
     * @param line Linea de texto que se desea imprimir
     */
    public static void println(String line) {
        System.out.println(line);
    }

    /**
     * Genera un número aleatorio entre dos límites.
     * 
     * @param inicio Límite inferior del intervalo.
     * @param fin    Límite superior del intervalo.
     * @return Número aleatorio entre inicio y fin.
     */
    public static int randEntre(int inicio, int fin) {
        return (int) ((Math.random() * (fin - inicio)) + inicio);
    }

}
