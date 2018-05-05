package menza.klase;
import java.util.GregorianCalendar;

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
