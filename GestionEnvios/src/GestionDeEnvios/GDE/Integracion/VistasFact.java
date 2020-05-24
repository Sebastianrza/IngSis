package GestionDeEnvios.GDE.Integracion;

import GestionDeEnvios.GDE.Presentacion.EnvioFrame;
import GestionDeEnvios.GDE.Presentacion.EnvioPrincipial;

import GestionDeEnvios.GDE.Presentacion.ListadoEnvios;
import GestionDeEnvios.GDE.Presentacion.ListadoPendiente;
import GestionDeEnvios.GDE.Presentacion.ModificarEnvioAlmacen;

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
	public ListadoEnvios EnvioList() {
		// TODO Auto-generated method stub
		return new ListadoEnvios();
	}

	@Override
	public ListadoPendiente EnvioPendi() {
		// TODO Auto-generated method stub
		return new ListadoPendiente();
	}

	@Override
	public ModificarEnvioAlmacen EnvioModif() {
		// TODO Auto-generated method stub
		return new ModificarEnvioAlmacen();
	}

}
