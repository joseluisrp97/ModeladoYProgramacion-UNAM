package practica4.modelos.blindajes;

/**
 * Clase que representa un blindaje de fortaleza. Extiende de la clase Blindaje.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class BlindajeFortaleza extends Blindaje {

  public BlindajeFortaleza() {
    this.precio = 14500.50;
    this.nombre = "Blindaje Fortaleza.";
    this.descripcion = "Armadura forjada a partir de una fusión única de beskar y neuranio, reforzada con escudos electromagnéticos que la envuelven, proporcionando una defensa impenetrable contra amenazas externas.";

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
    return 3000;
  }

  @Override
  public int peso() {
    return 1000;
  }
}
