package GestionDeEnvios.GDE.Presentacion;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvioFabrica;



public class EnvioFabricaTableModel extends AbstractTableModel /*implements ObserverEnvioFabrica */{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] _colNames = {"ID","Origen","Destino","Descripcion", "Compuesto","Cantidad","Estado" };

	DaoEnvios dao = new DaoEnvios();
	TransferEnvioFabrica pedido = new TransferEnvioFabrica();
	List<TransferEnvioFabrica> lista = new ArrayList<TransferEnvioFabrica>();

	
	public EnvioFabricaTableModel(ControladorEnvio _ctrl) {
		
		lista = dao.BuscarEnviosFabrica();
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
		return lista.size();
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
