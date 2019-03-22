package logic;

import java.util.Date;

public class Partido {

	private Equipo Visitante;
	private Equipo Local;
	private String Estadio;
	private int CarrVis, CarrLoc;
	private int ErrorVis, ErrorLoc;
	private int HitsVis, HitsLoc;
	private Date Fecha;
	
	public Partido(Equipo visitante, Equipo local, String estadio, int carrVis, int carrLoc, int errorVis, int errorLoc,
			int hitsVis, int hitsLoc, Date fecha) {
		super();
		Visitante = visitante;
		Local = local;
		Estadio = estadio;
		CarrVis = carrVis;
		CarrLoc = carrLoc;
		ErrorVis = errorVis;
		ErrorLoc = errorLoc;
		HitsVis = hitsVis;
		HitsLoc = hitsLoc;
		Fecha = fecha;
	}

	public Equipo getVisitante() {
		return Visitante;
	}

	public void setVisitante(Equipo visitante) {
		Visitante = visitante;
	}

	public Equipo getLocal() {
		return Local;
	}

	public void setLocal(Equipo local) {
		Local = local;
	}

	public String getEstadio() {
		return Estadio;
	}

	public void setEstadio(String estadio) {
		Estadio = estadio;
	}

	public int getCarrVis() {
		return CarrVis;
	}

	public void setCarrVis(int carrVis) {
		CarrVis = carrVis;
	}

	public int getCarrLoc() {
		return CarrLoc;
	}

	public void setCarrLoc(int carrLoc) {
		CarrLoc = carrLoc;
	}

	public int getErrorVis() {
		return ErrorVis;
	}

	public void setErrorVis(int errorVis) {
		ErrorVis = errorVis;
	}

	public int getErrorLoc() {
		return ErrorLoc;
	}

	public void setErrorLoc(int errorLoc) {
		ErrorLoc = errorLoc;
	}

	public int getHitsVis() {
		return HitsVis;
	}

	public void setHitsVis(int hitsVis) {
		HitsVis = hitsVis;
	}

	public int getHitsLoc() {
		return HitsLoc;
	}

	public void setHitsLoc(int hitsLoc) {
		HitsLoc = hitsLoc;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	
	
}
