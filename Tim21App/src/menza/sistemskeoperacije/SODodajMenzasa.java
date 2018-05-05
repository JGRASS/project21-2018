package menza.sistemskeoperacije;

import java.util.LinkedList;

import menza.klase.Menzas;

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
