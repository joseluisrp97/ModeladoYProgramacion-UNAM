package practica3.CheemsSoldado;

public class Arma implements Reliquia{

	private int id;
	private String nombre;
	private double ataqueMagico;
	private String folklore;

	public Arma(int id, String nombre, double ataqueMagico, String folklore){
		this.id = id;
		this.nombre = nombre;
		this.ataqueMagico = ataqueMagico;
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
		return ataqueMagico;
	}

	@Override
	public String getFolklore(){
		return folklore;
	}

	@Override
	public String toString(){
		return "Reliquia: " + getNombre() + " ataque: " + 
			getModificador() + " folklore: " + getFolklore();
	}
}