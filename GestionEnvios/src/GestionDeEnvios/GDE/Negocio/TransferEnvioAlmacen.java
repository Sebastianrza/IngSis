package GestionDeEnvios.GDE.Negocio;

public class TransferEnvioAlmacen {
	
	
	protected String ID_Envio;  
	protected String ID_Almacen; 
    protected String  Destinatario;  
    protected String Origen;
    protected int cantidad;
    protected StatusEnvio se;
    
 
    public TransferEnvioAlmacen(/*String ID_Envio, String ID_Almacen, String Destinatario, 
    		String Origen, int cantidad, StatusEnvio se*/){
    	this.ID_Envio = ID_Envio;
    	this.ID_Almacen = ID_Almacen;
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

    public String getID_Almacen() {
		return ID_Almacen;
	}

	public void setID_Almacen(String iD_Almacen) {
		ID_Almacen = iD_Almacen;
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
