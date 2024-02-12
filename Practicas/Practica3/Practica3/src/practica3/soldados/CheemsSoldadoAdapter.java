package practica3.soldados;

import practica3.CheemsSoldado.CheemsSoldado;
import practica3.CheemsSoldado.Reliquia;

import practica3.armas.ArmaReliquiaAdapter;
import practica3.armas.Arma;

import java.util.ArrayList;
import java.util.List;

public class CheemsSoldadoAdapter implements Rango {

    private CheemsSoldado cheems;
    private double bonusAtaque = 0.0;
    private double bonusDefensa = 0.0;
    private double bonusMovimiento = 0.0;

    public CheemsSoldadoAdapter(CheemsSoldado cheems) {
        this.cheems = cheems;
    }

    @Override
    public void establecerFormacion(String formacion) {
    }

    @Override
    public String obtenerFormacion() {
        return "";
    }

    @Override
    public String generarInforme() {
        String originalInfo = cheems.infoCheems();

        // Reconstruyendo el informe ajustando con los bonos
        String adjustedInfo = originalInfo
                .replace("ataque magico: " + cheems.getAtaqueMagico(),
                        "ataque magico: " + (cheems.getAtaqueMagico() + bonusAtaque))
                .replace("defensa magica: " + cheems.getDefensaMagica(),
                        "defensa magica: " + (cheems.getDefensaMagica() + bonusDefensa))
                .replace("movimiento magico: " + cheems.getMovimientoMagico(),
                        "movimiento magico: " + (cheems.getMovimientoMagico() + bonusMovimiento));

        return adjustedInfo;
    }

    @Override
    public String getNombre() {
        return "Cheems";
    }

    @Override
    public String getNombreRango() {
        return "Soldado Cheems";
    }

    @Override
    public void agregarSubordinado(Rango rango) {
        // No aplicable para Cheems
    }

    @Override
    public void eliminarSubordinado(Rango rango) {
        // No aplicable para Cheems
    }

    @Override
    public List<Rango> obtenerSubordinados() {
        // No aplicable para Cheems
        return new ArrayList<>();
    }

    public void equiparArma(Arma arma) {
        // Convertimos la arma en una reliquia usando el adaptador
        Reliquia reliquiaAdaptada = new ArmaReliquiaAdapter(arma);

        // Agregamos la reliquia adaptada al CheemsSoldado
        cheems.agregarReliquia(reliquiaAdaptada);
        bonusAtaque += arma.getModificadorAtaque();
        bonusDefensa += arma.getModificadorDefensa();
        bonusMovimiento += arma.getModificadorVelocidad();
    }

}
