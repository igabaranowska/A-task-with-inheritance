package lab8;

public class Student {
	
	private String imie;
	private String nazwisko;
	int nrIndeksu;
	
	
	public Student(String imie, String nazwisko, int nrIndeksu) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nrIndeksu = nrIndeksu;
	}
	
	
	public String getImie() {
		return this.imie;
	}
	
	public String getNazwisko() {
		return this.nazwisko;
	}
	
	public int getNrIndeksu() {
		return this.nrIndeksu;
	}
	
	public void Ustaw_Imie(String nowe_imie) {
		this.imie = nowe_imie;
	}
	
	public void Ustaw_Nazwisko(String nowe_nazwisko) {
		this.nazwisko = nowe_nazwisko;
	}
	
	public void Ustaw_Indeks(int indeks) {
		this.nrIndeksu = indeks;
	}
	
	public String toString() {
		return "Imie: " + this.imie + "Nazwisko: " + this.nazwisko + "Numer indeksu: " + this.nrIndeksu;
	}


}



