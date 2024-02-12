package practica1.recursosPelea;

import practica1.movimientosDefensa.*;
import practica1.interfaces.ModoDefensa;

public class Defensas {

        public static ModoDefensa defensaEspejoIlusorio = new DefensaEspejoIlusorio(
                        "espejo ilusorio",
                        8);

        public static ModoDefensa defensaAuraMistica = new DefensaAuraMistica(
                        "aura mistica",
                        9);

        public static ModoDefensa defensaCupulaTemporal = new DefensaCupulaTemporal(
                        "cupula temporal",
                        11);

        public static ModoDefensa defensaVeloSombra = new DefensaVeloSombra(
                        "velo sombra",
                        6);

        public static ModoDefensa defensaPielDeDragon = new DefensaPielDeDragon(
                        "piel de dragon",
                        12);

        public static ModoDefensa defensaCantoSirena = new DefensaCantoSirena(
                        "canto sirena",
                        7);

        public static ModoDefensa defensaDanzaDeLasAuroras = new DefensaDanzaDeLasAuroras(
                        "danza de las auroras",
                        6);

        public static ModoDefensa defensaLaberintoMental = new DefensaLaberintoMental(
                        "laberinto mental",
                        8);

        public static ModoDefensa defensaNidoDeFenix = new DefensaNidoDeFenix(
                        "nido de fenix",
                        10);

}
