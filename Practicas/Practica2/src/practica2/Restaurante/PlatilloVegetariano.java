package practica2.Restaurante;

/**
 * Clase que representa un platillo que NO lleva carne, mayonesa y tampoco
 * queso.
 * 
 * @author Allan Jiménez Hernández
 * @author José Luis Raya Pérez
 */
public class PlatilloVegetariano extends Platillo {

    public PlatilloVegetariano() {
        super(null);
        this.tieneQueso = false;
        this.esVegetariano = true;
    }

    public PlatilloVegetariano(
            Long id,
            String nombre,
            String descripcion,
            double precio,
            Boolean tieneQueso) {
        super(id);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tieneQueso = tieneQueso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean tieneQueso() {
        return tieneQueso;
    }

    @Override
    public boolean esVegetariano() {
        return esVegetariano;
    }

    @Override
    public void ponerMayonesa() {
        System.err.println("No lleva mayonesa");
    }

    @Override
    public void ponerCarne() {
        System.err.println("No lleva carne");
    }

    @Override
    public void ponerQueso() {
        if (tieneQueso) {
            System.err.println("Poniendo queso");
        } else {
            System.err.println("No lleva queso");
        }
    }

    @Override
    public String toString() {
        return String.format("Id: " + this.id + "\n"
                + "Vegetariano" + "\n"
                + "Nombre: " + this.nombre + "\n"
                + "Descripcion: " + this.descripcion + "\n"
                + "Precio: $" + this.precio + "\n"
                + (tieneQueso ? "Con Queso" + "\n" : "")
                + (esVegetariano ? "Vegetariano" + "\n" : "") + "\n");
    }
}
