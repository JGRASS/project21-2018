package menza.gui;

import java.awt.EventQueue;
import java.util.GregorianCalendar;

import menza.Menza;
import menza.gui.prozori.AdministracijaMenzasa;
import menza.gui.prozori.AdministracijaMenze;
import menza.gui.prozori.DodajMenzasa;
import menza.gui.prozori.GlavniProzor;
import menza.gui.prozori.Pogon;
import menza.klase.Menzas;
import menza.models.TableModel;

public class GUIKontroler {
	public static Menza sistem = new Menza("Tim21Menza");
	public static GlavniProzor gp;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gp = new GlavniProzor();
					gp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void prikaziPogonGUI() {
		Pogon pogon = new Pogon(new GregorianCalendar());
		pogon.setVisible(true);
		pogon.setAlwaysOnTop(true);
		pogon.setLocationRelativeTo(gp);
	}
	
	public static void prikaziAdministracijaMenzeGUI() {
		AdministracijaMenze ame = new AdministracijaMenze();
		ame.setVisible(true);
		ame.setLocationRelativeTo(gp);
	}
	
	public static void prikaziAdministracijaMenzasaGUI() {
		AdministracijaMenzasa ame = new AdministracijaMenzasa();
		ame.setVisible(true);
		ame.setLocationRelativeTo(gp);
	}
	
	public static void prikaziDodajMenzasaGUI() {
		DodajMenzasa prozor = new DodajMenzasa();
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(gp);
	}
	
	public static void prikaziSveMenzase() {
		TableModel model = (TableModel)(AdministracijaMenzasa.table.getModel());
		model.staviSveMenzaseUModel(gp.sistem.getMenzasi());
	}
	
	public static void unesiMenzasa(String ime, String prezime, String fakultet) {
		Menzas m = new Menzas();
		m.setIme(ime);
		m.setPrezime(prezime);
		m.setFakultet(fakultet);
		
		gp.sistem.getMenzasi().add(m);
		
		prikaziSveMenzase();
	}
}
