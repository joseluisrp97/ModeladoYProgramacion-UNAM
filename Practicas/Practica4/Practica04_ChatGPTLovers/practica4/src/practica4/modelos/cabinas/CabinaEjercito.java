package practica4.modelos.cabinas;

/**
 * Clase que representa una cabina para un ejercito. Extiende de la clase
 * Cabina.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class CabinaEjercito extends Cabina {

  public CabinaEjercito() {
    this.nombre = "Cabina Ejercito.";
    this.descripcion = "Cabina creada para un ejercito extenso.";
    this.precio = 3600.50;
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
    return 1200;
  }

  @Override
  public int peso() {
    return 680;
  }
}
