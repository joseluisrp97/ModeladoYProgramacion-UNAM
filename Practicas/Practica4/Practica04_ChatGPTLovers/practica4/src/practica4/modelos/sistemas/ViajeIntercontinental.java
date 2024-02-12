package practica4.modelos.sistemas;

/**
 * Clase que representa un sistema de propulsion para viajes intercontinentales.
 * Extiende de la
 * clase SistemaDePropulsion.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class ViajeIntercontinental extends SistemaDePropulsion {

  public ViajeIntercontinental() {
    this.nombre = "Viaje Intercontinental.";
    this.descripcion = "Sistema avanzado de propulsión intercontinental diseñado para rápidos desplazamientos entre regiones distantes dentro del mismo planeta, garantizando eficiencia y velocidad máxima.";
    this.precio = 860.50;
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
  public int velocidad() {
    return 490;
  }

  @Override
  public int peso() {
    return 230;
  }
}
