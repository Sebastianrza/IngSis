package GestionDeEnvios.GDE.Presentacion;

import GestionDeEnvios.GDE.Integracion.FactoriaVista;
import GestionDeEnvios.GDE.Integracion.VistasFact;
import GestionDeEnvios.GDE.Negocio.SAEnvios;

public class ControladorEnvio {
	
	protected FactoriaVista FV;
	protected VistasFact VF;
	protected SAEnvios sa;
	
	 /*Singleton*/
	public ControladorEnvio() {	
		this.FV = FactoriaVista.getInstance();
		this.VF = VistasFact.getInstance();
		
		if (sa == null) {
			sa = new SAEnvios();
		}
		
	}

}
