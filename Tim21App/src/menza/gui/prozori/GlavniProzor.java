package menza.gui.prozori;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menza.Menza;
import menza.gui.GUIKontroler;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;

public class GlavniProzor extends JFrame {

	private JPanel contentPane;
	private JButton btnAdministracija;
	private JButton btnMenzaUPogon;
	private JButton btnAdministracijaMenzasa;

	public static Menza sistem;
	
	/**
	 * Create the frame.
	 */
	public GlavniProzor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 2, 50, 50));
		contentPane.add(getBtnAdministracija());
		contentPane.add(getBtnAdministracijaMenzasa());
		contentPane.add(getBtnMenzaUPogon());

		sistem = new Menza("Nasa menza");
	}

	private JButton getBtnAdministracija() {
		if (btnAdministracija == null) {
			btnAdministracija = new JButton("Administracija menze");
			btnAdministracija.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.prikaziAdministracijaMenzeGUI();
				}
			});
		}
		return btnAdministracija;
	}

	private JButton getBtnMenzaUPogon() {
		if (btnMenzaUPogon == null) {
			btnMenzaUPogon = new JButton("Menza u pogon!");
			btnMenzaUPogon.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.prikaziPogonGUI();
				}
			});
		}
		return btnMenzaUPogon;
	}

	private JButton getBtnAdministracijaMenzasa() {
		if (btnAdministracijaMenzasa == null) {
			btnAdministracijaMenzasa = new JButton("Administracija menzasa");
			btnAdministracijaMenzasa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.prikaziAdministracijaMenzasaGUI();
				}
			});
		}
		return btnAdministracijaMenzasa;
	}
}
