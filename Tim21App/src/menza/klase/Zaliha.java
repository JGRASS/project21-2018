package menza.klase;
import java.util.GregorianCalendar;

/**
 * Klasa koja predstavlja zalihe menze
 * Sadrzi atribute nazivProizvoda koji je tipa String, atribut kolicina tipa int i datumUlaza koji je tipa GregorianCalendar
 * @author team21
 * @version 1.0.
 *
 */
public class Zaliha {
	private String nazivProizvoda;
	private int kolicina;
	private GregorianCalendar datumUlaza;

	public Zaliha(String nazivProizvoda, int kolicina, GregorianCalendar datum) {
		super();
		this.nazivProizvoda = nazivProizvoda;
		this.kolicina = kolicina;
		this.setDatumUlaza(datum);
	}

	public String getNazivProizvoda() {
		return nazivProizvoda;
	}

	public void setNazivProizvoda(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}

	public GregorianCalendar getDatumUlaza() {
		return datumUlaza;
	}

	public void setDatumUlaza(GregorianCalendar datumUlaza) {
		this.datumUlaza = datumUlaza;
	}

}
