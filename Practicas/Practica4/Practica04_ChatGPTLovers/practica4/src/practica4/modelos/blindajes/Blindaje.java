package practica4.modelos.blindajes;

import practica4.modelos.Componente;

/**
 * Clase abstracta que representa el blindaje de una nave. Implementa la
 * interfaz Componente.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel
 */
public abstract class Blindaje implements Componente {
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
   * Metodo para modificar el ataque de la nave
   *
   * @return int
   */
  public int ataque() {
    return 0;
  }

  /**
   * Metodo abstracto para modificar la defensa de la nave
   *
   * @return int
   */
  public abstract int defensa();

  /**
   * Metodo para modificar la velocidad de la nave
   *
   * @return int
   */
  public int velocidad() {
    return 0;
  }
}
