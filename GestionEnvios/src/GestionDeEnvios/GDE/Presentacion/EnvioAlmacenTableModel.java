package GestionDeEnvios.GDE.Presentacion;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import GestionDeEnvios.GDE.Negocio.TransferEnvioAlmacen;
import GestionDeEnvios.GDE.Negocio.TransferEnvioLaboratorio;

public class EnvioAlmacenTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] _colNames = {"ID", "Producto","Origen","Destino", "Compuesto","Estado" };
	private List<TransferEnvioAlmacen> EnvioAlm;
	public EnvioAlmacenTableModel(ControladorEnvio _ctrl) {
		EnvioAlm=null;
		//_ctrl.addObserver(this);
	}
	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}
	@Override
	public String getColumnName(int col) {
		// TODO Auto-generated method stub
		return _colNames[col];
	}
	@Override
	public int getColumnCount() {
		return _colNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return EnvioAlm == null ? 0 : EnvioAlm.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
