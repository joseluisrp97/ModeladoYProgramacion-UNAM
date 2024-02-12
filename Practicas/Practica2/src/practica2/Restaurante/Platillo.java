package practica2.Restaurante;

/**
 * Clase que representa un producto a ser preparado.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public abstract class Platillo {

    protected Long id;
    protected String nombre;
    protected String descripcion;
    protected double precio;
    protected Boolean tieneQueso;
    protected Boolean esVegetariano = false;

    Platillo(Long id) {
        this.id = id;
    }

    /**
     * Método que ejecuta la preparación del platillo, siguiendo una serie de pasos
     * específicos.
     */
    public void preparar() {
        System.out.println("Preparando el pedido:");
        ponerPan();
        agregarCondimentos();
        if (!esVegetariano()) {
            agregarCondimentosNoVegetarianos();
        } else {
            ponerVegetales();
        }
        ponerCatsup();
        ponerPan();
    }

    private void agregarCondimentos() {
        ponerMayonesa();
        ponerMostaza();
    }

    private void agregarCondimentosNoVegetarianos() {
        ponerCarne();
        if (tieneQueso()) {
            ponerQueso();
        }
    }

    public void ponerPan() {
        System.err.println("Poniendo el pan");
    }

    public abstract void ponerMayonesa();

    public void ponerMostaza() {
        System.err.println("Poniendo mostaza");
    }

    public abstract void ponerCarne();

    public abstract void ponerQueso();

    public void ponerVegetales() {
        System.err.println("Poniendo vegetales");
    }

    public boolean esVegetariano() {
        return true;
    }

    public boolean tieneQueso() {
        return false;
    }

    public void ponerCatsup() {
        System.err.println("Poniendo catsup");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
