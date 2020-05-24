package GestionDeEnvios.GDE.Presentacion;

import GestionDeEnvios.GDE.Negocio.SAEnvios;

public class EnvioPrincipial {
	
	SAEnvios aux;
	EnvioFrame initframe;
	ListadoEnvios initlistado;
	ListadoPendiente initpendiente;
	ModificarEnvioAlmacen initmodificar;
	ControladorEnvio enviocontrol;
	
	
	public void init() {
		this.aux = new SAEnvios();
		this.initframe = new EnvioFrame();
		this.initlistado = new ListadoEnvios();
		this.initpendiente = new ListadoPendiente();
		this.enviocontrol = new ControladorEnvio();
	}
}
