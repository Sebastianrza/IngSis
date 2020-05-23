package GestionDeEnvios.GDE.Integracion;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.json.*;



import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.sun.xml.internal.bind.api.TypeReference;

import GestionDeEnvios.GDE.Negocio.StatusEnvio;
import GestionDeEnvios.GDE.Negocio.TransferEnvioAlmacen;
import GestionDeEnvios.GDE.Negocio.TransferEnvioFabrica;
import GestionDeEnvios.GDE.Negocio.TransferEnvioLaboratorio;
import GestionDeEnvios.GDE.Negocio.TransferEnvioMedico;

public class DaoEnvios {
	protected String _file;
	protected String _outfile;
	//protected OutputStream out;
	protected InputStream isr;
	protected String type;
	protected String id;
	protected String usuario;
	protected String nombre;
	protected String producto;
	protected int cantidad;
	protected StatusEnvio estado;
	
	public boolean addPedidoFabrica(TransferEnvioFabrica pedido) throws FileNotFoundException{

		FileReader _inFile = new FileReader("src/BD/BD-Fabrica-Envios.json");
		if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				String id = ja.getJSONObject(i).getString("id");
				String tp = ja.getJSONObject(i).getString("producto");
				
				System.out.println(id +"\t"+ tp);
				
				
				}
				}
				
			}
	
	public void addPedidoAlmacen(TransferEnvioAlmacen pedido) {
		String fichero ="";
		
		Gson gson = new Gson();
		try (BufferedReader br = new BufferedReader(new FileReader("src/BD/BD-Fabrica-Envios.json"))) {
    	    String linea;
    	    while ((linea = br.readLine()) != null) {
    	        fichero += linea;
    	        
    	    }
    	} catch (FileNotFoundException ex) {
    	    System.out.println(ex.getMessage());
    	} catch (IOException ex) {
    	    System.out.println(ex.getMessage());
    	}
		
    	
		Properties properties = gson.fromJson(fichero, Properties.class);
		properties.get("id");
		properties.get("produco");
		properties.get("compuesto");
		properties.get("cantidad");
		properties.get("estado");
		
		try {
		       JsonWriter writer = new JsonWriter(new FileWriter("src/BD/BD-Envios-Fabrica.json"));
		       writer.beginObject();
		       writer.name("data");
		       writer.beginArray();
		     // for (int i = 0; i<=br.readline;i++) {
		           writer.beginObject();
		           writer.name("id").value((String) properties.get("id"));
		           System.out.println();
		           writer.name("producto").value((String) properties.get("producto"));
		           System.out.println();
		           writer.name("compuesto").value((String) properties.get("compuesto"));
		           System.out.println();
		           writer.name("cantidad").value((String) properties.get("cantidad"));
		           System.out.println();
		           writer.name("estado").value((String) properties.get("estado"));
		           System.out.println();
		           writer.endObject();
		      //}
		       writer.endArray();
		       writer.endObject();
		       writer.close();
		} catch (IOException e) {
		       e.printStackTrace();
		}
		
		//return ID_pedido_fabrica.put("id", (String) properties.get("id"));
		
	}
	
	public void addPedidoMedico(TransferEnvioMedico pedido) {
		FileReader _inFile = new FileReader("src/BD/BD-Fabrica-Envios.json");
	
		if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				String id = ja.getJSONObject(i).getString("id");
				String tp = ja.getJSONObject(i).getString("producto");
				
				System.out.println(id +"\t"+ tp);
				
				
				}
				}
				
		}
	
	
	public void addPedidoLaboratorio(TransferEnvioLaboratorio pedido) throws IOException {
		FileReader _inFile = new FileReader("src/BD/BD-Fabrica-Envios.json");
		
		if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				String id = ja.getJSONObject(i).getString("id");
				String tp = ja.getJSONObject(i).getString("producto");
				
				System.out.println(id +"\t"+ tp);
				
				
				}
			}
				
		}
	}