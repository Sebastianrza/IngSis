package GestionDeEnvios.GDE.Presentacion;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import GestionDeEnvios.GDE.Negocio.TransferEnvioFabrica;



public class EnvioFabricaTableModel extends AbstractTableModel /*implements ObserverEnvioFabrica */{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] _colNames = {"ID", "Producto","Origen","Destino", "Compuesto","Estado" };
	private List<TransferEnvioFabrica> EnvioFa;
	public EnvioFabricaTableModel(ControladorEnvio _ctrl) {
		EnvioFa=null;
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
		return EnvioFa == null ? 0 : EnvioFa.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}


}
