package practica4.modelos;

/**
 * Clase para construir y sustituir piezas de un objeto complejo
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel
 */
public class Builder {

  protected Componente arma;
  protected Componente blindaje;
  protected Componente cabina;
  protected Componente propulsion;

  /** COnstructor sin parametros de la clase */
  public Builder() {
  }

  /**
   * Constructor con parametros de la clase
   *
   * @param arma
   * @param blindaje
   * @param cabina
   * @param sistema
   */
  public Builder(Componente arma, Componente blindaje, Componente cabina, Componente propulsion) {
    this.arma = arma;
    this.blindaje = blindaje;
    this.cabina = cabina;
    this.propulsion = propulsion;
  }

  /**
   * Metodo para construir una nave de acuerdo a los elementos que tiene el
   * Builder
   *
   * @return Nave
   */
  public Nave build() {
    if (arma == null || blindaje == null || cabina == null || propulsion == null) {
      throw new IllegalStateException("Todos los componentes deben estar configurados antes de construir la Nave.");
    }
    return new Nave(this.arma, this.blindaje, this.cabina, this.propulsion);
  }

  /**
   * Metodo para modificar el atributo arma de la clase
   *
   * @param arma Instancia de la clase Componente
   * @return Builder
   */
  public Builder arma(Componente arma) {
    this.arma = arma;
    return this;
  }

  /**
   * Metodo para modificar el atributo blindaje de la clase
   *
   * @param blindaje Instancia de la clase Componente
   * @return Builder
   */
  public Builder blindaje(Componente blindaje) {
    this.blindaje = blindaje;
    return this;
  }

  /**
   * Metodo para modificar el atributo cabina de la clase
   *
   * @param cabina Instancia de la clase Componente
   * @return Builder
   */
  public Builder cabina(Componente cabina) {
    this.cabina = cabina;
    return this;
  }

  /**
   * Metodo para modificar el atributo propulsion de la clase
   *
   * @param propulsion Instancia de la clase Componente
   * @return Builder
   */
  public Builder sistemaDePropulsion(Componente propulsion) {
    this.propulsion = propulsion;
    return this;
  }
}
