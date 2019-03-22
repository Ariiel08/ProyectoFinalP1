package logic;

import java.util.ArrayList;
import java.util.Date;

public abstract class Jugador {

	protected String Nombre;
	protected Date FechaNacimiento;
	protected String Lanzamiento;
	protected String Bateo;
	protected String PaisOrigen;
	protected String Posicion;
	protected ArrayList<Lesion> lesiones = new ArrayList<Lesion>();
	
	public Jugador(String nombre, Date fechaNacimiento, String lanzamiento, String bateo, String paisOrigen,
			String posicion, ArrayList<Lesion> lesiones) {
		super();
		Nombre = nombre;
		FechaNacimiento = fechaNacimiento;
		Lanzamiento = lanzamiento;
		Bateo = bateo;
		PaisOrigen = paisOrigen;
		Posicion = posicion;
		this.lesiones = lesiones;
	}
	
	
}
