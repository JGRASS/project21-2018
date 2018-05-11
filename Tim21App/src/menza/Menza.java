package menza;

import java.util.LinkedList;

import menza.klase.Menzas;
import menza.klase.Zaliha;
import menza.sistemskeoperacije.SODodajMenzasa;
/**
 * Klasa koja predstavlja studentsku menzu
 * @author Stefan Lukic
 * @version 1.0.
 *
 */

public class Menza {
	private static LinkedList<Menzas> menzasi;
	private static LinkedList<Zaliha> zalihe;
	
	public Menza() {
		menzasi = new LinkedList<Menzas>();
		zalihe = new LinkedList<Zaliha>();
	}
	
	/**
	 * Metoda koja dodaje novog menzasa koristeci SODodajMenzasa
	 * @param m - menzas koji se dodaje
	 */
	public static void dodajMenzasa(Menzas m) {
		SODodajMenzasa.izvrsi(m, menzasi);
	}

	/**
	 * Metoda koja vraca listu menzasa
	 * @return LinkedList objekata klase Menzas koja predstavlja listu menzasa
	 */
	public LinkedList<Menzas> getMenzasi() {
		return menzasi;
	}

	/**
	 * Metoda koja u postojecu listu menzasa "upisuje" parametarsku listu menzasa
	 * @param LinkedList objekata klase Menzas koja predstavlja listu menzasa
	 */
	public void setMenzasi(LinkedList<Menzas> menzasi) {
		this.menzasi = menzasi;
	}

	/**
	 * Metoda koja vraca listu zaliha menze
	 * @return LinkedList objekata klase Zaliha 
	 */
	public LinkedList<Zaliha> getZalihe() {
		return zalihe;
	}

	/**
	 * Metoda koja u postojecu listu zaliha "upisuje" parametarsku listu zaliha
	 * @param LinkedList objekata klase Zaliha koja predstavlja listu zaliha
	 */
	public void setZalihe(LinkedList<Zaliha> zalihe) {
		this.zalihe = zalihe;
	}

}
