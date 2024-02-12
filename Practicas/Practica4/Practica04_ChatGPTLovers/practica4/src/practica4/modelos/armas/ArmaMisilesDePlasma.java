package practica4.modelos.armas;

/**
 * Clase que representa un arma de misiles de plasma. Extiende de la clase Arma.
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class ArmaMisilesDePlasma extends Arma {

  /** Metodo constructor sin parametros de la clase */
  public ArmaMisilesDePlasma() {
    this.precio = 4800.50;
    this.descripcion = "Lanzador de misiles equipado con proyectiles de plasma altamente concentrado. Cada salva libera 4 misiles guiados por sensores que buscan y se adhieren a su objetivo con precisión mortal.";
    this.nombre = "Misiles de Plasma.";

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
    return 1400;
  }

  @Override
  public int peso() {
    return 280;
  }
}
