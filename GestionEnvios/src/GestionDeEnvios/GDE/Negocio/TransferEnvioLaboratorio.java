package GestionDeEnvios.GDE.Negocio;

public class TransferEnvioLaboratorio {
	
	
	protected String ID_Envio;  
	protected String ID_Lab; 
    protected String  Destinatario;  
    protected String Origen;
    protected int cantidad;
    protected StatusEnvio se;
    
 
    public TransferEnvioLaboratorio(/*String ID_Envio, String ID_Lab, String Destinatario, 
    		String Origen, int cantidad, StatusEnvio se*/){
    	this.ID_Envio = ID_Envio;
    	this.ID_Lab = ID_Lab;
    	this.Destinatario = Destinatario;
    	this.Origen = Origen;
    	this.cantidad = cantidad;
    }
	public String getID_Envio() {
		return ID_Envio;
	}

	public void setID_Envio(String iD_Envio) {
		ID_Envio = iD_Envio;
		}

    public String getID_Lab() {
		return ID_Lab;
	}

	public void setID_Lab(String iD_Lab) {
		ID_Lab = iD_Lab;
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
