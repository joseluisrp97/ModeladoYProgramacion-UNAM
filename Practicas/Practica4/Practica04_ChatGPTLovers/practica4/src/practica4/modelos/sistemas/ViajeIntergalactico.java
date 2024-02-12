package practica4.modelos.sistemas;

/**
 * Clase que representa un sistema de propulsion para viajes intergalacticos.
 * Extiende de la clase
 * SistemaDePropulsion.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class ViajeIntergalactico extends SistemaDePropulsion {

  /** Metodo constructor sin parametros de la clase */
  public ViajeIntergalactico() {
    this.nombre = "Viaje Intergalactico.";
    this.descripcion = "Sistema hiperespacial de vanguardia, capaz de abrir brechas en el tejido del espacio-tiempo para facilitar viajes intergalácticos a velocidades antes inimaginables.";
    this.precio = 5600.50;
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
    return 2500;
  }

  @Override
  public int peso() {
    return 890;
  }
}
