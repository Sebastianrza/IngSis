package GestionDeEnvios.GDE.Presentacion;

import GestionDeEnvios.GDE.Negocio.TransferEnvio;

public interface DaoObservable {
	
	void EnvioAceptado(TransferEnvio e);
	void EnvioRechazado(TransferEnvio e);
	void EnvioModificado(TransferEnvio e);
	void EnvioEliminado(TransferEnvio e);
	
}
