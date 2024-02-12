package practica4.modelos.sistemas;

/**
 * Clase que representa un sistema de propulsion para viajes interplanetarios.
 * Extiende de la clase
 * SistemaDePropulsion.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class ViajeInterplanetario extends SistemaDePropulsion {

  public ViajeInterplanetario() {
    this.nombre = "Viaje Interplanetario.";
    this.descripcion = "Sistema de propulsión subespacial optimizado, diseñado para atravesar vastas distancias dentro de una galaxia, conectando planetas con rapidez y eficiencia sin precedentes.";
    this.precio = 1750.50;
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
    return 1200;
  }

  @Override
  public int peso() {
    return 670;
  }
}
