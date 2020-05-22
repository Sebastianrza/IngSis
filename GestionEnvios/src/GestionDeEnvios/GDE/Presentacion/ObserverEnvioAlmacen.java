package GestionDeEnvios.GDE.Presentacion;

import java.util.List;

import GestionDeEnvios.GDE.Negocio.EnviosMap;
import GestionDeEnvios.GDE.Negocio.TransferEnvioMedico;

public interface ObserverEnvioAlmacen {

	void EnvioAceptado(EnviosMap map, List<TransferEnvioMedico> TE, TransferEnvioMedico e);
	void EnvioRechazado(EnviosMap map, List<TransferEnvioMedico> TE, TransferEnvioMedico e);
	void EnvioModificado(EnviosMap map, List<TransferEnvioMedico> TE, TransferEnvioMedico e);
	void onReset(EnviosMap map, List<TransferEnvioMedico> TE);
	void onRegister(EnviosMap map, List<TransferEnvioMedico> TE);
	
}
