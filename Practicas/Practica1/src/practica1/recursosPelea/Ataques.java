package practica1.recursosPelea;

import practica1.movimientosAtaque.*;
import practica1.interfaces.ModoAtaque;

public class Ataques {

        public static ModoAtaque ataqueMeteoritoEstelar = new AtaqueMeteoritoEstelar(
                        "meteorito estelar",
                        21);

        public static ModoAtaque ataqueDanzaDeSombras = new AtaqueDanzaDeSombras(
                        "danza de sombras",
                        30);

        public static ModoAtaque ataqueLluviaAcida = new AtaqueLluviaAcida(
                        "lluvia ácida",
                        35);

        public static ModoAtaque ataqueEcoSonico = new AtaqueEcoSonico(
                        "eco sónico",
                        10);

        public static ModoAtaque ataqueEspejismoDesertico = new AtaqueEspejismoDesertico(
                        "espejismo desértico",
                        15);

        public static ModoAtaque ataqueGarraHuracan = new AtaqueGarraHuracan(
                        "garra huracán",
                        25);

        public static ModoAtaque ataqueOndaPsi = new AtaqueOndaPsi(
                        "onda psi",
                        20);

        public static ModoAtaque ataqueMantoDeEspinas = new AtaqueMantoDeEspinas(
                        "manto de espinas",
                        10);

        public static ModoAtaque ataqueDescargaGalactica = new AtaqueDescargaGalactica(
                        "descarga galáctica",
                        30);
}
