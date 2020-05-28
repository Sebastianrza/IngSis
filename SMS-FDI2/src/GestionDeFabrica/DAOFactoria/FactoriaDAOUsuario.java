package GestionDeFabrica.DAOFactoria;

import GestionDeFabrica.DAO.UsuarioDAO;

public abstract class FactoriaDAOUsuario {

private static FactoriaDAOUsuario factoria;
	
	public static FactoriaDAOUsuario dameInstancia() {
		
		if (factoria == null) {
			
			factoria = new FactoriaDAOUsuarioImp();
		}
		
		return factoria;
	}
	
	public abstract UsuarioDAO generaObjetoUsuarioDAO();
}

