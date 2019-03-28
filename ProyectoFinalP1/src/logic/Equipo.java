
package logic;

import java.util.ArrayList;

public class Equipo {
	

	private String Nombre;
	private String Provincia;
	private String Estadio;
	private int Campeonatos;
	private int JugGanados;
	private int JugPerdidos;
	private int JugJugados;
	private ArrayList<Jugador> jugadores = new ArrayList<>();
	
	public Equipo(String nombre, String provincia, String estadio, int campeonatos, int jugGanados, int jugPerdidos, int JugJugados) {
		super();
		Nombre = nombre;
		Provincia = provincia;
		Estadio = estadio;
		Campeonatos = campeonatos;
		JugGanados = jugGanados;
		JugPerdidos = jugPerdidos;
		JugJugados = JugJugados;
	}
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	public String getEstadio() {
		return Estadio;
	}
	public void setEstadio(String estadio) {
		Estadio = estadio;
	}
	public int getCampeonatos() {
		return Campeonatos;
	}
	public void setCampeonatos(int campeonatos) {
		Campeonatos = campeonatos;
	}
	public int getJugGanados() {
		return JugGanados;
	}
	public void setJugGanados(int jugGanados) {
		JugGanados = jugGanados;
	}
	public int getJugPerdidos() {
		return JugPerdidos;
	}
	public void setJugPerdidos(int jugPerdidos) {
		JugPerdidos = jugPerdidos;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void InsertarJugador(Jugador aux) {
		jugadores.add(aux);
	}


	public int getJugJugados() {
		return JugJugados;
	}


	public void setJugJugados(int jugJugados) {
		JugJugados = jugJugados;
	}
	
	public void Victoria() {
		JugJugados++;
		JugGanados++;
	}
	
	public void Derrota() {
		JugJugados++;
		JugPerdidos++;
	}
}