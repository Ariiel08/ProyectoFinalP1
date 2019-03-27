package logic;

import java.util.ArrayList;
import java.util.Date;

public class JugCampo extends Jugador {
	
	private Estadistica estad;
	
	public JugCampo(String nombre, Date fechaNacimiento, String lanzamiento, String bateo, String paisOrigen,
			String posicion, ArrayList<Lesion> lesiones) {
		
		super(nombre, fechaNacimiento, lanzamiento, bateo, paisOrigen, posicion, lesiones);
		
	}

	public Estadistica getEstad() {
		return estad;
	}

	public void setEstad(Estadistica estad) {
		this.estad = estad;
	}
	
	public void InsertarLesion(Lesion aux) {
		MisLesiones.add(aux);
	}
	
}