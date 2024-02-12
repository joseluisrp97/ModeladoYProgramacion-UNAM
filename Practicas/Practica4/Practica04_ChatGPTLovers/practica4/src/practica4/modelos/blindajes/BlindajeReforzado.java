package practica4.modelos.blindajes;

/**
 * Clase que representa un blindaje reforzado. Extiende de la clase Blindaje.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class BlindajeReforzado extends Blindaje {

  public BlindajeReforzado() {
    this.precio = 5500.50;
    this.nombre = "Blindaje Reforzado.";
    this.descripcion = "Armadura robusta compuesta por una aleación exquisita de hierro y diamanete, diseñada para desviar y absorber impactos directos de disparos láser.";
  }

  @Override
  public String nombre() {
    return this.nombre;
  }

  @Override
  public String descripcion() {
    return this.descripcion;
  }

  @Override
  public double precio() {
    return this.precio;
  }

  @Override
  public int defensa() {
    return 2000;
  }

  @Override
  public int peso() {
    return 650;
  }
}
