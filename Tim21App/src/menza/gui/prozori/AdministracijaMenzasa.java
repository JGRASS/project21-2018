package menza.gui.prozori;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menza.gui.GUIKontroler;
import menza.models.TableModel;

import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministracijaMenzasa extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JButton btnDodaj;
	private JButton btnObrisi;
	public static JTable table;

	/**
	 * Create the frame.
	 */
	public AdministracijaMenzasa() {
		setTitle("Administracija menzasa");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 645, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.EAST);
		contentPane.add(getTable(), BorderLayout.CENTER);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(100, 10));
			panel.add(getBtnDodaj());
			panel.add(getBtnObrisi());
		}
		return panel;
	}

	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIKontroler.prikaziDodajMenzasaGUI();
				}
			});
		}
		return btnDodaj;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
		}
		return btnObrisi;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new TableModel());
		}
		return table;
	}
}
