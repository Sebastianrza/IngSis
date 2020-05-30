package GestionDeEnvios.GDE.Integracion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.json.*;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;

import BD.Conexion;
import GestionDeEnvios.GDE.Negocio.StatusEnvio;
import GestionDeEnvios.GDE.Negocio.TransferEnvioAlmacen;
import GestionDeEnvios.GDE.Negocio.TransferEnvioEliminado;
import GestionDeEnvios.GDE.Negocio.TransferEnvioFabrica;
import GestionDeEnvios.GDE.Negocio.TransferEnvioLaboratorio;
import GestionDeEnvios.GDE.Negocio.TransferEnvioMedico;
import GestionDeEnvios.GDE.Negocio.TransferEnvioPendiente;
import GestionDeEnvios.GDE.Presentacion.DaoObservable;
import GestionDeEnvios.GDE.Presentacion.Observable;

public class DaoEnvios implements Observable<DaoObservable>{
	protected String _file;
	protected String id;
	protected String usuario;
	protected String nombre;
	protected String producto;
	protected String origen;
	protected String destinatario;
	protected int cantidad;
	protected StatusEnvio estado;
	private List<TransferEnvioFabrica> EnvioFa = new ArrayList<TransferEnvioFabrica>();
	private List<TransferEnvioMedico> EnvioMe = new ArrayList<TransferEnvioMedico>();
	private List<TransferEnvioAlmacen> EnvioAl = new ArrayList<TransferEnvioAlmacen>();
	private List<TransferEnvioLaboratorio> EnvioLab = new ArrayList<TransferEnvioLaboratorio>();
	private List<TransferEnvioPendiente> EnvioPen = new ArrayList<TransferEnvioPendiente>();
	private List<TransferEnvioEliminado> EnvioEl = new ArrayList<TransferEnvioEliminado>();
	
	public List<TransferEnvioFabrica> addPedidoFabrica(TransferEnvioFabrica pedido) throws FileNotFoundException{
		
		FileReader _inFile = new FileReader("src/BD/BD-Fabrica-Envios.json");
		if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				
				pedido.setID_Envio(( ja.getJSONObject(i).getString("id")));
				pedido.setDescripcion( ja.getJSONObject(i).getString("descripcion"));
				pedido.setCompuesto(ja.getJSONObject(i).getString("compuesto"));
				pedido.setOrigen(ja.getJSONObject(i).getString("origen"));
				pedido.setDestinatario(ja.getJSONObject(i).getString("destinatario"));
				pedido.setSe(ja.getJSONObject(i).getString("estado"));
			//	pedido.setCantidad(ja.getJSONObject(i).getInt("cantidad"));
						
				Conexion conex = new Conexion();

				try {
					String ID_Pedido = ja.getJSONObject(i).getString("id");
					String Compuesto =(ja.getJSONObject(i).getString("compuesto"));
					String Origen = (ja.getJSONObject(i).getString("origen"));
					String Destino = (ja.getJSONObject(i).getString("destinatario"));
					String Estado = (ja.getJSONObject(i).getString("estado"));
					int Cantidad = (ja.getJSONObject(i).getInt("cantidad"));
					String Descripcion = ja.getJSONObject(i).getString("descripcion");
					
					Statement estatuto = conex.getConnection().createStatement();
					ResultSet query = estatuto.executeQuery("SELECT ID_Pedido FROM FabricaEnviosPedidos"); 
					
					//if(query.getRow() == 1) {
					estatuto.executeUpdate("INSERT INTO FabricaEnviosPedidos VALUES ('"+ID_Pedido+"', '"
							+Origen+"', '"+Destino+"', '"
							+Descripcion+"', '"+Compuesto+"', '"+Cantidad+"', '"+Estado+"')");
					JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informacion",JOptionPane.INFORMATION_MESSAGE);
					estatuto.close();
					conex.desconectar();
					//}else {
						//JOptionPane.showMessageDialog(null, "Registro duplicado","ya existe Informacion",JOptionPane.INFORMATION_MESSAGE);
					//}
					

				} catch (SQLException e) {
					
					JOptionPane.showMessageDialog(null, "No se ha podido registrar");
				}
			}
		
				}
		return EnvioFa;
		
	}	
	public List<TransferEnvioAlmacen> addPedidoAlmacen(TransferEnvioAlmacen pedido) throws FileNotFoundException {
		FileReader _inFile = new FileReader("src/BD/BD-Almacen-Envios.json");
		
		if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
for (int i = 0; i < ja.length(); i++) {
				
				
				pedido.setID_Envio(( ja.getJSONObject(i).getString("id")));
				pedido.setDescripcion( ja.getJSONObject(i).getString("descripcion"));
				pedido.setCompuesto(ja.getJSONObject(i).getString("compuesto"));
				pedido.setOrigen(ja.getJSONObject(i).getString("origen"));
				pedido.setDestinatario(ja.getJSONObject(i).getString("destinatario"));
				pedido.setSe(ja.getJSONObject(i).getString("estado"));
				//pedido.setCantidad(ja.getJSONObject(i).getInt("cantidad"));
						
				Conexion conex = new Conexion();

				try {
					String ID_Pedido = ja.getJSONObject(i).getString("id");
					String Compuesto =(ja.getJSONObject(i).getString("compuesto"));
					String Origen = (ja.getJSONObject(i).getString("origen"));
					String Destino = (ja.getJSONObject(i).getString("destinatario"));
					String Estado = (ja.getJSONObject(i).getString("estado"));
					int Cantidad = (ja.getJSONObject(i).getInt("cantidad"));
					String Descripcion = ja.getJSONObject(i).getString("descripcion");
					
					Statement estatuto = conex.getConnection().createStatement();
					ResultSet query = estatuto.executeQuery("SELECT ID_Pedido FROM AlmacenEnviosPedidos"); 
					//if(query.getRow() ==1) {
					estatuto.executeUpdate("INSERT INTO AlmacenEnviosPedidos VALUES ('"+ID_Pedido+"', '"
							+Origen+"', '"+Destino+"', '"
							+Descripcion+"', '"+Compuesto+"', '"+Cantidad+"', '"+Estado+"')");
					JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informacion",JOptionPane.INFORMATION_MESSAGE);
					estatuto.close();
					conex.desconectar();
					/*}else {
						JOptionPane.showMessageDialog(null, "Registro duplicado","ya existe Informacion",JOptionPane.INFORMATION_MESSAGE);
					}*/

				} catch (SQLException e) {
					System.out.println(e.getMessage());
					JOptionPane.showMessageDialog(null, "No se ha podido registrar");
				}
			}
		
				}
		return EnvioAl;
		
	}
	
	public List<TransferEnvioMedico> addPedidoMedico(TransferEnvioMedico pedido) throws FileNotFoundException {
		FileReader _inFile = new FileReader("src/BD/BD-Medico-Envios.json");
	
		if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				
				
				pedido.setID_Envio(( ja.getJSONObject(i).getString("id")));
				pedido.setDescripcion( ja.getJSONObject(i).getString("descripcion"));
				pedido.setCompuesto(ja.getJSONObject(i).getString("compuesto"));
				pedido.setOrigen(ja.getJSONObject(i).getString("origen"));
				pedido.setDestinatario(ja.getJSONObject(i).getString("destinatario"));
				pedido.setSe(ja.getJSONObject(i).getString("estado"));
			//	pedido.setCantidad(ja.getJSONObject(i).getString("cantidad"));
						
				Conexion conex = new Conexion();

				try {
					String ID_Pedido = ja.getJSONObject(i).getString("id");
					String Compuesto =(ja.getJSONObject(i).getString("compuesto"));
					String Origen = (ja.getJSONObject(i).getString("origen"));
					String Destino = (ja.getJSONObject(i).getString("destinatario"));
					String Estado = (ja.getJSONObject(i).getString("estado"));
					int Cantidad = (ja.getJSONObject(i).getInt("cantidad"));
					String Descripcion = ja.getJSONObject(i).getString("descripcion");
					
					Statement estatuto = conex.getConnection().createStatement();
					ResultSet query = estatuto.executeQuery("SELECT ID_Pedido FROM MedicosEnviosPedidos"); 
				//	if(query.getRow() ==1) {
					estatuto.executeUpdate("INSERT INTO MedicosEnviosPedidos VALUES ('"+ID_Pedido+"', '"
							+Origen+"', '"+Destino+"', '"
							+Descripcion+"', '"+Compuesto+"', '"+Cantidad+"', '"+Estado+"')");
					JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
					estatuto.close();
					conex.desconectar();
					/*}else {
						JOptionPane.showMessageDialog(null, "Registro duplicado","ya existe Informacion",JOptionPane.INFORMATION_MESSAGE);
					}*/

				} catch (SQLException e) {
					System.out.println(e.getMessage());
					JOptionPane.showMessageDialog(null, "No se ha podido registrar");
				}
			}
		
				}
		return EnvioMe;
		}
	
	
	public List<TransferEnvioLaboratorio> addPedidoLaboratorio(TransferEnvioLaboratorio pedido) throws IOException {
		FileReader _inFile = new FileReader("src/BD/BD-Lab-Envios.json");
		if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				
				
				pedido.setID_Envio(( ja.getJSONObject(i).getString("id")));
				pedido.setDescripcion( ja.getJSONObject(i).getString("Descripcion"));
				pedido.setCompuesto(ja.getJSONObject(i).getString("compuesto"));
				pedido.setOrigen(ja.getJSONObject(i).getString("origen"));
				pedido.setDestinatario(ja.getJSONObject(i).getString("destinatario"));
				pedido.setSe(ja.getJSONObject(i).getString("estado"));
			//	pedido.setCantidad(ja.getJSONObject(i).getString("cantidad"));
						
				Conexion conex = new Conexion();

				try {
					String ID_Pedido = ja.getJSONObject(i).getString("id");
					String Compuesto =(ja.getJSONObject(i).getString("compuesto"));
					String Origen = (ja.getJSONObject(i).getString("origen"));
					String Destino = (ja.getJSONObject(i).getString("destinatario"));
					String Estado = (ja.getJSONObject(i).getString("estado"));
					int Cantidad = (ja.getJSONObject(i).getInt("cantidad"));
					String Descripcion = ja.getJSONObject(i).getString("descripcion");
					
					Statement estatuto = conex.getConnection().createStatement();
					ResultSet query = estatuto.executeQuery("SELECT ID_Pedido FROM LaboratorioEnviosPedidos"); 
					//if(query.getRow() == 1) {
					estatuto.executeUpdate("INSERT INTO LaboratorioEnviosPedidos VALUES ('"+ID_Pedido+"', '"
							+Origen+"', '"+Destino+"', '"
							+Descripcion+"', '"+Compuesto+"', '"+Cantidad+"', '"+Estado+"')");
					JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
					estatuto.close();
					conex.desconectar();
					/*}else {
					JOptionPane.showMessageDialog(null,"No se ha podido registrar"," Informacion" ,JOptionPane.INFORMATION_MESSAGE);
					}*/

				} catch (SQLException e) {
					System.out.println(e.getMessage());
					JOptionPane.showMessageDialog(null, "No se ha podido registrar");
				}
			}
		
				}
		return EnvioLab;
				
		}
	
	public List<TransferEnvioPendiente> addPedidoPendiente(TransferEnvioPendiente pedido) throws FileNotFoundException{
		
		FileReader _inFile = new FileReader("src/BD/BD-Envios-Pendientes.json");
		if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				
				
				pedido.setID_Envio(( ja.getJSONObject(i).getString("id")));
				pedido.setCompuesto(ja.getJSONObject(i).getString("compuesto"));
				pedido.setOrigen(ja.getJSONObject(i).getString("origen"));
				pedido.setDestinatario(ja.getJSONObject(i).getString("destinatario"));
				pedido.setDescripcion(ja.getJSONObject(i).getString("descripcion"));
				pedido.setSe(ja.getJSONObject(i).getString("estado"));
				pedido.setCantidad(ja.getJSONObject(i).getString("cantidad"));
						
				Conexion conex = new Conexion();

				try {
					String id_envio = ja.getJSONObject(i).getString("id");
					String compuesto =(ja.getJSONObject(i).getString("compuesto"));
					String origen = (ja.getJSONObject(i).getString("origen"));
					String destino = (ja.getJSONObject(i).getString("destinatario"));
					String Estado = (ja.getJSONObject(i).getString("estado"));
					int cantidad = (ja.getJSONObject(i).getInt("cantidad"));
					String descripcion = ja.getJSONObject(i).getString("descripcion");
					
					Statement estatuto = conex.getConnection().createStatement();
					ResultSet query = estatuto.executeQuery("SELECT id_envio FROM listadopendiente"); 
					//if(query.getRow() == 1) {
					estatuto.executeUpdate("INSERT INTO listadopendiente VALUES ('"+id_envio+"', '"
							+origen+"', '"+destino+"', '"
							+descripcion+"', '"+compuesto+"', '"+cantidad+"', '"+Estado+"')");
					JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
					estatuto.close();
					conex.desconectar();
					/*}else {
					JOptionPane.showMessageDialog(null,"No se ha podido registrar"," Informacion" ,JOptionPane.INFORMATION_MESSAGE);
					}*/

				} catch (SQLException e) {
					System.out.println(e.getMessage());
					JOptionPane.showMessageDialog(null, "No se ha podido registrar");
				}
			}
		
				}
		return EnvioPen;
				
	}
	
public List<TransferEnvioEliminado> PedidosRechazados(TransferEnvioEliminado pedido) throws FileNotFoundException{
		
	FileReader _inFile = new FileReader("src/BD/BD-Envios-Rechazados.json");
	if (_inFile != null) {
		
		JSONObject jo = new JSONObject(new JSONTokener(_inFile));
		
		JSONArray ja = jo.getJSONArray("array");
		
		for (int i = 0; i < ja.length(); i++) {
			
			
			pedido.setID_Envio(( ja.getJSONObject(i).getString("id")));
			pedido.setCompuesto(ja.getJSONObject(i).getString("compuesto"));
			pedido.setOrigen(ja.getJSONObject(i).getString("origen"));
			pedido.setDestinatario(ja.getJSONObject(i).getString("destinatario"));
			pedido.setDescripcion(ja.getJSONObject(i).getString("descripcion"));
			pedido.setSe(ja.getJSONObject(i).getString("estado"));
			pedido.setCantidad(ja.getJSONObject(i).getString("cantidad"));
					
			Conexion conex = new Conexion();

			try {
				String id_envio = ja.getJSONObject(i).getString("id");
				String Compuesto =(ja.getJSONObject(i).getString("compuesto"));
				String Origen = (ja.getJSONObject(i).getString("origen"));
				String Destino = (ja.getJSONObject(i).getString("destinatario"));
				String Estado = (ja.getJSONObject(i).getString("estado"));
				int Cantidad = (ja.getJSONObject(i).getInt("cantidad"));
				String Descripcion = ja.getJSONObject(i).getString("descripcion");
				
				Statement estatuto = conex.getConnection().createStatement();
				ResultSet query = estatuto.executeQuery("SELECT id_envio FROM listadorechazado"); 
				//if(query.getRow() == 1) {
				estatuto.executeUpdate("INSERT INTO listadorechazado VALUES ('"+id_envio+"', '"
						+Origen+"', '"+Destino+"', '"
						+Descripcion+"', '"+Compuesto+"', '"+Cantidad+"', '"+Estado+"')");
				JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Informaci�n",JOptionPane.INFORMATION_MESSAGE);
				estatuto.close();
				conex.desconectar();
				/*}else {
				JOptionPane.showMessageDialog(null,"No se ha podido registrar"," Informacion" ,JOptionPane.INFORMATION_MESSAGE);
				}*/

			} catch (SQLException e) {
				System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "No se ha podido registrar");
			}
		}
	
			}
	return EnvioEl;
	}

	public void writealmacen(TransferEnvioFabrica pedido) throws JSONException, IOException{
				
		FileReader file = new FileReader("src/BD/BD-Fabrica-Envios.json");
		if (file != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(file));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				
			
			   Gson gson = new Gson();   
		       JsonWriter writer = new JsonWriter(new FileWriter("src/BD/BD-Envios-Fabrica.json"));
		       writer.beginObject();
		       writer.name("data");
		       writer.beginArray();
		           writer.beginObject();
		           writer.name("id").value(ja.getJSONObject(i).getString("id"));
		           System.out.println();
		           writer.name("producto").value(ja.getJSONObject(i).getString("producto"));
		           System.out.println();
		           writer.name("compuesto").value(ja.getJSONObject(i).getString("compuesto"));
		           System.out.println(); 
		           writer.name("origen").value(ja.getJSONObject(i).getString("origen"));
		           System.out.println();
		           writer.name("destinatario").value(ja.getJSONObject(i).getString("destinatario"));
		           System.out.println();
		           writer.name("estado").value(ja.getJSONObject(i).getString("estado"));
		           System.out.println();
		           writer.name("cantidad").value(ja.getJSONObject(i).getInt("cantidad"));
		           System.out.println();
		           writer.endObject();
		      
		       writer.endArray();
		       writer.endObject();
		       writer.close();
	}}
	}
	
	public ArrayList<TransferEnvioAlmacen> BuscarEnviosAlmacen() {
		Conexion conex = new Conexion();
		ArrayList<TransferEnvioAlmacen> EnvioAlm = new ArrayList<TransferEnvioAlmacen>();
		
		
		try {
			Statement estatuto = conex.getConnection().createStatement();
			ResultSet rs = estatuto.executeQuery("SELECT * FROM AlmacenEnviosPedidos");
			
			while(rs.next()) {
				TransferEnvioAlmacen pedido = new TransferEnvioAlmacen();
				pedido.setID_Envio(rs.getString("ID_Pedido"));
				pedido.setOrigen(rs.getString("Origen"));
				pedido.setDestinatario(rs.getString("Destino"));
				pedido.setDescripcion(rs.getString("Descripcion"));
				pedido.setCompuesto(rs.getString("Compuesto"));
				pedido.setCantidad(rs.getString("Cantidad"));
				pedido.setSe(rs.getString("Estado"));
				EnvioAlm.add(pedido);
				
				
			}
			rs.close();
			estatuto.close();
			conex.desconectar();
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,"Error a consultar" ,"Error",JOptionPane.ERROR_MESSAGE);
		}
		return EnvioAlm;
		
 	}
	public ArrayList<TransferEnvioFabrica> BuscarEnviosFabrica() {
		
		Conexion conex = new Conexion();
		ArrayList<TransferEnvioFabrica> EnvioFab = new ArrayList<TransferEnvioFabrica>();
	
		
		try {
			Statement estatuto = conex.getConnection().createStatement();
			ResultSet rs = estatuto.executeQuery("SELECT * FROM FabricaEnviosPedidos");
			
			while(rs.next()) {
				TransferEnvioFabrica pedido = new TransferEnvioFabrica();
				pedido.setID_Envio(rs.getString("ID_Pedido"));
				pedido.setOrigen(rs.getString("Origen"));
				pedido.setDestinatario(rs.getString("Destino"));
				pedido.setDescripcion(rs.getString("Descripcion"));
				pedido.setCompuesto(rs.getString("Compuesto"));
				pedido.setCantidad((rs.getString("Cantidad")));
				pedido.setSe(rs.getString("Estado"));
				EnvioFab.add(pedido);
				
			}
			rs.close();
			estatuto.close();
			conex.desconectar();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,"Error a consultar" ,"Error",JOptionPane.ERROR_MESSAGE);
		}
		return EnvioFab;
		
	}
	public ArrayList<TransferEnvioLaboratorio> BuscarEnviosLab() {
		
		Conexion conex = new Conexion();
		ArrayList<TransferEnvioLaboratorio> EnvioLabo = new ArrayList<TransferEnvioLaboratorio>();
		
		
		try {
			Statement estatuto = conex.getConnection().createStatement();
			ResultSet rs = estatuto.executeQuery("SELECT * FROM LaboratorioEnviosPedidos");
			
			while(rs.next()) {
				TransferEnvioLaboratorio pedido = new TransferEnvioLaboratorio();
				pedido.setID_Envio(rs.getString("ID_Pedido"));
				pedido.setOrigen(rs.getString("Origen"));
				pedido.setDestinatario(rs.getString("Destino"));
				pedido.setDescripcion(rs.getString("Descripcion"));
				pedido.setCompuesto(rs.getString("Compuesto"));
				pedido.setCantidad((rs.getString("Cantidad")));
				pedido.setSe(rs.getString("Estado"));
				EnvioLabo.add(pedido);
				
			}
			rs.close();
			estatuto.close();
			conex.desconectar();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,"Error a consultar" ,"Error",JOptionPane.ERROR_MESSAGE);
		}
		return EnvioLabo;
		
	}
	public ArrayList<TransferEnvioMedico> BuscarEnviosMedico() {
		
		Conexion conex = new Conexion();
		ArrayList<TransferEnvioMedico> EnvioMed = new ArrayList<TransferEnvioMedico>();
	
		
		try {
			Statement estatuto = conex.getConnection().createStatement();
			ResultSet rs = estatuto.executeQuery("SELECT * FROM MedicosEnviosPedidos");
			
			while(rs.next()) {
				TransferEnvioMedico pedido = new TransferEnvioMedico();
				pedido.setID_Envio(rs.getString("ID_Pedido"));
				pedido.setOrigen(rs.getString("Origen"));
				pedido.setDestinatario(rs.getString("Destino"));
				pedido.setDescripcion(rs.getString("Descripcion"));
				pedido.setCompuesto(rs.getString("Compuesto"));
				pedido.setCantidad((rs.getString("Cantidad")));
				pedido.setSe(rs.getString("Estado"));
				EnvioMed.add(pedido);
				
			}
			rs.close();
			estatuto.close();
			conex.desconectar();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,"Error a consultar" ,"Error",JOptionPane.ERROR_MESSAGE);
		}
		return EnvioMed;
	}
	public List<TransferEnvioFabrica> getEnvioFa() {
		return EnvioFa;
	}

	public void setEnvioFa(List<TransferEnvioFabrica> envioFa) {
		EnvioFa = envioFa;
	}

	@Override
	public void addObserver(DaoObservable o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(DaoObservable o) {
		// TODO Auto-generated method stub
		
	}
	public ArrayList<TransferEnvioPendiente> BuscarPedidoPendiente() {
	

		Conexion conex = new Conexion();
		ArrayList<TransferEnvioPendiente> Enviopen = new ArrayList<TransferEnvioPendiente>();
	
		
		try {
			Statement estatuto = conex.getConnection().createStatement();
			ResultSet rs = estatuto.executeQuery("SELECT * FROM listadopendiente");
			
			while(rs.next()) {
				TransferEnvioPendiente pedido = new TransferEnvioPendiente();
				pedido.setID_Envio(rs.getString("id_envio"));
				pedido.setOrigen(rs.getString("Origen"));
				pedido.setDestinatario(rs.getString("Destino"));
				pedido.setDescripcion(rs.getString("Descripcion"));
				pedido.setCompuesto(rs.getString("Compuesto"));
				pedido.setCantidad((rs.getString("Cantidad")));
				pedido.setSe(rs.getString("Estado_Pedido"));
				Enviopen.add(pedido);
				
			}
			rs.close();
			estatuto.close();
			conex.desconectar();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,"Error a consultar" ,"Error",JOptionPane.ERROR_MESSAGE);
		}
		return Enviopen;
	}
	
	public ArrayList<TransferEnvioEliminado> buscarpedidosrechazados(){
		Conexion conex = new Conexion();
		ArrayList<TransferEnvioEliminado> Enviorechazado = new ArrayList<TransferEnvioEliminado>();
	
		
		try {
			Statement estatuto = conex.getConnection().createStatement();
			ResultSet rs = estatuto.executeQuery("SELECT * FROM listadorechazado");
			
			while(rs.next()) {
				TransferEnvioEliminado pedido = new TransferEnvioEliminado();
				pedido.setID_Envio(rs.getString("id_envio"));
				pedido.setOrigen(rs.getString("Origen"));
				pedido.setDestinatario(rs.getString("Destino"));
				pedido.setDescripcion(rs.getString("Descripcion"));
				pedido.setCompuesto(rs.getString("Compuesto"));
				pedido.setCantidad((rs.getString("Cantidad")));
				pedido.setSe(rs.getString("Estado_Pedido"));
				Enviorechazado.add(pedido);
				
			}
			rs.close();
			estatuto.close();
			conex.desconectar();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,"Error a consultar" ,"Error",JOptionPane.ERROR_MESSAGE);
		}
		return Enviorechazado;
		
	}
	
	public void EliminarEnvioAlmacen(TransferEnvioAlmacen pedido) {
		
		Conexion conex= new Conexion();
		try{
			
			String query ="DELETE FROM AlmacenEnviosPedidos WHERE ID_Pedido=?";
			PreparedStatement statement = conex.getConnection().prepareStatement(query);
			
			statement.setString(1, pedido.getID_Envio());
			statement.executeUpdate();
			
			
          JOptionPane.showMessageDialog(null, " Se ha eliminado Correctamente ","Confirmaci�n",JOptionPane.INFORMATION_MESSAGE);
         

        }catch(SQLException	 o){

            System.out.println(o);
            JOptionPane.showMessageDialog(null, "Error al eliminar","Error",JOptionPane.ERROR_MESSAGE);

        }
	}
	public void EliminarEnvioFabrica(TransferEnvioFabrica pedido) {
		Conexion conex= new Conexion();
		try{
			
			String query ="DELETE FROM FabricaEnviosPedidos WHERE ID_Pedido=?";
			PreparedStatement statement = conex.getConnection().prepareStatement(query);
			
			statement.setString(1, pedido.getID_Envio());
			statement.executeUpdate();
			
			
          JOptionPane.showMessageDialog(null, " Se ha eliminado Correctamente ","Confirmaci�n",JOptionPane.INFORMATION_MESSAGE);
         

        }catch(SQLException	 o){

            System.out.println(o);
            JOptionPane.showMessageDialog(null, "Error al eliminar","Error",JOptionPane.ERROR_MESSAGE);

        }
		
	}
	public void EliminarEnvioLaborat(TransferEnvioLaboratorio pedido) {
		Conexion conex= new Conexion();
		try{
			
			String query ="DELETE FROM LaboratorioEnviosPedidos WHERE ID_Pedido=?";
			PreparedStatement statement = conex.getConnection().prepareStatement(query);
			
			statement.setString(1, pedido.getID_Envio());
			statement.executeUpdate();
			
			
          JOptionPane.showMessageDialog(null, " Se ha eliminado Correctamente ","Confirmaci�n",JOptionPane.INFORMATION_MESSAGE);
         

        }catch(SQLException	 o){

            System.out.println(o);
            JOptionPane.showMessageDialog(null, "Error al eliminar","Error",JOptionPane.ERROR_MESSAGE);

        }
		
	}
	public void EliminarEnvioMedic(TransferEnvioMedico pedido) {
		Conexion conex= new Conexion();
		try{
			
			String query ="DELETE FROM MedicosEnviosPedidos WHERE ID_Pedido=?";
			PreparedStatement statement = conex.getConnection().prepareStatement(query);
			
			statement.setString(1, pedido.getID_Envio());
			statement.executeUpdate();
			
			
          JOptionPane.showMessageDialog(null, " Se ha eliminado Correctamente ","Confirmaci�n",JOptionPane.INFORMATION_MESSAGE);
         

        }catch(SQLException	 o){

            System.out.println(o);
            JOptionPane.showMessageDialog(null, "Error al eliminar","Error",JOptionPane.ERROR_MESSAGE);

        }
		
	}
	
	public void ModificarEnvioAlmacen(TransferEnvioAlmacen pedido){
		
		Conexion conex= new Conexion();
		try{
			
			String query="UPDATE AlmacenEnviosPedidos SET ID_Pedido= ? ,Origen = ? , Destino =? , Descripcion =? , Compuesto = ?, Cantidad = ?, Estado=? WHERE ID_Pedido=?";
			PreparedStatement statement = conex.getConnection().prepareStatement(query);
			
            statement.setString(1, pedido.getID_Envio());
            statement.setString(2, pedido.getOrigen());
            statement.setString(3, pedido.getDestinatario());
            statement.setString(4, pedido.getDescripcion());
            statement.setString(5, pedido.getCompuesto());
            statement.setString(6, pedido.getCantidad());
            statement.setString(7, pedido.getSe());
            statement.setString(8, pedido.getID_Envio());
            statement.executeUpdate();
            
          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmaci�n",JOptionPane.INFORMATION_MESSAGE);
         

        }catch(SQLException	 o){

            System.out.println(o);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);

        }
	}
	public void ModificarEnvioFabrica(TransferEnvioFabrica pedido) {
		
		Conexion conex= new Conexion();
		try{
			
			String query="UPDATE FabricaEnviosPedidos SET ID_Pedido= ? ,Origen = ? , Destino =? , Descripcion =? , Compuesto = ?, Cantidad = ?, Estado=? WHERE ID_Pedido=?";
			PreparedStatement statement = conex.getConnection().prepareStatement(query);
			
			statement.setString(1, pedido.getID_Envio());
            statement.setString(2, pedido.getOrigen());
            statement.setString(3, pedido.getDestinatario());
            statement.setString(4, pedido.getDescripcion());
            statement.setString(5, pedido.getCompuesto());
            statement.setString(6, pedido.getCantidad());
            statement.setString(7, pedido.getSe());
            statement.setString(8, pedido.getID_Envio());
            statement.executeUpdate();

          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmacion",JOptionPane.INFORMATION_MESSAGE);
         

        }catch(SQLException	 o){

            System.out.println(o);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);

        }
		
	}
	public void ModificarEnvioMedico(TransferEnvioMedico pedido) {
		
		Conexion conex= new Conexion();
		try{
			
			String query="UPDATE MedicosEnviosPedidos SET ID_Pedido= ? ,Origen = ? , Destino =? , Descripcion =? , Compuesto = ?, Cantidad = ?, Estado=? WHERE ID_Pedido=? ";
			PreparedStatement statement = conex.getConnection().prepareStatement(query);
			
			statement.setString(1, pedido.getID_Envio());
            statement.setString(2, pedido.getOrigen());
            statement.setString(3, pedido.getDestinatario());
            statement.setString(4, pedido.getDescripcion());
            statement.setString(5, pedido.getCompuesto());
            statement.setString(6, pedido.getCantidad());
            statement.setString(7, pedido.getSe());
            statement.setString(8, pedido.getID_Envio());
            statement.executeUpdate();

          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmaci�n",JOptionPane.INFORMATION_MESSAGE);
         

        }catch(SQLException	 o){

            System.out.println(o);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);

        }
		
	}
	public void ModificarEnvioLaboratorio(TransferEnvioLaboratorio pedido) {
		
		Conexion conex= new Conexion();
		try{
			
			String query="UPDATE LaboratorioEnviosPedidos SET ID_Pedido= ? ,Origen = ? , Destino =? , Descripcion =? , Compuesto = ?, Cantidad = ?, Estado=? WHERE ID_Pedido= ?";
			PreparedStatement statement = conex.getConnection().prepareStatement(query);
			
			statement.setString(1, pedido.getID_Envio());
            statement.setString(2, pedido.getOrigen());
            statement.setString(3, pedido.getDestinatario());
            statement.setString(4, pedido.getDescripcion());
            statement.setString(5, pedido.getCompuesto());
            statement.setString(6, pedido.getCantidad());
            statement.setString(7, pedido.getSe());
            statement.setString(8, pedido.getID_Envio());
            statement.executeUpdate();

          JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ","Confirmaci�n",JOptionPane.INFORMATION_MESSAGE);
         

        }catch(SQLException	 o){

            System.out.println(o);
            JOptionPane.showMessageDialog(null, "Error al Modificar","Error",JOptionPane.ERROR_MESSAGE);

        }
		
	}
	
	
	

	
		
	}
