package GestionDeEnvios.GDE.Presentacion;

import GestionDeEnvios.GDE.Negocio.SAEnvios;

public class EnvioPrincipial {
	
	SAEnvios aux;
	EnvioFrame initframe;
	ListadoEnvio1 initlistado;
	ListadoPendiente initpendiente;
	ModificarEnvio initmodificar;
	ControladorEnvio enviocontrol;
	
	
	public void init() {
		this.aux = new SAEnvios();
		this.initframe = new EnvioFrame();
		this.initlistado = new ListadoEnvio1();
		this.initpendiente = new ListadoPendiente();
		this.enviocontrol = new ControladorEnvio();
	}
}
