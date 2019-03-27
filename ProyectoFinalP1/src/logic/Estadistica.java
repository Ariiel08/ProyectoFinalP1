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

	public int getAB() {
		return AB;
	}

	public void setAB(int aB) {
		AB = aB;
	}

	public int getD() {
		return D;
	}

	public void setD(int d) {
		D = d;
	}

	public int getH() {
		return H;
	}

	public void setH(int h) {
		H = h;
	}

	public int getDobles() {
		return Dobles;
	}

	public void setDobles(int dobles) {
		Dobles = dobles;
	}

	public int getTriples() {
		return Triples;
	}

	public void setTriples(int triples) {
		Triples = triples;
	}

	public int getBB() {
		return BB;
	}

	public void setBB(int bB) {
		BB = bB;
	}

	public int getPonches() {
		return Ponches;
	}

	public void setPonches(int ponches) {
		Ponches = ponches;
	}

	public int getErrores() {
		return Errores;
	}

	public void setErrores(int errores) {
		Errores = errores;
	}

	public int getPuestosOut() {
		return PuestosOut;
	}

	public void setPuestosOut(int puestosOut) {
		PuestosOut = puestosOut;
	}

	public int getDobleMatanzas() {
		return DobleMatanzas;
	}

	public void setDobleMatanzas(int dobleMatanzas) {
		DobleMatanzas = dobleMatanzas;
	}

	public int getJuegosJug() {
		return JuegosJug;
	}

	public void setJuegosJug(int juegosJug) {
		JuegosJug = juegosJug;
	}

	public float getAVG() {
		return AVG;
	}

	public void setAVG(float aVG) {
		AVG = aVG;
	}
	
	public void AVG() {
		float aux = 0;
		aux = H /AB;
		setAVG(aux);
	}
	
}

