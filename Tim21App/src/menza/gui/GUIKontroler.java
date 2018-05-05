package menza.gui;

import java.awt.EventQueue;

import menza.Menza;
import menza.gui.prozori.GlavniProzor;

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

	
}
