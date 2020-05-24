package GestionDeEnvios.GDE.Presentacion;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvioAlmacen;
import GestionDeEnvios.GDE.Negocio.TransferEnvioMedico;

public class EnvioAlmacenTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] _colNames = {"ID", "Producto","Origen","Destino", "Compuesto","Estado" };
	private DaoEnvios dao = new DaoEnvios();
	private TransferEnvioAlmacen pedido = new TransferEnvioAlmacen();
	private List<TransferEnvioAlmacen> EnvioAlm = new ArrayList<>();
	public EnvioAlmacenTableModel(ControladorEnvio _ctrl) {
		
		try {
			EnvioAlm = dao.addPedidoAlmacen(pedido);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		return EnvioAlm == null ? 0 : EnvioAlm.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0: return EnvioAlm.get(rowIndex).getID_Envio();
		case 1: return EnvioAlm.get(rowIndex).getProducto();
		case 2:	return EnvioAlm.get(rowIndex).getOrigen();
		case 3:	return EnvioAlm.get(rowIndex).getDestinatario();
		case 4: return EnvioAlm.get(rowIndex).getCompuesto();
		case 5: return EnvioAlm.get(rowIndex).getSe();
		default: return false;
		}		
		
	}

}
