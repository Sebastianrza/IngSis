package GestionDeEnvios.GDE.Presentacion;

import java.util.List;

import GestionDeEnvios.GDE.Negocio.EnviosMap;
import GestionDeEnvios.GDE.Negocio.TransferEnvioFabrica;


public interface ObserverEnvioFabrica {
	void EnvioAceptado(EnviosMap map, List<TransferEnvioFabrica> TE, TransferEnvioFabrica e);
	void EnvioRechazado(EnviosMap map, List<TransferEnvioFabrica> TE, TransferEnvioFabrica e);
	void EnvioModificado(EnviosMap map, List<TransferEnvioFabrica> TE, TransferEnvioFabrica e);
	void onReset(EnviosMap map, List<TransferEnvioFabrica> TE);
	void onRegister(EnviosMap map, List<TransferEnvioFabrica> TE);

}
