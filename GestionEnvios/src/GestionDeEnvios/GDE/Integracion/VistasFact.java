package GestionDeEnvios.GDE.Integracion;

import GestionDeEnvios.GDE.Presentacion.EnvioFrame;
import GestionDeEnvios.GDE.Presentacion.EnvioPrincipial;
import GestionDeEnvios.GDE.Presentacion.ListadoEnvio;
import GestionDeEnvios.GDE.Presentacion.ListadoPendiente;
import GestionDeEnvios.GDE.Presentacion.ModificarEnvio;

public class VistasFact extends FactoriaVista{

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
	public ListadoEnvio EnvioList() {
		// TODO Auto-generated method stub
		return new ListadoEnvio();
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
