package logic;

public class Estadistica {
	
	private int AB,D,H,Dobles,Triples,BB,Ponches,Errores,PuestosOut,DobleMatanzas,JuegosJug;
	private float AVG;
	
	public Estadistica(int aB, int d, int h, int dobles, int triples, int bB, int ponches, int errores, int puestosOut,
			int dobleMatanzas, int juegosJug, float aVG) {
		super();
		AB = aB;
		D = d;
		H = h;
		Dobles = dobles;
		Triples = triples;
		BB = bB;
		Ponches = ponches;
		Errores = errores;
		PuestosOut = puestosOut;
		DobleMatanzas = dobleMatanzas;
		JuegosJug = juegosJug;
		AVG = aVG;
	}
	
	
}
