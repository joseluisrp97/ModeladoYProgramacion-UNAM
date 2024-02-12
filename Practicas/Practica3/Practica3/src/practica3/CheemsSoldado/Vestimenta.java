package practica3.CheemsSoldado;

public class Vestimenta implements Reliquia{

	private int id;
	private String nombre;
	private double movimientoMagico;
	private String folklore;

	public Vestimenta(int id, String nombre, double movimientoMagico, String folklore){
		this.id = id;
		this.nombre = nombre;
		this.movimientoMagico = movimientoMagico;
		this.folklore = folklore;
	}

	@Override
	public int getId(){
		return id;
	}

	@Override
	public String getNombre(){
		return nombre;
	}

	@Override
	public double getModificador(){
		return movimientoMagico;
	}

	@Override
	public String getFolklore(){
		return folklore;
	}

	@Override
	public String toString(){
		return "Reliquia: " + getNombre() + " movimiento: " + 
			getModificador() + " folklore: " + getFolklore();
	}

}