package GestionDeEnvios.GDE.Presentacion;

import GestionDeEnvios.GDE.Negocio.SAEnvios;

public class EnvioPrincipial {
	
	SAEnvios aux;
	EnvioFrame initframe;
	ListadoEnvio initlistado;
	ListadoPendiente initpendiente;
	ModificarEnvio initmodificar;
	ControladorEnvio enviocontrol;
	
	
	public void init() {
		this.aux = new SAEnvios();
		this.initframe = new EnvioFrame();
		this.initlistado = new ListadoEnvio();
		this.initpendiente = new ListadoPendiente();
		this.enviocontrol = new ControladorEnvio();
	}
}
