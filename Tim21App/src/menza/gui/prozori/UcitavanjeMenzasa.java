package menza.gui.prozori;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menza.gui.GUIKontroler;
import menza.models.TableModel;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UcitavanjeMenzasa extends JFrame {

	private JPanel contentPane;
	public static JTable table;
	private JButton btnUcitaj;


	/**
	 * Create the frame.
	 */
	public UcitavanjeMenzasa() {
		setTitle("Izaberite menzasa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getTable(), BorderLayout.CENTER);
		contentPane.add(getBtnUcitaj(), BorderLayout.EAST);
		GUIKontroler.prikaziSveMenzaseUcitavanje();
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new TableModel());
		}
		return table;
	}
	private JButton getBtnUcitaj() {
		if (btnUcitaj == null) {
			btnUcitaj = new JButton("Ucitaj");
			btnUcitaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					TableModel model = (TableModel)(table.getModel());
					GUIKontroler.ucitajMenzasa( model.vratiMenzasa(table.getSelectedRow()).getBrojKartice() );
					dispose();
				}
			});
		}
		return btnUcitaj;
	}
}
