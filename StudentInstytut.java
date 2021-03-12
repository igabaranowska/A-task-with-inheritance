package lab8;

public class StudentInstytut extends StudentUZ{
	
	private String instytut;
	
	public StudentInstytut(String imie, String nazwisko, int nrIndeksu, String wydzial, String instytut) {
		super(imie, nazwisko, nrIndeksu, wydzial);
		this.instytut = instytut;
		}
	
	public String getInstytut() {
		return this.instytut;
	}

	public void Ustaw_Instytut(String instytut) {
		this.instytut = instytut;
	}
	
	
}
