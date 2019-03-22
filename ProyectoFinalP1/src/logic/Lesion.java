package logic;

import java.util.Date;

public class Lesion {

	private String TipoLesion;
	private Date FechaLesion;
	private int DiasRec;
	
	public Lesion(String tipoLesion, Date fechaLesion, int diasRec) {
		super();
		TipoLesion = tipoLesion;
		FechaLesion = fechaLesion;
		DiasRec = diasRec;
	}

	public String getTipoLesion() {
		return TipoLesion;
	}

	public void setTipoLesion(String tipoLesion) {
		TipoLesion = tipoLesion;
	}

	public Date getFechaLesion() {
		return FechaLesion;
	}

	public void setFechaLesion(Date fechaLesion) {
		FechaLesion = fechaLesion;
	}

	public int getDiasRec() {
		return DiasRec;
	}

	public void setDiasRec(int diasRec) {
		DiasRec = diasRec;
	}
	
	
}
