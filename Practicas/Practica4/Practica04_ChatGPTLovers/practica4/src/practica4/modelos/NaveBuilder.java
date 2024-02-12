package practica4.modelos;

/**
 * Clase para construir y almacenar una instancia de la clase Nave. Extiende de
 * Builder
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public class NaveBuilder extends Builder {
  private Nave nave;

  /** 
   * Metodo constructor sin parametros 
   */
  public NaveBuilder() {
  }

  /**
   * Metodo constructor con parametros
   *
   * @param nave instancia de la clase Nave
   */
  public NaveBuilder(Nave nave) {
    this.nave = nave;
  }

  /**
   * Metodo que devuelve el valor del atributo nave
   *
   * @return Nave
   */
  public Nave getNave() {
    return this.nave;
  }

  /** 
   * Metodo para construir una nave y almacenar la misma dentro de la clase 
   */
  @Override
  public Nave build() {
    this.nave = super.build();
    return this.nave;
  }
}
