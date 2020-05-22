package GestionDeEnvios.GDE.Integracion;

import GestionDeEnvios.GDE.Presentacion.EnvioFrame;
import GestionDeEnvios.GDE.Presentacion.EnvioPrincipial;

import GestionDeEnvios.GDE.Presentacion.ListadoEnvio1;
import GestionDeEnvios.GDE.Presentacion.ListadoPendiente;
import GestionDeEnvios.GDE.Presentacion.ModificarEnvio;


public abstract class FactoriaVista {
	
	private static FactoriaVista instance;

	public static FactoriaVista getInstance() {
		if (instance == null) {
			instance = new VistasFact();
		}
		return instance;
	}
	
	public abstract EnvioPrincipial EnvioIni();
	
	public abstract EnvioFrame	Envioinit();

	public abstract ListadoEnvio1 EnvioList();

	public abstract ListadoPendiente EnvioPendi();

	public abstract ModificarEnvio EnvioModif();

}
