package logic;

import java.util.ArrayList;

public class Administracion {
	
	private ArrayList<Equipo> MisEquipos;
	private ArrayList<Partido> MisPartidos;
	private static Administracion MiAdmin = null;
	
	private Administracion() {
		super();
		MisPartidos = new ArrayList<>();
		MisEquipos = new ArrayList<>();
	}
	
	public static Administracion getInstancia() {
		if(MiAdmin == null) {
			MiAdmin = new Administracion();
		}
		return MiAdmin;
	}

	public ArrayList<Equipo> getMisEquipos() {
		return MisEquipos;
	}

	public void setMisEquipos(ArrayList<Equipo> misEquipos) {
		MisEquipos = misEquipos;
	}

	public ArrayList<Partido> getMisPartidos() {
		return MisPartidos;
	}

	public void setMisPartidos(ArrayList<Partido> misPartidos) {
		MisPartidos = misPartidos;
	}
	
	public void insertarEquipo(Equipo aux) {
		MisEquipos.add(aux);
	}
	
	public void insertarPartido(Partido aux) {
		MisPartidos.add(aux);
	}
}
