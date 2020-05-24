package GestionDeEnvios.GDE.Integracion;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.json.*;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;

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
				
				TransferEnvioFabrica p = new TransferEnvioFabrica(); 
				p.setID_Envio( ja.getJSONObject(i).getString("id"));
				p.setProducto( ja.getJSONObject(i).getString("producto"));
				p.setCompuesto(ja.getJSONObject(i).getString("compuesto"));
				p.setOrigen(ja.getJSONObject(i).getString("origen"));
				p.setDestinatario(ja.getJSONObject(i).getString("destinatario"));
				p.setSe(ja.getJSONObject(i).getString("estado"));
				p.setCantidad(ja.getJSONObject(i).getInt("cantidad"));
				EnvioFa.add(p);
			}
		/*	for(int i=0; i<EnvioFa.size(); i++) {
				System.out.println(EnvioFa.get(i).getID_Envio());
			}*/
				}
		return EnvioFa;
				
			}
	
	public List<TransferEnvioAlmacen> addPedidoAlmacen(TransferEnvioAlmacen pedido) throws FileNotFoundException {
		FileReader _inFile = new FileReader("src/BD/BD-Almacen-Envios.json");
		
if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				
				TransferEnvioAlmacen p = new TransferEnvioAlmacen(); 
				p.setID_Envio( ja.getJSONObject(i).getString("id"));
				p.setProducto( ja.getJSONObject(i).getString("producto"));
				p.setCompuesto(ja.getJSONObject(i).getString("compuesto"));
				p.setOrigen(ja.getJSONObject(i).getString("origen"));
				p.setDestinatario(ja.getJSONObject(i).getString("destinatario"));
				p.setSe(ja.getJSONObject(i).getString("estado"));
				p.setCantidad(ja.getJSONObject(i).getInt("cantidad"));
				EnvioAl.add(p);
			}
		/*	for(int i=0; i<EnvioFa.size(); i++) {
				System.out.println(EnvioFa.get(i).getID_Envio());
			}*/
				}
		return EnvioAl;
		
	}
	
	public List<TransferEnvioMedico> addPedidoMedico(TransferEnvioMedico pedido) throws FileNotFoundException {
		FileReader _inFile = new FileReader("src/BD/BD-Medico-Envios.json");
	
		if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				
				TransferEnvioMedico p = new TransferEnvioMedico(); 
				p.setID_Envio( ja.getJSONObject(i).getString("id"));
				p.setProducto( ja.getJSONObject(i).getString("producto"));
				p.setCompuesto(ja.getJSONObject(i).getString("compuesto"));
				p.setOrigen(ja.getJSONObject(i).getString("origen"));
				p.setDestinatario(ja.getJSONObject(i).getString("destinatario"));
				p.setSe(ja.getJSONObject(i).getString("estado"));
				p.setCantidad(ja.getJSONObject(i).getInt("cantidad"));
				EnvioMe.add(p);
			}
		/*	for(int i=0; i<EnvioFa.size(); i++) {
				System.out.println(EnvioFa.get(i).getID_Envio());
			}*/
				}
		return EnvioMe;
		}
	
	
	public List<TransferEnvioLaboratorio> addPedidoLaboratorio(TransferEnvioLaboratorio pedido) throws IOException {
		FileReader _inFile = new FileReader("src/BD/BD-Lab-Envios.json");
		if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				
				TransferEnvioLaboratorio p = new TransferEnvioLaboratorio(); 
				p.setID_Envio( ja.getJSONObject(i).getString("id"));
				p.setProducto( ja.getJSONObject(i).getString("producto"));
				p.setCompuesto(ja.getJSONObject(i).getString("compuesto"));
				p.setOrigen(ja.getJSONObject(i).getString("origen"));
				p.setDestinatario(ja.getJSONObject(i).getString("destinatario"));
				p.setSe(ja.getJSONObject(i).getString("estado"));
				p.setCantidad(ja.getJSONObject(i).getInt("cantidad"));
				EnvioLab.add(p);
			}
		/*	for(int i=0; i<EnvioFa.size(); i++) {
				System.out.println(EnvioFa.get(i).getID_Envio());
			}*/
				}
		return EnvioLab;
				
		}
	
	public List<TransferEnvioPendiente> addPedidoPendiente(TransferEnvioPendiente pedido) throws FileNotFoundException{
		
		FileReader _inFile = new FileReader("src/BD/BD-Envios-Pendientes.json");
		if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				
				TransferEnvioPendiente p = new TransferEnvioPendiente(); 
				p.setID_Envio( ja.getJSONObject(i).getString("id"));
				p.setProducto( ja.getJSONObject(i).getString("producto"));
				p.setCompuesto(ja.getJSONObject(i).getString("compuesto"));
				p.setOrigen(ja.getJSONObject(i).getString("origen"));
				p.setDestinatario(ja.getJSONObject(i).getString("destinatario"));
				p.setSe(ja.getJSONObject(i).getString("estado"));
				p.setCantidad(ja.getJSONObject(i).getInt("cantidad"));
				EnvioPen.add(p);
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
				
				TransferEnvioEliminado p = new TransferEnvioEliminado(); 
				p.setID_Envio( ja.getJSONObject(i).getString("id"));
				p.setProducto( ja.getJSONObject(i).getString("producto"));
				p.setCompuesto(ja.getJSONObject(i).getString("compuesto"));
				p.setOrigen(ja.getJSONObject(i).getString("origen"));
				p.setDestinatario(ja.getJSONObject(i).getString("destinatario"));
				p.setSe(ja.getJSONObject(i).getString("estado"));
				p.setCantidad(ja.getJSONObject(i).getInt("cantidad"));
				EnvioEl.add(p);
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
		           writer.name("id").value((String) ja.getJSONObject(i).getString("id"));
		           System.out.println();
		           writer.name("producto").value((String) ja.getJSONObject(i).getString("producto"));
		           System.out.println();
		           writer.name("compuesto").value((String) ja.getJSONObject(i).getString("compuesto"));
		           System.out.println(); 
		           writer.name("origen").value((String) ja.getJSONObject(i).getString("origen"));
		           System.out.println();
		           writer.name("destinatario").value((String) ja.getJSONObject(i).getString("destinatario"));
		           System.out.println();
		           writer.name("estado").value((String) ja.getJSONObject(i).getString("estado"));
		           System.out.println();
		           writer.name("cantidad").value(ja.getJSONObject(i).getInt("cantidad"));
		           System.out.println();
		           writer.endObject();
		      
		       writer.endArray();
		       writer.endObject();
		       writer.close();
	}}
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
}