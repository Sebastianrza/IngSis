package GestionDeEnvios.GDE.Integracion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import GestionDeEnvios.GDE.Negocio.TransferEnvioAlmacen;
import GestionDeEnvios.GDE.Negocio.TransferEnvioFabrica;
import GestionDeEnvios.GDE.Negocio.TransferEnvioLaboratorio;
import GestionDeEnvios.GDE.Negocio.TransferEnvioMedico;

public class DaoEnvios {
	
	public void addPedidoFabrica(TransferEnvioFabrica pedido) {
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
	
	public void addPedidoLaboratorio(TransferEnvioLaboratorio pedido) {
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
	
}
