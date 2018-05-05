package menza.models;

import java.util.LinkedList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import menza.klase.Menzas;

public class TableModel extends AbstractTableModel {

	private final String[] kolone = new String[] { "Br. kartice", "Ime", "Prezime", "Dorucak", "Rucak", "Vecera" };
	private List<Menzas> menzasi = new LinkedList<Menzas>();

	public TableModel() {
	}
	
	@Override
	public int getColumnCount() {
		return kolone.length;
	}

	@Override
	public int getRowCount() {
		return menzasi.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Menzas m = menzasi.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return m.getBrojKartice();
		case 1:
			return m.getIme();
		case 2:
			return m.getPrezime();
		case 3:
			return m.getBrojDorucaka();
		case 4:
			return m.getBrojRuckova();
		case 5:
			return m.getBrojVecera();
		default:
			return "NN";
		}
	}

	@Override
	public String getColumnName(int column) {
		return kolone[column];
	}

	public void staviSveMenzaseUModel(List<Menzas> menzasi) {
		this.menzasi = menzasi;
		fireTableDataChanged();
	}

	public Menzas vratiValutu(int index) {
		return menzasi.get(index);
	}

}
