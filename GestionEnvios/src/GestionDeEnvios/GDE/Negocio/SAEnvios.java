package GestionDeEnvios.GDE.Negocio;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;

public class SAEnvios {
	
	
	public void validarpedido(TransferEnvio envio) throws IOException {
		
		DaoEnvios en;
		String id = envio.getID_Envio().toString();
		if(envio.getID_Envio().toString() !=null) {
			en = new DaoEnvios();
			if(id == "al") {
				 en = new DaoEnvios();
				 en.addPedidoAlmacen((TransferEnvioAlmacen) envio);
			}else if(id == "fa"){
				en = new DaoEnvios();
				en.addPedidoFabrica((TransferEnvioFabrica) envio);
			}else if(id =="me"){
				en = new DaoEnvios();
				en.addPedidoMedico((TransferEnvioMedico) envio);
			}else if(id == "lab"){
				en = new DaoEnvios();
				en.addPedidoLaboratorio((TransferEnvioLaboratorio) envio);
			}
			
		}else {
			JOptionPane.showInputDialog(null, "Id de pedido es nulo no se puede crear un envio,",JOptionPane.WARNING_MESSAGE);
		}
		
	}
	

	
}


