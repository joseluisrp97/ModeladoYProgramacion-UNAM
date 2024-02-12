package practica3.CheemsSoldado;

public class Armadura implements Reliquia{

	private int id;
	private String nombre;
	private double defensaMagica;
	private String folklore;

	public Armadura(int id, String nombre, double defensaMagica, String folklore){
		this.id = id;
		this.nombre = nombre;
		this.defensaMagica = defensaMagica;
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
		return defensaMagica;
	}

	@Override
	public String getFolklore(){
		return folklore;
	}

	@Override
	public String toString(){
		return "Reliquia: " + getNombre() + " defensa: " + 
			getModificador() + " folklore: " + getFolklore();
	}
}