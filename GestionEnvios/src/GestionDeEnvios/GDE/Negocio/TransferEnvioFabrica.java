package GestionDeEnvios.GDE.Negocio;

import java.util.ArrayList;
import java.util.List;

public class TransferEnvioFabrica {
	
		protected String type;
		protected String producto;
		protected String ID_Envio;  
		protected String ID_Fabrica; 
	    protected String  Destinatario;  
	    protected String Origen;
	    protected int cantidad;
	    protected StatusEnvio se;
	    protected List<TransferEnvioFabrica> lef = new ArrayList<>();
	    
	 
	    public TransferEnvioFabrica(String type, String producto, String ID_Envio, String ID_Fabrica, String Destinatario, 
	    		String Origen, int cantidad, StatusEnvio se){
	    	
	    	this.type = type;
	    	this.producto = producto;
	    	this.ID_Envio = ID_Envio;
	    	this.ID_Fabrica = ID_Fabrica;
	    	this.Destinatario = Destinatario;
	    	this.Origen = Origen;
	    	this.cantidad = cantidad;
	    	this.se = se;
	    }
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
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
	
	    public String getID_Fabrica() {
			return ID_Fabrica;
		}

		public void setID_Fabrica(String iD_Fabrica) {
			ID_Fabrica = iD_Fabrica;
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
		public StatusEnvio getSe() {
			return se;
		}
		public void setSe(StatusEnvio se) {
			this.se = se;
		}
	
	
}
	

