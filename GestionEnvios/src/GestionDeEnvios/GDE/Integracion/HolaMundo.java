package GestionDeEnvios.GDE.Integracion;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import GestionDeEnvios.GDE.Negocio.TransferEnvioAlmacen;
import GestionDeEnvios.GDE.Negocio.TransferEnvioFabrica;


public class HolaMundo
{
    public static void main(String[] args) throws FileNotFoundException 
    {
    	DaoEnvios tp = new DaoEnvios();
    	TransferEnvioAlmacen pedidoA= new TransferEnvioAlmacen();
    	TransferEnvioFabrica pedidoF= new TransferEnvioFabrica();
    	List<TransferEnvioFabrica> lista = new ArrayList<TransferEnvioFabrica>();
    	lista = tp.addPedidoFabrica(pedidoF);
    	
    	for(int i=0; i<lista.size(); i++) {
    		System.out.println(lista.get(i).getID_Envio());
    	}
    	
	}
}
    
