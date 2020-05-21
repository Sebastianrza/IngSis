package GestionDeEnvios.GDE.Negocio;

public class TransferEnvioMedico {
	
	protected String ID_Envio;  
	protected String ID_Medico; 
    protected String  Destinatario;  
    protected String Origen;
    protected int cantidad;
    protected StatusEnvio se;
 
    public TransferEnvioMedico(String ID_Envio, String ID_Medico, String Destinatario, 
    		String Origen, int cantidad, StatusEnvio se){
    	this.ID_Envio = ID_Envio;
    	this.ID_Medico = ID_Medico;
    	this.Destinatario = Destinatario;
    	this.Origen = Origen;
    	this.cantidad = cantidad;
    	this.se = se;
    }
	public String getID_Envio() {
		return ID_Envio;
	}

	public void setID_Envio(String iD_Envio) {
		ID_Envio = iD_Envio;
		}

    public String getID_Medico() {
		return ID_Medico;
	}

	public void setID_Medico(String iD_Medico) {
		ID_Medico = iD_Medico;
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
