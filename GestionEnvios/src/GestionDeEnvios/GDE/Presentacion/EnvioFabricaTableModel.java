package GestionDeEnvios.GDE.Presentacion;

import java.io.FileNotFoundException;
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
	private String[] _colNames = {"ID", "Producto","Origen","Destino", "Compuesto","Estado" };

	DaoEnvios dao = new DaoEnvios();
	TransferEnvioFabrica pedido = new TransferEnvioFabrica();
	List<TransferEnvioFabrica> lista = new ArrayList<TransferEnvioFabrica>();
	
	public EnvioFabricaTableModel(ControladorEnvio _ctrl) {
		
		try {
			lista = dao.addPedidoFabrica(pedido);
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
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
		case 0: return lista.get(rowIndex).getID_Envio();
		case 1: return lista.get(rowIndex).getProducto();
		case 2:	return lista.get(rowIndex).getOrigen();
		case 3:	return lista.get(rowIndex).getDestinatario();
		case 4: return lista.get(rowIndex).getCompuesto();
		case 5: return lista.get(rowIndex).getSe();
		default: return false;
		}		
	}
	


}
