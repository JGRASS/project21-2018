package menza.gui.prozori;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class Pogon extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnRucak;
	private JButton btnVecera;
	private JButton btnDorucak;
	private JPanel panel_1;
	private JButton btnUcitajStudenta;
	private JPanel panel_2;
	private JLabel lblImeIPrezime;
	private JLabel lblFakultet;
	private JLabel lblDatumRodjenja;
	private JLabel lblBrojKartice;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JTextArea textArea_3;
	private JTextArea txtrStanjeDorucaka;
	private JTextArea txtrStanjeRuckova;
	private JTextArea txtrStanjeVecera;
	private GregorianCalendar vreme;
	/**
	 * Create the frame.
	 */
	public Pogon(GregorianCalendar v) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 758, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.SOUTH);
		contentPane.add(getPanel_1(), BorderLayout.EAST);
		contentPane.add(getPanel_2(), BorderLayout.CENTER);
		vreme = v;
		int sat = v.get(GregorianCalendar.HOUR_OF_DAY);
		
		if( sat >= 7 && sat <= 9 ) {
			btnDorucak.setEnabled(true);
			btnRucak.setEnabled(false);
			btnVecera.setEnabled(false);
		} else if (sat >= 11 && sat <= 15 ) {
			btnDorucak.setEnabled(false);
			btnRucak.setEnabled(true);
			btnVecera.setEnabled(false); 
		} else {
			btnDorucak.setEnabled(false);
			btnRucak.setEnabled(false);
			btnVecera.setEnabled(true);
		}
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(10, 150));
			panel.setLayout(new GridLayout(3, 3, 10, 10));
			panel.add(getLabel_1());
			panel.add(getLabel_3());
			panel.add(getLabel_2());
			panel.add(getTxtrStanjeDorucaka());
			panel.add(getTxtrStanjeRuckova());
			panel.add(getTxtrStanjeVecera());
			panel.add(getBtnDorucak());
			panel.add(getBtnRucak());
			panel.add(getBtnVecera());
		}
		return panel;
	}
	private JButton getBtnRucak() {
		if (btnRucak == null) {
			btnRucak = new JButton("Rucak");
		}
		return btnRucak;
	}
	private JButton getBtnVecera() {
		if (btnVecera == null) {
			btnVecera = new JButton("Vecera");
		}
		return btnVecera;
	}
	private JButton getBtnDorucak() {
		if (btnDorucak == null) {
			btnDorucak = new JButton("Dorucak");
		}
		return btnDorucak;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(100, 10));
			panel_1.setLayout(new GridLayout(0, 1, 20, 20));
			panel_1.add(getBtnUcitajStudenta());
		}
		return panel_1;
	}
	private JButton getBtnUcitajStudenta() {
		if (btnUcitajStudenta == null) {
			btnUcitajStudenta = new JButton("Ucitaj");
			btnUcitajStudenta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
		}
		return btnUcitajStudenta;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.add(getLblImeIPrezime());
			panel_2.add(getLblFakultet());
			panel_2.add(getLblDatumRodjenja());
			panel_2.add(getLblBrojKartice());
			panel_2.add(getTextArea());
			panel_2.add(getTextArea_1());
			panel_2.add(getTextArea_2());
			panel_2.add(getTextArea_3());
		}
		return panel_2;
	}
	private JLabel getLblImeIPrezime() {
		if (lblImeIPrezime == null) {
			lblImeIPrezime = new JLabel("Ime i prezime:");
			lblImeIPrezime.setBounds(12, 40, 96, 22);
		}
		return lblImeIPrezime;
	}
	private JLabel getLblFakultet() {
		if (lblFakultet == null) {
			lblFakultet = new JLabel("Fakultet:");
			lblFakultet.setBounds(12, 133, 96, 22);
		}
		return lblFakultet;
	}
	private JLabel getLblDatumRodjenja() {
		if (lblDatumRodjenja == null) {
			lblDatumRodjenja = new JLabel("Datum rodjenja:");
			lblDatumRodjenja.setBounds(347, 133, 96, 22);
		}
		return lblDatumRodjenja;
	}
	private JLabel getLblBrojKartice() {
		if (lblBrojKartice == null) {
			lblBrojKartice = new JLabel("Broj kartice");
			lblBrojKartice.setBounds(347, 40, 96, 22);
		}
		return lblBrojKartice;
	}
	private JLabel getLabel_1() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Stanje dorucaka");
		}
		return lblNewLabel;
	}
	private JLabel getLabel_2() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Stanje vecera");
		}
		return lblNewLabel_1;
	}
	private JLabel getLabel_3() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Stanje ruckova");
		}
		return lblNewLabel_2;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
			textArea.setBackground(SystemColor.control);
			textArea.setBounds(106, 40, 205, 22);
		}
		return textArea;
	}
	private JTextArea getTextArea_1() {
		if (textArea_1 == null) {
			textArea_1 = new JTextArea();
			textArea_1.setEditable(false);
			textArea_1.setBackground(SystemColor.control);
			textArea_1.setBounds(106, 133, 205, 22);
		}
		return textArea_1;
	}
	private JTextArea getTextArea_2() {
		if (textArea_2 == null) {
			textArea_2 = new JTextArea();
			textArea_2.setEditable(false);
			textArea_2.setBackground(SystemColor.control);
			textArea_2.setBounds(451, 40, 179, 22);
		}
		return textArea_2;
	}
	private JTextArea getTextArea_3() {
		if (textArea_3 == null) {
			textArea_3 = new JTextArea();
			textArea_3.setEditable(false);
			textArea_3.setBackground(SystemColor.control);
			textArea_3.setBounds(451, 133, 179, 22);
		}
		return textArea_3;
	}
	private JTextArea getTxtrStanjeDorucaka() {
		if (txtrStanjeDorucaka == null) {
			txtrStanjeDorucaka = new JTextArea();
			txtrStanjeDorucaka.setEditable(false);
			txtrStanjeDorucaka.setTabSize(6);
			txtrStanjeDorucaka.setBackground(SystemColor.control);
			txtrStanjeDorucaka.setText("Stanje Dorucaka");
		}
		return txtrStanjeDorucaka;
	}
	private JTextArea getTxtrStanjeRuckova() {
		if (txtrStanjeRuckova == null) {
			txtrStanjeRuckova = new JTextArea();
			txtrStanjeRuckova.setEditable(false);
			txtrStanjeRuckova.setTabSize(6);
			txtrStanjeRuckova.setBackground(SystemColor.control);
			txtrStanjeRuckova.setText("Stanje Ruckova");
		}
		return txtrStanjeRuckova;
	}
	private JTextArea getTxtrStanjeVecera() {
		if (txtrStanjeVecera == null) {
			txtrStanjeVecera = new JTextArea();
			txtrStanjeVecera.setEditable(false);
			txtrStanjeVecera.setTabSize(6);
			txtrStanjeVecera.setBackground(SystemColor.control);
			txtrStanjeVecera.setText("Stanje Vecera");
		}
		return txtrStanjeVecera;
	}
}
