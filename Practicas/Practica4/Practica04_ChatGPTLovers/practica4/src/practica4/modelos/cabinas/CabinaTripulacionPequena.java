package practica4.modelos.cabinas;

/**
 * Clase que representa una cabina para una tripulacion pequenia. Extiende de la
 * clase Cabina.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class CabinaTripulacionPequena extends Cabina {

  public CabinaTripulacionPequena() {
    this.nombre = "Cabina Tripulacion Pequena.";
    this.descripcion = "Cabina espaciosa diseñada para albergar una tripulación de 3 a 4 miembros, equipada con controles y asientos ergonómicos para garantizar comodidad durante misiones extensas.";
    this.precio = 2670.50;
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
    return 800;
  }

  @Override
  public int peso() {
    return 460;
  }
}
