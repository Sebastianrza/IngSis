package GestionDeFabrica.TransfersObjects;

import GestionDeFabrica.PresentacionModelo.EstadoPedido;

public abstract class PedidosAbstractoTransfer implements PedidosTransfer {

	protected String type;
	protected String id;
	protected String usuario;
	protected String nombre;
	protected String compuesto;
	protected String producto;
	protected int cantidad;
	protected EstadoPedido estado2;
	
	@Override
	public String getType() {
		
		return this.type;
	}
	
	@Override
	public void setType(String type) {
		
		this.type = type;
	}
	
	@Override
	public String getIdPedido() {
		
		return this.id;
	}
	
	@Override
	public void setIdPedido(String id) {
		
		this.id = id;
	}
	
	@Override
	public String getUsuario() {
		
		return this.usuario;
	}
	
	@Override
	public void setUsuario(String usuario) {
		
		this.usuario = usuario;
	}
	
	@Override
	public String getNombre() {
		
		return this.nombre;
	}
	
	@Override
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	@Override
	public String getCompuesto() {
		
		return this.compuesto;
	}
	
	@Override
	public void setCompuesto(String compuesto) {
		
		this.compuesto = compuesto;
	}
	
	@Override
	public String getProducto() {
		
		return this.producto;
	}
	
	@Override
	public void setProducto(String producto) {
		
		this.producto = producto;
	}
	
	@Override
	public int getCantidad() {
		
		return this.cantidad;
	}
	
	@Override
	public void setCantidad(int cantidad) {
		
		this.cantidad = cantidad;
	}
	
	/*public String getEstadoPedido() {
		
		if (this.estado2.equals(EstadoPedido.ACEPTADO)) {
			return "aceptado";
		}
		else if(this.estado2.equals(EstadoPedido.RECHAZADO)) {
			return "rechazado";
		}
		else if (this.estado2.equals(EstadoPedido.EN_PROCESO)) {
			return "en_proceso";
		}
		return "null";
	}*/
	@Override
	public EstadoPedido getEstadoPedido() {
	
		return this.estado2;
	}
	
	@Override
	public void setEstadoPedido(String estado1) {
		
		//if (estado != null) {
		//	EstadoPedido temp = EstadoPedido.valueOf(estado.toUpperCase());
		//	this.estado = temp;
		//}\
		if (estado1.equals("aceptado")) {
			this.estado2 = EstadoPedido.ACEPTADO;
		}
		else if(estado1.equals("rechazado")) {
			this.estado2 = EstadoPedido.RECHAZADO;
		}
		else if(estado1.equals("en_proceso")) {
			this.estado2 = EstadoPedido.EN_PROCESO;
		}
	}
}
