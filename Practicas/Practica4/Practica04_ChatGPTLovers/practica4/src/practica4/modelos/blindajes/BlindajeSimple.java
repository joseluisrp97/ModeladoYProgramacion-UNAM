package practica4.modelos.blindajes;

/**
 * Clase que representa un blindaje simple. Extiende de la clase Blindaje.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class BlindajeSimple extends Blindaje {

  public BlindajeSimple() {
    this.precio = 500.50;
    this.nombre = "Blindaje Simple.";
    this.descripcion = "Blindaje ligero hecho con acero. Resulta ligero y sutil.";

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
    return 600;
  }

  @Override
  public int peso() {
    return 240;
  }
}
