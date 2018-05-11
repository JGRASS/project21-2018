package menza.klase;

/**
 * Klasa koja predstavlja jednog studenta
 * Sadrzi atribute ime, prezime, datumRodjenja, fakultet koji su tipa String
 * i atribut brojKartice tipa long
 * @author team21
 * @version 1.0.
 *
 */
public abstract class Student {
	private String ime;
	private String prezime;
	private String datumRodjenja;
	private String fakultet;
	private long brojKartice;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}

	public long getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(long brojKartice) {
		this.brojKartice = brojKartice;
	}

}
