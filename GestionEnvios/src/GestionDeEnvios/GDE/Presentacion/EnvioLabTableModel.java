package GestionDeEnvios.GDE.Presentacion;

import java.io.IOException;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvioLaboratorio;
import GestionDeEnvios.GDE.Negocio.TransferEnvioMedico;

public class EnvioLabTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] _colNames = {"ID", "Producto","Origen","Destino", "Compuesto","Estado" };
	private DaoEnvios dao = new DaoEnvios();
	private TransferEnvioLaboratorio pedido = new TransferEnvioLaboratorio();
	private List<TransferEnvioLaboratorio> EnvioLab;
	public EnvioLabTableModel(ControladorEnvio _ctrl) {
		try {
			EnvioLab =dao.addPedidoLaboratorio(pedido);
		} catch (IOException e) {
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
		return EnvioLab == null ? 0 : EnvioLab.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0: return EnvioLab.get(rowIndex).getID_Envio();
		case 1: return EnvioLab.get(rowIndex).getProducto();
		case 2:	return EnvioLab.get(rowIndex).getOrigen();
		case 3:	return EnvioLab.get(rowIndex).getDestinatario();
		case 4: return EnvioLab.get(rowIndex).getCompuesto();
		case 5: return EnvioLab.get(rowIndex).getSe();
		default: return false;
		}		
	}

}
