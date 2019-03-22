package logic;

public class EstadPitcher {
	
	private int JuegosIni;
	private int HitsPitch;
	private int CarrPitch, CarrLimpias;
	private int JonronPitch;
	private int BBPitch;
	private int Ponches;
	private int Vict, Der;
	private float PromCL;
	
	public EstadPitcher(int juegosIni, int hitsPitch, int carrPitch, int carrLimpias, int jonronPitch, int bBPitch,
			int ponches, int vict, int der, float promCL) {
		super();
		JuegosIni = juegosIni;
		HitsPitch = hitsPitch;
		CarrPitch = carrPitch;
		CarrLimpias = carrLimpias;
		JonronPitch = jonronPitch;
		BBPitch = bBPitch;
		Ponches = ponches;
		Vict = vict;
		Der = der;
		PromCL = promCL;
	}
	
	
}
