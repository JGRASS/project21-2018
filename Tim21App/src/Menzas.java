import java.util.LinkedList;

public class Menzas extends Student {
	private int brojDorucaka;
	private int brojRuckova;
	private int brojVecera;
	private int racun;
	private LinkedList<Obrok> obroci;

	public int getBrojDorucaka() {
		return brojDorucaka;
	}

	public void setBrojDorucaka(int brojDorucaka) {
		this.brojDorucaka = brojDorucaka;
	}

	public int getBrojRuckova() {
		return brojRuckova;
	}

	public void setBrojRuckova(int brojRuckova) {
		this.brojRuckova = brojRuckova;
	}

	public int getBrojVecera() {
		return brojVecera;
	}

	public void setBrojVecera(int brojVecera) {
		this.brojVecera = brojVecera;
	}

	public int getRacun() {
		return racun;
	}

	public void setRacun(int racun) {
		this.racun = racun;
	}

	public LinkedList<Obrok> getObroci() {
		return obroci;
	}

	public void setObroci(LinkedList<Obrok> obroci) {
		this.obroci = obroci;
	}

}
