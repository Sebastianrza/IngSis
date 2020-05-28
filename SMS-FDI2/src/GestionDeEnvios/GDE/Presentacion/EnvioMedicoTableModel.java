package GestionDeEnvios.GDE.Presentacion;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvioMedico;

public class EnvioMedicoTableModel extends AbstractTableModel  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] _colNames = {"ID","Origen","Destino","Descripcion", "Compuesto","Cantidad","Estado" };
	private DaoEnvios dao = new DaoEnvios();

	private List<TransferEnvioMedico> EnvioMe = new ArrayList<TransferEnvioMedico>();
	public EnvioMedicoTableModel(ControladorEnvio _ctrl) {
	
		EnvioMe = dao.BuscarEnviosMedico();
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
		return EnvioMe == null ? 0 : EnvioMe.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0: return EnvioMe.get(rowIndex).getID_Envio()+"";
		case 1: return EnvioMe.get(rowIndex).getOrigen()+"";
		case 2:	return EnvioMe.get(rowIndex).getDestinatario()+"";
		case 3:	return EnvioMe.get(rowIndex).getDescripcion()+"";
		case 4: return EnvioMe.get(rowIndex).getCompuesto()+"";
		case 5: return EnvioMe.get(rowIndex).getCantidad()+"";
		case 6: return EnvioMe.get(rowIndex).getSe()+"";
		default: return false;
		}		
	}

}
