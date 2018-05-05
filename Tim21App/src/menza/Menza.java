package menza;

import java.util.LinkedList;

import menza.klase.Menzas;
import menza.klase.Zaliha;

public class Menza {
	private String naziv;
	private LinkedList<Menzas> menzasi;
	private LinkedList<Zaliha> zalihe;
	
	public Menza(String naziv) {
		this.naziv = naziv;
		menzasi = new LinkedList<Menzas>();
		zalihe = new LinkedList<Zaliha>();
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public LinkedList<Menzas> getMenzasi() {
		return menzasi;
	}

	public void setMenzasi(LinkedList<Menzas> menzasi) {
		this.menzasi = menzasi;
	}

	public LinkedList<Zaliha> getZalihe() {
		return zalihe;
	}

	public void setZalihe(LinkedList<Zaliha> zalihe) {
		this.zalihe = zalihe;
	}

}
