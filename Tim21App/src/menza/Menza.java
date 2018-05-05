package menza;

import java.util.LinkedList;

import menza.klase.Menzas;
import menza.klase.Zaliha;
import menza.sistemskeoperacije.SODodajMenzasa;

public class Menza {
	private static LinkedList<Menzas> menzasi;
	private static LinkedList<Zaliha> zalihe;
	
	public Menza() {
		menzasi = new LinkedList<Menzas>();
		zalihe = new LinkedList<Zaliha>();
	}
	
	public static void dodajMenzasa(Menzas m) {
		SODodajMenzasa.izvrsi(m, menzasi);
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
