package GestionDeEnvios.GDE.Negocio;

public class TransferEnvioLaboratorio extends TransferEnvio{
	
	
    public TransferEnvioLaboratorio(){
    
    }
    public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}
	
	@Override
	public String getID_Envio() {
		return ID_Envio;
	}

	@Override
	public void setID_Envio(String iD_Envio) {
		ID_Envio = iD_Envio;
		}

	@Override
	public String getDestinatario() {
		return Destinatario;
	}

	@Override
	public void setDestinatario(String destinatario) {
		Destinatario = destinatario;
	}

	@Override
	public String getOrigen() {
		return Origen;
	}

	@Override
	public void setOrigen(String origen) {
		Origen = origen;
	}

	@Override
	public String getCantidad() {
		return cantidad;
	}

	@Override
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String getSe() {
		return se;
	}
	@Override
	public void setSe(String se) {
		this.se = se;
	}

	@Override
	public String getCompuesto() {
		return compuesto;
	}

	@Override
	public void setCompuesto(String compuesto) {
		this.compuesto = compuesto;
	}
}
