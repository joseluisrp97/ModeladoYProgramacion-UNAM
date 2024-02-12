package practica1.configPelea;

import practica1.recursosPelea.Formacion;

import java.util.Objects;

import practica1.movimientosAtaque.Ataque;
import practica1.movimientosDefensa.Defensa;

/**
 * Representa un personaje dentro de un torneo de pelea.
 * Cada personaje tiene una empresa de origen, puntos de vida,
 * un potenciador (si lo posee), y puntos base de ataque y defensa.
 * 
 * @author Raya Pérez José Luis
 * @author Jimenez Hernández Allan
 * @author Vazquez Dávila José Adolfo
 */
public class Personaje {

    public Empresa empresa;
    public Integer ptsVida;
    public Transformacion potenciador;
    public String nombre;
    public Integer ptsAtaque;
    public Integer ptsDefensa;
    public String ataquePorDefecto;
    public String defensaPorDefecto;

    /**
     * Crea un nuevo personaje con valores iniciales para vida,
     * ataque y defensa.
     * 
     * @param empresa    La empresa de la cual proviene el personaje.
     * @param nombre     El nombre del personaje.
     * @param ptsAtaque  Puntos iniciales de ataque del personaje.
     * @param ptsDefensa Puntos iniciales de defensa del personaje.
     */
    public Personaje(Empresa empresa, String nombre, Integer ptsAtaque, Integer ptsDefensa, Integer ptsVida) {
        this.empresa = empresa;
        this.ptsVida = Formacion.ptsVidaIniciales;
        this.potenciador = null;
        this.nombre = nombre;
        this.ptsAtaque = ptsAtaque;
        this.ptsDefensa = ptsDefensa;
        this.ataquePorDefecto = "golpe básico";
        this.defensaPorDefecto = "defensa básica";
        this.ptsVida = ptsVida;
    }

    /**
     * Ataca a un personaje rival. Si el atacante tiene un potenciador,
     * el ataque se modifica según el comportamiento del potenciador.
     * 
     * @param rival El personaje que recibirá el ataque.
     */
    public void atacar(Personaje rival) {

        // Agrega un comportamiento extra dependiendo de cada comportamiento
        if (this.potenciador != null) {
            this.potenciador.modoAtaque.atacar(rival);
        }

        int puntos = this.getPtsAtaque();

        rival.ptsVida -= rival.defender(puntos);
    }

    /**
     * Retorna los puntos de ataque del personaje, considerando
     * cualquier potenciador que posea.
     * 
     * @return Puntos de ataque del personaje.
     */
    public Integer getPtsAtaque() {
        if (this.potenciador != null) {
            return this.ptsAtaque + ((Ataque) this.potenciador.modoAtaque).ptsAtaque;
        }

        return this.ptsAtaque;
    }

    /**
     * Retorna los puntos de defensa del personaje, considerando
     * cualquier potenciador que posea.
     * 
     * @return Puntos de defensa del personaje.
     */
    public Integer getPtsDefensa() {
        return (this.potenciador != null)
                ? this.ptsDefensa + ((Defensa) this.potenciador.modoDefensa).ptsDefensa
                : this.ptsDefensa;
    }

    /**
     * Defiende al personaje de un ataque entrante, reduciendo el daño
     * recibido basado en los puntos de defensa.
     * 
     * @param ptsAtaque Puntos de ataque del atacante.
     * @return Puntos de daño final después de la defensa.
     */
    public Integer defender(Integer ptsAtaque) {

        if (this.potenciador != null) {
            this.potenciador.modoDefensa.defender(ptsAtaque);
        }

        int res = ptsAtaque - this.getPtsDefensa();

        return res < 0 ? 0 : res;
    }

    @Override
    /**
     * Retorna una representación de cadena del personaje.
     * 
     * @return El nombre del personaje.
     */
    public String toString() {
        return this.nombre;
    }

    /**
     * Verifica si el personaje aún tiene puntos de vida.
     * 
     * @return Verdadero si el personaje sigue con vida, falso en caso contrario.
     */
    public boolean conVida() {
        return this.ptsVida > 0;
    }

    /**
     * Devuelve una cadena que describe el ataque utilizado por el personaje.
     * 
     * @return Una descripción del ataque.
     */
    public String mostrarAtaque() {
        return potenciador != null ? potenciador.modoAtaque.evento() : ataquePorDefecto;
    }

    /**
     * Devuelve una cadena que describe la defensa utilizada por el personaje.
     * 
     * @return Una descripción de la defensa.
     */
    public String mostrarDefensa() {
        return potenciador != null ? potenciador.modoDefensa.evento() : defensaPorDefecto;
    }

    /**
     * Verifica si otro objeto es igual al personaje actual, basado en su nombre.
     * 
     * @param obj Objeto a comparar.
     * @return Verdadero si son iguales, falso en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Personaje) {
            return Objects.equals(this.nombre, ((Personaje) obj).nombre);
        }
        return false;
    }
}
