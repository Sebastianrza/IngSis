package GestionDeEnvios.GDE.Negocio;

import java.util.ArrayList;
import java.util.List;

public class TransferEnvioFabrica extends TransferEnvio{

	 
	    public TransferEnvioFabrica(){
	  
	    }
		
		public String getProducto() {
			return producto;
		}
		public void setProducto(String producto) {
			this.producto = producto;
		}
		public String getID_Envio() {
			return ID_Envio;
		}

		public void setID_Envio(String iD_Envio) {
			ID_Envio = iD_Envio;
			}
	
		public String getDestinatario() {
			return Destinatario;
		}

		public void setDestinatario(String destinatario) {
			Destinatario = destinatario;
		}

		public String getOrigen() {
			return Origen;
		}

		public void setOrigen(String origen) {
			Origen = origen;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public String getSe() {
			return se;
		}
		public void setSe(String se) {
			this.se = se;
		}

		public String getCompuesto() {
			return compuesto;
		}

		public void setCompuesto(String compuesto) {
			this.compuesto = compuesto;
		}
	
	
}
	

