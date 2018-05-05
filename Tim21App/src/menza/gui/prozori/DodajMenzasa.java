package menza.gui.prozori;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menza.gui.GUIKontroler;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajMenzasa extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtIme;
	private JLabel lblPrezime;
	private JTextField txtPrezime;
	private JLabel lblFakultet;
	private JTextField txtFakultet;
	private JButton btnOdustani;
	private JButton btnPotvrdi;

	/**
	 * Create the frame.
	 */
	public DodajMenzasa() {
		setTitle("Dodaj menzasa");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 438, 256);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 2, 10, 10));
		contentPane.add(getLblNewLabel());
		contentPane.add(getTxtIme());
		contentPane.add(getLblPrezime());
		contentPane.add(getTxtPrezime());
		contentPane.add(getLblFakultet());
		contentPane.add(getTxtFakultet());
		contentPane.add(getBtnOdustani());
		contentPane.add(getBtnPotvrdi());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Ime");
		}
		return lblNewLabel;
	}

	private JTextField getTxtIme() {
		if (txtIme == null) {
			txtIme = new JTextField();
			txtIme.setColumns(10);
		}
		return txtIme;
	}

	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime");
		}
		return lblPrezime;
	}

	private JTextField getTxtPrezime() {
		if (txtPrezime == null) {
			txtPrezime = new JTextField();
			txtPrezime.setColumns(10);
		}
		return txtPrezime;
	}

	private JLabel getLblFakultet() {
		if (lblFakultet == null) {
			lblFakultet = new JLabel("Fakultet");
		}
		return lblFakultet;
	}

	private JTextField getTxtFakultet() {
		if (txtFakultet == null) {
			txtFakultet = new JTextField();
			txtFakultet.setColumns(10);
		}
		return txtFakultet;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
		return btnOdustani;
	}

	private JButton getBtnPotvrdi() {
		if (btnPotvrdi == null) {
			btnPotvrdi = new JButton("Potvrdi");
			btnPotvrdi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.unesiMenzasa(txtIme.getText(), txtPrezime.getText(), txtFakultet.getText());
					dispose();
				}
			});
		}
		return btnPotvrdi;
	}
}
