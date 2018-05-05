package menza.klase;
import java.util.GregorianCalendar;

public class PojedenObrok {
	private GregorianCalendar datum;
	private String obrok; // dorucak rucak ili vecera, da znate kad dokumentujete posle itd.

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
