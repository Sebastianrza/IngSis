package GestionDeEnvios.GDE.Presentacion;

import GestionDeEnvios.GDE.Integracion.DaoEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvioFabrica;

public class prueba {

	public static void main(String[] args) {
		DaoEnvios dao = new DaoEnvios();
		TransferEnvioFabrica pedido = new TransferEnvioFabrica();
		dao.addPedidoFabrica(pedido);

	}

}
