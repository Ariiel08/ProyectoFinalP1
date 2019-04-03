package logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public abstract class Jugador implements Serializable{

	private static final long serialVersionUID = 1L;
	protected String Nombre;
	protected Date FechaNacimiento;
	protected int Peso;
	protected int Altura;
	protected String Lanzamiento;
	protected String Bateo;
	protected String PaisOrigen;
	protected String Posicion;
	protected String Equipo;
	protected ArrayList<Lesion> MisLesiones;
	protected int Edad;
	
	public Jugador(String nombre, Date fechaNacimiento, int peso, int altura, String lanzamiento, String bateo, String paisOrigen,
			String posicion, String equipo, ArrayList<Lesion> lesiones, int edad) {
		super();
		Nombre = nombre;
		FechaNacimiento = fechaNacimiento;
		Peso = peso;
		Altura = altura;
		Lanzamiento = lanzamiento;
		Bateo = bateo;
		PaisOrigen = paisOrigen;
		Posicion = posicion;
		Equipo = equipo;
		MisLesiones = new ArrayList<>();
		Edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public int getPeso() {
		return Peso;
	}

	public void setPeso(int peso) {
		Peso = peso;
	}

	public int getAltura() {
		return Altura;
	}

	public void setAltura(int altura) {
		Altura = altura;
	}

	public String getLanzamiento() {
		return Lanzamiento;
	}

	public void setLanzamiento(String lanzamiento) {
		Lanzamiento = lanzamiento;
	}

	public String getBateo() {
		return Bateo;
	}

	public void setBateo(String bateo) {
		Bateo = bateo;
	}

	public String getPaisOrigen() {
		return PaisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		PaisOrigen = paisOrigen;
	}

	public String getPosicion() {
		return Posicion;
	}

	public void setPosicion(String posicion) {
		Posicion = posicion;
	}

	public String getEquipo() {
		return Equipo;
	}

	public void setEquipo(String equipo) {
		Equipo = equipo;
	}

	public ArrayList<Lesion> getMisLesiones() {
		return MisLesiones;
	}

	public void setMisLesiones(ArrayList<Lesion> misLesiones) {
		MisLesiones = misLesiones;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}
	
	
}