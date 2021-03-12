package lab8;

public class StudentUZ extends Student {
	
	private String wydzial;
	
	public StudentUZ(String imie, String nazwisko, int nrIndeksu, String wydzial) {
		super(imie, nazwisko, nrIndeksu);
		this.wydzial = wydzial;
	}
	
	public String getWydzial() {
		return this.wydzial;
	}
	
	public void Ustaw_wydzial(String wydzial) {
		this.wydzial = wydzial;
		
	}

}
