package practica4.modelos;

/**
 * Interfaz que representa un componente que forma parte de una nave
 *
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 * @author Alejandra Valentina Arias Villarroel 
 */
public interface Componente {
  public String nombre();

  public String descripcion();

  public double precio();

  public int peso();

  public int ataque();

  public int defensa();

  public int velocidad();
}
