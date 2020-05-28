package GestionDeEnvios.GDE.Presentacion;

import java.io.IOException;

import GestionDeEnvios.GDE.Integracion.FactoriaVista;
import GestionDeEnvios.GDE.Integracion.VistasFact;
import GestionDeEnvios.GDE.Negocio.SAEnvios;
import GestionDeEnvios.GDE.Negocio.TransferEnvioAlmacen;
import GestionDeEnvios.GDE.Negocio.TransferEnvioFabrica;
import GestionDeEnvios.GDE.Negocio.TransferEnvioLaboratorio;
import GestionDeEnvios.GDE.Negocio.TransferEnvioMedico;

public class ControladorEnvio {
	
	protected FactoriaVista FV;
	protected VistasFact VF;
	protected SAEnvios sa;
	protected EnvioFrame en = new EnvioFrame();
	protected ListadoEnvios le = new ListadoEnvios();
	protected EliminarEnvioAlmacen ela = new EliminarEnvioAlmacen();
	protected EliminarEnvioMedico elm = new EliminarEnvioMedico();
	protected EliminarEnvioLab ell = new EliminarEnvioLab();
	protected EliminarEnvioFabrica elf = new EliminarEnvioFabrica();
	protected ModificarEnvioAlmacen mea= new ModificarEnvioAlmacen();
	protected ModificarEnvioLab mel= new ModificarEnvioLab();
	protected ModificarEnvioFabrica mef= new ModificarEnvioFabrica();
	protected ModificarEnvioMedico mem= new ModificarEnvioMedico();
	
	
	//Singleton
	public ControladorEnvio() {	
		this.FV = FactoriaVista.getInstance();
		this.VF = VistasFact.getInstance();
		
		if (sa == null) {
			sa = new SAEnvios();
		}

		
	}
	public void Enviofa() {
		en.main();
	}
	
	
	//Metodos del Servicio Aplicación
	//Modificar
		public void ModificarEnvioAl(TransferEnvioAlmacen envio) {
			this.sa.ModificarEnvioAlm(envio);
		}
		public void ModificarEnvioMe(TransferEnvioMedico envio)  {
			this.sa.ModificarEnvioMed(envio);
		}
		public void ModificarEnvioFa(TransferEnvioFabrica envio) {
			this.sa.ModificarEnvioFab(envio);
		}
		public void ModificarEnvioLa(TransferEnvioLaboratorio envio) {
			this.sa.ModificarEnvioLab(envio);
		}
		
		
		//Eliminar
		public void EliminarEnvioAl(TransferEnvioAlmacen envio)  {
			this.sa.EliminarEnvioAlmacen(envio);
		}
		public void EliminarEnvioMe(TransferEnvioMedico envio) {
			this.sa.EliminarEnvioMedico(envio);
		}
		public void EliminarEnvioFa(TransferEnvioFabrica envio) {
			this.sa.EliminarEnvioFabrica(envio);
		}
		public void EliminarEnvioLa(TransferEnvioLaboratorio envio){
			this.sa.EliminarEnvioLaboratorio(envio);
		}
		
		//Instancias Vistas
		
		 public ListadoEnvios getLe() {
				return le;
			}

			public void setLe(ListadoEnvios le) {
				this.le = le;
			}

			public EliminarEnvioAlmacen getEla() {
				return ela;
			}

			public void setEla(EliminarEnvioAlmacen ela) {
				this.ela = ela;
			}

			public EliminarEnvioMedico getElm() {
				return elm;
			}

			public void setElm(EliminarEnvioMedico elm) {
				this.elm = elm;
			}

			public EliminarEnvioLab getEll() {
				return ell;
			}

			public void setEll(EliminarEnvioLab ell) {
				this.ell = ell;
			}

			public EliminarEnvioFabrica getElf() {
				return elf;
			}

			public void setElf(EliminarEnvioFabrica elf) {
				this.elf = elf;
			}

			public ModificarEnvioAlmacen getMea() {
				return mea;
			}

			public void setMea(ModificarEnvioAlmacen mea) {
				this.mea = mea;
			}

			public ModificarEnvioLab getMel() {
				return mel;
			}

			public void setMel(ModificarEnvioLab mel) {
				this.mel = mel;
			}

			public ModificarEnvioFabrica getMef() {
				return mef;
			}

			public void setMef(ModificarEnvioFabrica mef) {
				this.mef = mef;
			}

			public ModificarEnvioMedico getMem() {
				return mem;
			}
			public void setMem(ModificarEnvioMedico mem) {
				this.mem = mem;
			}


			public EnvioFrame getEn() {
				return en;
			}

			public void setEn(EnvioFrame en) {
				this.en = en;
			}
			
			
			
	
}
