package practica4.modelos.sistemas;

import practica4.modelos.Componente;

/**
 * Clase abstracta que representa el sistema de propulsion de una nave.
 * Implementa la interfaz
 * Componente.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel
 */
public abstract class SistemaDePropulsion implements Componente {
  protected double precio;
  protected String descripcion;
  protected String nombre;

  /**
   * Representacion en cadena de la clase
   *
   * @return String
   */
  @Override
  public String toString() {
    return nombre + "\n" + descripcion;
  }

  /**
   * Metodo abstracto para modificar la velocidad de la nave
   *
   * @return int
   */
  public abstract int velocidad();

  /**
   * Metodo para modificar el ataque de la nave
   *
   * @return int
   */
  public int ataque() {
    return 0;
  }

  /**
   * Metodo para modificar la defensa de la nave
   *
   * @return int
   */
  public int defensa() {
    return 0;
  }
}
