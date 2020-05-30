package GestionDeEnvios.GDE.Negocio;

import javax.swing.JOptionPane;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;
	
	
public class SAEnvios {
	public boolean ModificarEnvio = false;
	
	//Modificar
	public void ModificarEnvioAlm(TransferEnvioAlmacen envio)  {
		DaoEnvios dao;
		if(!envio.ID_Envio.isEmpty() || !envio.Origen.isEmpty() || !envio.Descripcion.isEmpty() || !envio.compuesto.isEmpty()
				|| !envio.cantidad.isEmpty() || !envio.Destinatario.isEmpty() ) {
			dao = new DaoEnvios();
			dao.ModificarEnvioAlmacen(envio);
			ModificarEnvio = true;
		}else {
			JOptionPane.showMessageDialog(null, "Error al modificar el pedido, caracteristica nula");
		}
	}
	public void ModificarEnvioMed(TransferEnvioMedico envio)  {
		DaoEnvios dao;
		if(!envio.ID_Envio.isEmpty() || !envio.Origen.isEmpty() || !envio.Descripcion.isEmpty() || !envio.compuesto.isEmpty()
				|| !envio.cantidad.isEmpty() || !envio.Destinatario.isEmpty() ) {
			dao = new DaoEnvios();
			dao.ModificarEnvioMedico(envio);
			ModificarEnvio = true;
		}else {
			JOptionPane.showMessageDialog(null, "Error al modificar el pedido, caracteristica nula");
		}
	}
	public void ModificarEnvioFab(TransferEnvioFabrica envio){
		DaoEnvios dao;
		if(!envio.ID_Envio.isEmpty() || !envio.Origen.isEmpty() || !envio.Descripcion.isEmpty() || !envio.compuesto.isEmpty()
				|| !envio.cantidad.isEmpty() || !envio.Destinatario.isEmpty() ) {
			dao = new DaoEnvios();
			dao.ModificarEnvioFabrica(envio);
			ModificarEnvio = true;
		}else {
			JOptionPane.showMessageDialog(null, "Error al modificar el pedido, caracteristica nula");
		}
	}
	public void ModificarEnvioLab(TransferEnvioLaboratorio envio) {
		DaoEnvios dao;
		if(!envio.ID_Envio.isEmpty() || !envio.Origen.isEmpty() || !envio.Descripcion.isEmpty() || !envio.compuesto.isEmpty()
				|| !envio.cantidad.isEmpty() || !envio.Destinatario.isEmpty() ) {
			dao = new DaoEnvios();
			dao.ModificarEnvioLaboratorio(envio);
			ModificarEnvio = true;
		}else {
			JOptionPane.showMessageDialog(null, "Error al modificar el pedido, caracteristica Vacia");
		}
	}
	
	
	//Eliminar
	public void EliminarEnvioAlmacen(TransferEnvioAlmacen envio)  {
		DaoEnvios dao;
		dao = new DaoEnvios();
		dao.EliminarEnvioAlmacen(envio);
	}
	public void EliminarEnvioMedico(TransferEnvioMedico envio)  {
		DaoEnvios dao;
		dao = new DaoEnvios();
		dao.EliminarEnvioMedic(envio);
	}
	public void EliminarEnvioFabrica(TransferEnvioFabrica envio)  {
		DaoEnvios dao;
		dao = new DaoEnvios();
		dao.EliminarEnvioFabrica(envio);;
	}
	public void EliminarEnvioLaboratorio(TransferEnvioLaboratorio envio) {
		DaoEnvios dao;
		dao = new DaoEnvios();
		dao.EliminarEnvioLaborat(envio);
	}

	
}


