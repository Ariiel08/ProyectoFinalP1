package logic;

import java.util.ArrayList;
import java.util.Date;

public class Pitcher extends Jugador {
	
	private EstadPitcher estad;

	public Pitcher(String nombre, Date fechaNacimiento, String lanzamiento, String bateo, String paisOrigen,
			String posicion, ArrayList<Lesion> lesiones) {
		
		super(nombre, fechaNacimiento, lanzamiento, bateo, paisOrigen, posicion, lesiones);
		
	}

	public EstadPitcher getEstad() {
		return estad;
	}

	public void setEstad(EstadPitcher estad) {
		this.estad = estad;
	}

	public void InsertarLesion(Lesion aux) {
		MisLesiones.add(aux);
	}
	
}