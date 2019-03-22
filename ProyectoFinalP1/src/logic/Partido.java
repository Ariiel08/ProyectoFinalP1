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
	
	
}
