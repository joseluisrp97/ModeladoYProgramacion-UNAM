package practica4.modelos.cabinas;

/**
 * Clase que representa una cabina de un piloto. Extiende de la clase Cabina.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class Cabina1Piloto extends Cabina {

  public Cabina1Piloto() {
    this.nombre = "Cabina de un piloto.";
    this.descripcion = "Cabina diseñado para acomodar a un solo piloto, optimizando el espacio y la ergonomía para misiones prolongadas.";
    this.precio = 500.50;
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
    return 340;
  }

  @Override
  public int peso() {
    return 160;
  }
}
