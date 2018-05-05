package menza.gui;

import java.awt.EventQueue;
import java.util.GregorianCalendar;

import javax.swing.JFrame;

import menza.Menza;
import menza.gui.prozori.AdministracijaMenzasa;
import menza.gui.prozori.AdministracijaMenze;
import menza.gui.prozori.DodajMenzasa;
import menza.gui.prozori.GlavniProzor;
import menza.gui.prozori.Pogon;
import menza.gui.prozori.UcitavanjeMenzasa;
import menza.klase.Menzas;
import menza.models.TableModel;

public class GUIKontroler {
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
	
	public static void prikaziUcitavanjeMenzasaGUI() {
		UcitavanjeMenzasa prozor = new UcitavanjeMenzasa();
		prozor.setVisible(true);
		prozor.setLocationRelativeTo(gp);		
	}
	
	public static void prikaziSveMenzaseAdministracija() {
		TableModel model = (TableModel)(AdministracijaMenzasa.table.getModel());
		model.staviSveMenzaseUModel(gp.sistem.getMenzasi());
	}
	
	public static void prikaziSveMenzaseUcitavanje() {
		TableModel model = (TableModel)(UcitavanjeMenzasa.table.getModel());
		model.staviSveMenzaseUModel(gp.sistem.getMenzasi());
	}
	
	public static void unesiMenzasa(String ime, String prezime, String fakultet) {
		Menzas m = new Menzas();
		m.setIme(ime);
		m.setPrezime(prezime);
		m.setFakultet(fakultet);
		
		gp.sistem.getMenzasi().add(m);
		
		prikaziSveMenzaseAdministracija();
	}
	
	
	
	public static void ucitajMenzasa(long brojKartice) {
		for (int i = 0; i < gp.sistem.getMenzasi().size(); i++) {
			long m = gp.sistem.getMenzasi().get(i).getBrojDorucaka();
			if(m == brojKartice) {
				Pogon.postaviMenzasaUPogon( gp.sistem.getMenzasi().get(i) );
			}
		}
	}
}
