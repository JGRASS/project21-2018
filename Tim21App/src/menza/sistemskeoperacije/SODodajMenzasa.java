package menza.sistemskeoperacije;

import java.util.LinkedList;

import menza.klase.Menzas;

/**
 * Klasa koja sadrzi staticku metodu koja predstavlja sistemsku operaciju dodavanja meznasa
 * @author team21
 * @param m objekat klase Menzas, LinkeList menzasi koja predstavlja listu u koju se ubacuje dati menzas
 */
public class SODodajMenzasa {
	public static void izvrsi(Menzas m, LinkedList<Menzas> menzasi) {
		if(m == null) {
			throw new RuntimeException("Menzas ne sme biti null");
		}
		if(menzasi.contains(m)) {
			throw new RuntimeException("Menzas vec postoji");
		}
		
		menzasi.add(m);
	}
}
