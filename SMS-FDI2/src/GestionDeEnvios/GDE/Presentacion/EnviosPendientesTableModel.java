package GestionDeEnvios.GDE.Presentacion;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvioPendiente;

public class EnviosPendientesTableModel extends AbstractTableModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] _colNames = {"ID","Origen","Destino","Descripcion", "Compuesto","Cantidad","Estado" };
	private DaoEnvios dao = new DaoEnvios();
	TransferEnvioPendiente pedido = new TransferEnvioPendiente();
	List<TransferEnvioPendiente> lista = new ArrayList<TransferEnvioPendiente>();
	
	public EnviosPendientesTableModel(ControladorEnvio _ctrl) {
		
		lista = dao.BuscarPedidoPendiente();
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
		return lista == null ? 0 : lista.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0: return lista.get(rowIndex).getID_Envio()+"";
		case 1: return lista.get(rowIndex).getOrigen()+"";
		case 2:	return lista.get(rowIndex).getDestinatario()+"";
		case 3:	return lista.get(rowIndex).getDescripcion()+"";
		case 4: return lista.get(rowIndex).getCompuesto()+"";
		case 5: return lista.get(rowIndex).getCantidad()+"";
		case 6: return lista.get(rowIndex).getSe()+"";
		default: return false;
		}		
		
	}

}
