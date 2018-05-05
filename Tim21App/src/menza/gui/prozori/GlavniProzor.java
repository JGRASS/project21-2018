package menza.gui.prozori;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

	/**
	 * Create the frame.
	 */
	public GlavniProzor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 50, 50));
		contentPane.add(getBtnAdministracija());
		contentPane.add(getBtnAdministracijaMenzasa());
		contentPane.add(getBtnMenzaUPogon());
	}
	private JButton getBtnAdministracija() {
		if (btnAdministracija == null) {
			btnAdministracija = new JButton("Administracija menze");
		}
		return btnAdministracija;
	}
	private JButton getBtnMenzaUPogon() {
		if (btnMenzaUPogon == null) {
			btnMenzaUPogon = new JButton("Menza u pogon!");
			btnMenzaUPogon.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Pogon pogon = new Pogon(new GregorianCalendar());
					pogon.setVisible(true);
					pogon.setAlwaysOnTop(true);
				}
			});
		}
		return btnMenzaUPogon;
	}
	private JButton getBtnAdministracijaMenzasa() {
		if (btnAdministracijaMenzasa == null) {
			btnAdministracijaMenzasa = new JButton("Administracija menzasa");
		}
		return btnAdministracijaMenzasa;
	}
}
