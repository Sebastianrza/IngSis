package GestionDeEnvios.GDE.Negocio;

import java.util.HashMap;
import java.util.Map;

public class EnviosMap {


	protected Map<String, TransferEnvioLaboratorio> EnvLab;
	protected Map<String, TransferEnvioAlmacen> EnvAl;
	protected Map<String, TransferEnvioFabrica> EnvFa;
	
	public EnviosMap() {
		this.EnvLab = new HashMap<String, TransferEnvioLaboratorio>();
		this.EnvAl =new HashMap<String, TransferEnvioAlmacen>();
		this.EnvFa = new HashMap<String, TransferEnvioFabrica>();
	}
}
