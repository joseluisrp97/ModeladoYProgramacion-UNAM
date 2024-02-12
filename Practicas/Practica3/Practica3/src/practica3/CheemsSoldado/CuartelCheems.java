package practica3.CheemsSoldado;

public class CuartelCheems{
	
	public CheemsSoldado desplegarCheems(){
		CheemsSoldado cheems = new CheemsSoldado("Cheems", 1);

		Reliquia gungnir = new Arma(1, "Gungnir", 5.1, "Nordico");
		Reliquia mjolnir = new Arma(2, "Mjolnir", 3.4, "Nordico");
		Reliquia hermes = new Vestimenta(3, "Sandalias de Hermes", 2.2, "Griego");
		Reliquia botas = new Vestimenta(4, "Botas de 7 leguas", 1.9, "Europeo");
		Reliquia hades = new Armadura(5, "Casco de Hades", 3.5, "Griego");
		Reliquia aegis = new Armadura(6, "Escudo Aegis", 2.8, "Griego");

		cheems.agregarReliquia(gungnir);
		cheems.agregarReliquia(mjolnir);
		cheems.agregarReliquia(hermes);
		cheems.agregarReliquia(botas);
		cheems.agregarReliquia(hades);
		cheems.agregarReliquia(aegis);

		//Para probar su creacion
		//System.out.println(cheems.infoCheems());

		return cheems;


	}

	public static void main(String[] args){
		CuartelCheems cuartel = new CuartelCheems();
		CheemsSoldado cheemsMitico = cuartel.desplegarCheems();
		cheemsMitico.activarReliquias();
		System.out.println(cheemsMitico.infoCheems());
	}
}