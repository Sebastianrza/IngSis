package GestionDeEnvios.GDE.Negocio;

public class TransferEnvio {

	protected String ID_Envio;  
    protected String  Destinatario;  
    protected String Origen;
    protected String cantidad;
    protected String compuesto;
    protected String se;
    protected String Descripcion;
    
 
   

	public TransferEnvio(){
    
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

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
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
