package GestionDeEnvios.GDE.Presentacion;

import java.util.List;

import GestionDeEnvios.GDE.Negocio.EnviosMap;
import GestionDeEnvios.GDE.Negocio.TransferEnvioLaboratorio;

public interface ObserverEnvioLaboratorio {
	
	void EnvioAceptado(EnviosMap map, List<TransferEnvioLaboratorio> TE, TransferEnvioLaboratorio e);
	void EnvioRechazado(EnviosMap map, List<TransferEnvioLaboratorio> TE, TransferEnvioLaboratorio e);
	void EnvioModificado(EnviosMap map, List<TransferEnvioLaboratorio> TE, TransferEnvioLaboratorio e);
	void onReset(EnviosMap map, List<TransferEnvioLaboratorio> TE);
	void onRegister(EnviosMap map, List<TransferEnvioLaboratorio> TE);
}
