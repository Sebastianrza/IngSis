package GestionDeEnvios.GDE.Integracion;

import GestionDeEnvios.GDE.Presentacion.EnvioFrame;
import GestionDeEnvios.GDE.Presentacion.EnvioPrincipial;

import GestionDeEnvios.GDE.Presentacion.ListadoEnvio1;
import GestionDeEnvios.GDE.Presentacion.ListadoPendiente;
import GestionDeEnvios.GDE.Presentacion.ModificarEnvio;

public class VistasFact extends FactoriaVista{
	
	private static VistasFact instance;
	public static VistasFact getInstance() {
		if (instance == null) {
			instance = new VistasFact();
		}
		return instance;
	}
	@Override
	public EnvioPrincipial EnvioIni() {
		// TODO Auto-generated method stub
		return new EnvioPrincipial();
	}

	@Override
	public EnvioFrame Envioinit() {
		// TODO Auto-generated method stub
		return new EnvioFrame();
	}

	@Override
	public ListadoEnvio1 EnvioList() {
		// TODO Auto-generated method stub
		return new ListadoEnvio1();
	}

	@Override
	public ListadoPendiente EnvioPendi() {
		// TODO Auto-generated method stub
		return new ListadoPendiente();
	}

	@Override
	public ModificarEnvio EnvioModif() {
		// TODO Auto-generated method stub
		return new ModificarEnvio();
	}

}
