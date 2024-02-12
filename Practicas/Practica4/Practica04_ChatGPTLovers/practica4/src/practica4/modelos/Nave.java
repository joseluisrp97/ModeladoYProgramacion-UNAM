package practica4.modelos;

import practica4.modelos.armas.*;
import practica4.modelos.blindajes.*;
import practica4.modelos.cabinas.*;
import practica4.modelos.sistemas.*;

/**
 * Clase que simula una Nave que se conforma de varias y distintas instancias de
 * la clase componente
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel
 */
public class Nave {

  private int ataque;
  private int defensa;
  private int velocidad;
  private int peso;
  private Componente arma;
  private Componente blindaje;
  private Componente cabina;
  private Componente propulsion;

  /**
   * Constructor con parametros de la clase
   *
   * @param arma       Instancia de la clase Componente
   * @param blindaje   Instancia de la clase Componente
   * @param cabina     Instancia de la clase Componente
   * @param propulsion Instancia de la clase Componente
   */
  public Nave(Componente arma, Componente blindaje, Componente cabina, Componente propulsion) {
    this.arma = arma;
    this.blindaje = blindaje;
    this.cabina = cabina;
    this.propulsion = propulsion;
    this.peso = arma.peso() + blindaje.peso() + cabina.peso() + propulsion.peso();
    this.ataque = arma.ataque();
    this.defensa = cabina.defensa() + blindaje.defensa();
    this.velocidad = 100 + propulsion.velocidad();
  }

  /**
   * Metodo constructor sin parametros de la clase
   */
  public Nave() {
    arma = new ArmaLaserSimple();
    blindaje = new BlindajeFortaleza();
    cabina = new Cabina1Piloto();
    propulsion = new ViajeIntercontinental();
  }

  /**
   * Metodo para obtener el costo total de la nave
   *
   * @return double
   */
  public double obtenerCosto() {

    double total = 0.0;

    total += arma.precio();
    total += blindaje.precio();
    total += cabina.precio();
    total += propulsion.precio();
    double totalRedondeado = Math.round(total * 100.0) / 100.0;
    return totalRedondeado;
  }

  /**
   * Metodo para obtener el valor del atributo arma
   *
   * @return Componente
   */
  public Componente getArma() {
    return arma;
  }

  /**
   * Metodo para modificar el valor del atributo arma
   *
   * @param arma Instancia de la clase Componente
   */
  private void setArma(Componente arma) {
    this.arma = arma;
  }

  /**
   * Metodo para obtener el valor del atributo blindaje
   *
   * @return Componente
   */
  public Componente getBlindaje() {
    return blindaje;
  }

  /**
   * Metodo para modificar el valor del atributo blindaje
   *
   * @param blindaje Instancia de la clase Componente
   */
  private void setBlindaje(Componente blindaje) {
    this.blindaje = blindaje;
  }

  /**
   * Metodo para obtener el valor del atributo cabina
   *
   * @return Componente
   */
  public Componente getCabina() {
    return cabina;
  }

  /**
   * Metodo para modificar el valor del atributo cabina
   *
   * @param cabina Instancia de la clase Componente
   */
  private void setCabina(Componente cabina) {
    this.cabina = cabina;
  }

  /**
   * Metodo para obtener el valor del atributo sistemaDePropulsion
   *
   * @return Componente
   */
  public Componente getSistemaDePropulsion() {
    return propulsion;
  }

  /**
   * Metodo para modificar el valor del atributo sistemaDePropulsion
   *
   * @param propulsion Instancia de la clase Componente
   */
  private void setSistemaDePropulsion(Componente propulsion) {
    this.propulsion = propulsion;
  }

  /**
   * Metodo que devuelve la representacion de la clase en una cadena
   *
   * @return String
   */
  @Override
  public String toString() {

    calcularEstadisticas();
    return ""
        + "Sistema de propulsion: "

        + this.propulsion
        + "\n"
        + "Armas: "
        + this.arma
        + "\n"
        + "Cabina: "
        + this.cabina
        + "\n"
        + "Blindaje: "
        + this.blindaje
        + "\n"
        + "Peso: "
        + this.peso
        + " kilogramos\n"
        + "Ataque: "
        + this.ataque
        + " puntos\n"
        + "Defensa: "
        + this.defensa
        + " puntos \n"
        + "Velocidad: "
        + this.velocidad
        + " puntos\n";
  }

  /**
   * Metodo para calcular las estadisticas de la clase
   */
  private void calcularEstadisticas() {
    this.peso = +this.arma.peso()
        + this.blindaje.peso()
        + this.cabina.peso()
        + this.propulsion.peso();
    this.ataque = +this.arma.ataque();
    this.defensa = +this.cabina.defensa() + this.blindaje.defensa();
    this.velocidad = +this.propulsion.velocidad();
  }
}
