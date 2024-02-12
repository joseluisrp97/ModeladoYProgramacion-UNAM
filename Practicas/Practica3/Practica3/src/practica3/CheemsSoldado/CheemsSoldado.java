package practica3.CheemsSoldado;

import java.util.HashMap;

public class CheemsSoldado {
	private String nombre;
	private int id;
	private HashMap<Integer, Reliquia> reliquias = new HashMap<Integer, Reliquia>();
	private double ataqueMagico;
	private double defensaMagica;
	private double movimientoMagico;
	private double bonusMagico;

	public CheemsSoldado(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
		ataqueMagico = 5.0;
		defensaMagica = 5.0;
		movimientoMagico = 5.0;
	}

	public void agregarReliquia(Reliquia nuevaReliquia) {
		for (Reliquia rel : reliquias.values()) {
			String nuevoFolk = nuevaReliquia.getFolklore();
			if (nuevoFolk.equals(rel.getFolklore()))
				bonusMagico += 1.1;
		}
		reliquias.put(nuevaReliquia.getId(), nuevaReliquia);
	}

	public void activarReliquias() {
		for (Reliquia rel : reliquias.values()) {
			if (rel instanceof Arma) {
				ataqueMagico += rel.getModificador();
			} else if (rel instanceof Armadura) {
				defensaMagica += rel.getModificador();
			} else if (rel instanceof Vestimenta) {
				movimientoMagico += rel.getModificador();
			}
		}
		ataqueMagico += bonusMagico;
		defensaMagica += bonusMagico;
		movimientoMagico += bonusMagico;
	}

	public String mostrarReliquias() {
		String listaReliquias = "";
		for (Reliquia rel : reliquias.values()) {
			listaReliquias += rel.toString() + "\n";
		}
		return listaReliquias;
	}

	public String infoCheems() {
		String info = "soldado: " + nombre +
				"\nataque magico: " + ataqueMagico +
				"\ndefensa magica: " + defensaMagica +
				"\nmovimiento magico: " + movimientoMagico +
				"\n" + mostrarReliquias();

		return info;
	}

	public double getAtaqueMagico() {
		return this.ataqueMagico;
	}

	public double getDefensaMagica() {
		return this.defensaMagica;
	}

	public double getMovimientoMagico() {
		return this.movimientoMagico;
	}
}