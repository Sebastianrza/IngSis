package GestionDeEnvios.GDE.Presentacion;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvioPendiente;

public class PendienteTableModel extends AbstractTableModel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String[] _colNames = {"ID","Origen","Destino","Descripcion", "Compuesto","Cantidad","Estado" };
		private DaoEnvios dao = new DaoEnvios();
		private List<TransferEnvioPendiente> EnvioAlm = new ArrayList<TransferEnvioPendiente>();
		
		public PendienteTableModel(ControladorEnvio _ctrl) {
		
		EnvioAlm = dao.BuscarPedidoPendiente();
		
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
			return EnvioAlm.size();
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			

			switch(columnIndex) {
			case 0: return EnvioAlm.get(rowIndex).getID_Envio()+"";
			case 1: return EnvioAlm.get(rowIndex).getOrigen()+"";
			case 2:	return EnvioAlm.get(rowIndex).getDestinatario()+"";
			case 3:	return EnvioAlm.get(rowIndex).getDescripcion()+"";
			case 4: return EnvioAlm.get(rowIndex).getCompuesto()+"";
			case 5: return EnvioAlm.get(rowIndex).getCantidad()+"";
			case 6: return EnvioAlm.get(rowIndex).getSe()+"";
			default: return false;
			
			}
			
		}
	
}