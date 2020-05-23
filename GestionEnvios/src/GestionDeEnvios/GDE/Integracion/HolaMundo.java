package GestionDeEnvios.GDE.Integracion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import GestionDeEnvios.GDE.Negocio.TransferEnvioFabrica;

public class HolaMundo
{
    public static void main(String[] args) throws FileNotFoundException 
    {
    	FileReader _inFile = new FileReader("src/BD/BD-Fabrica-Envios.json");
		TransferEnvioFabrica pedido = new TransferEnvioFabrica();
		if (_inFile != null) {
			
			JSONObject jo = new JSONObject(new JSONTokener(_inFile));
			
			JSONArray ja = jo.getJSONArray("array");
			
			for (int i = 0; i < ja.length(); i++) {
				String id = ja.getJSONObject(i).getString("id");
				String tp = ja.getJSONObject(i).getString("producto");
				
				System.out.println(id +"\t"+ tp);
				
				
				}
				}
				
			}}
    
