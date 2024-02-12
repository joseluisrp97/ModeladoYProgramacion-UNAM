package practica4.modelos.armas;

/**
 * Clase que representa un arma destructora de planetas. Extiende de la clase
 * Arma.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class ArmaLaserDestructorDePlanetas extends Arma {

  // Constructor
  public ArmaLaserDestructorDePlanetas() {
    this.precio = 15000.50;
    this.descripcion = "Rayo de alta potencia alimentado por cristales kyber oscuros. Capaz de aniquilar sistemas estelares enteros.";
    this.nombre = "Laser Destructor de Planetas";
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
  public int ataque() {
    return 5000;
  }

  @Override
  public int peso() {
    return 420;
  }
}
