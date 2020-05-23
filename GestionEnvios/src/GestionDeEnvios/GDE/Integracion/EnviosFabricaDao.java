package GestionDeEnvios.GDE.Integracion;

public class EnviosFabricaDao extends DaoEnvios{
	
		public EnviosFabricaDao(){
			
			this._file = "src/BD/BD-Envios-Fabrica.json";
			this.type = "pedido_almacen";
			
		}
}
