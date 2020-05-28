package GestionDeEnvios.GDE.Presentacion;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvioEliminado;

public class EnviosRechazadosTableModel extends AbstractTableModel{
	
	private static final long serialVersionUID = 1L;
	private String[] _colNames = {"ID","Origen","Destino","Descripcion", "Compuesto","Cantidad","Estado" };
	private DaoEnvios dao = new DaoEnvios();
	private TransferEnvioEliminado pedido = new TransferEnvioEliminado();
	private List<TransferEnvioEliminado> EnviosEliminados = new ArrayList<>();
	public EnviosRechazadosTableModel(ControladorEnvio _ctrl) {
		EnviosEliminados = dao.buscarpedidosrechazados();
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
		// TODO Auto-generated method stub
		return _colNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return EnviosEliminados== null ? 0 : EnviosEliminados.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0: return EnviosEliminados.get(rowIndex).getID_Envio()+"";
		case 1: return EnviosEliminados.get(rowIndex).getOrigen()+"";
		case 2:	return EnviosEliminados.get(rowIndex).getDestinatario()+"";
		case 3:	return EnviosEliminados.get(rowIndex).getDescripcion()+"";
		case 4: return EnviosEliminados.get(rowIndex).getCompuesto()+"";
		case 5: return EnviosEliminados.get(rowIndex).getCantidad()+"";
		case 6: return EnviosEliminados.get(rowIndex).getSe()+"";
	
		default: return false;
		}		
	}

}
