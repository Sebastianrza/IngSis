package GestionDeEnvios.GDE.Presentacion;

import java.io.IOException;

import GestionDeEnvios.GDE.Integracion.FactoriaVista;
import GestionDeEnvios.GDE.Integracion.VistasFact;
import GestionDeEnvios.GDE.Negocio.SAEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvio;
import GestionDeEnvios.GDE.Negocio.TransferEnvioAlmacen;
import GestionDeEnvios.GDE.Negocio.TransferEnvioFabrica;
import GestionDeEnvios.GDE.Negocio.TransferEnvioLaboratorio;
import GestionDeEnvios.GDE.Negocio.TransferEnvioMedico;
import GestionDeEnvios.GDE.Negocio.TransferEnvioPendiente;

public class ControladorEnvio {
	
	protected FactoriaVista FV;
	protected VistasFact VF;
	protected SAEnvios sa;
	
	 //Singleton
	public ControladorEnvio() {	
		this.FV = FactoriaVista.getInstance();
		this.VF = VistasFact.getInstance();
		
		if (sa == null) {
			sa = new SAEnvios();
		}
		
	}
	
	public void addPedidoFabrica(TransferEnvioFabrica pedido) throws IOException {
		this.sa.validarpedido(pedido);
	}
	public void addPedidoAlmacen(TransferEnvioAlmacen pedido) throws IOException {
		this.sa.validarpedido(pedido);
	}
	public void addPedidoMedico(TransferEnvioMedico pedido) throws IOException {
		this.sa.validarpedido(pedido);
	}
	public void addPedidoLaboratorio(TransferEnvioLaboratorio pedido) throws IOException {	
		this.sa.validarpedido(pedido);
	}
	public void addPedidoPendiente(TransferEnvioPendiente pedido) throws IOException {
		this.sa.validarpedido(pedido);
	}
}
