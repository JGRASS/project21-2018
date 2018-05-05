package menza.klase;
import java.util.LinkedList;

import menza.gui.prozori.GlavniProzor;

public class Menzas extends Student {
	private int brojDorucaka;
	private int brojRuckova;
	private int brojVecera;
	private int racun;
	private LinkedList<PojedenObrok> obroci;
	
	public Menzas() {
		if(GlavniProzor.sistem.getMenzasi().size() != 0) {
			long g = GlavniProzor.sistem.getMenzasi().getLast().getBrojKartice();
			this.setBrojKartice( g + 1 );
		} else {
			this.setBrojKartice(0);
		}
		this.brojDorucaka = 0;
		this.brojRuckova = 0;
		this.brojVecera = 0;
		this.obroci = new LinkedList<PojedenObrok>();
	}

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

	public LinkedList<PojedenObrok> getObroci() {
		return obroci;
	}

	public void setObroci(LinkedList<PojedenObrok> obroci) {
		this.obroci = obroci;
	}

}
