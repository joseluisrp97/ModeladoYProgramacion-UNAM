package practica4.modelos.armas;

/**
 * Clase que representa un arma laser básica. Extiende de la clase Arma.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class ArmaLaserSimple extends Arma {

  // Constructor
  public ArmaLaserSimple() {
    this.precio = 650.50;
    this.descripcion = "Láser monopulso alimentado por mini cristales kyber. Ideal para combates rápidos.";
    this.nombre = "Láser simple";
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
    return 500;
  }

  @Override
  public int peso() {
    return 60;
  }
}
