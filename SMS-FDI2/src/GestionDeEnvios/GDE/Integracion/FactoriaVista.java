package GestionDeEnvios.GDE.Integracion;

import java.io.FileNotFoundException;

import GestionDeEnvios.GDE.Presentacion.EnvioFrame;
import GestionDeEnvios.GDE.Presentacion.EnvioPrincipial;

import GestionDeEnvios.GDE.Presentacion.ListadoEnvios;
import GestionDeEnvios.GDE.Presentacion.ListadoPendiente;
import GestionDeEnvios.GDE.Presentacion.ModificarEnvioAlmacen;


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

	public abstract ListadoEnvios EnvioList();

	public abstract ListadoPendiente EnvioPendi();

	public abstract ModificarEnvioAlmacen EnvioModif() throws FileNotFoundException;

}
