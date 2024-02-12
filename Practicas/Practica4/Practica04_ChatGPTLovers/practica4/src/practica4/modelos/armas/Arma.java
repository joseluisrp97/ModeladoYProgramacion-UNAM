package practica4.modelos.armas;

import practica4.modelos.Componente;

/**
 * Clase abstracta que representa el arma de una nave. Implementa la interfaz
 * Componente.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel
 */
public abstract class Arma implements Componente {
  protected double precio;
  protected String descripcion;
  protected String nombre;

  /**
   * Representacion en cadena de la clase.
   *
   * @return String con el nombre y descripción del arma.
   */
  @Override
  public String toString() {
    return nombre + "\n" + descripcion;
  }

  /**
   * Método abstracto para modificar el ataque de la nave.
   *
   * @return int con el valor de ataque.
   */
  public abstract int ataque();

  /**
   * Método para modificar la defensa de la nave.
   *
   * @return int con el valor de defensa (por defecto 0).
   */
  @Override
  public int defensa() {
    return 0;
  }

  /**
   * Método para modificar la velocidad de la nave.
   *
   * @return int con el valor de velocidad (por defecto 0).
   */
  @Override
  public int velocidad() {
    return 0;
  }
}
