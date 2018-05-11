package menza.klase;
import java.util.GregorianCalendar;

/**
 * Klasa koja predstavlja jedan pojeden obrok (dorucak, rucak ili vecera)
 * Sadrzi atribute datum tipa GregorianCalendar i obrok tipa String
 * @author team21
 * @version 1.0.
 *
 */
public class PojedenObrok {
	private GregorianCalendar datum;
	private String obrok;

	public PojedenObrok(GregorianCalendar datum, String obrok) {
		super();
		this.datum = datum;
		this.obrok = obrok;
	}

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}

	public String getObrok() {
		return obrok;
	}

	public void setObrok(String obrok) {
		this.obrok = obrok;
	}

}
