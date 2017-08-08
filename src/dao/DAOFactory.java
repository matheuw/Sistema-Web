package dao;

public class DAOFactory {

	private static DAOFactory instance;

	private DAOFactory() {
	}

	public static DAOFactory getInstance() {
		if (instance == null) {
			instance = new DAOFactory();
		}

		return instance;
	}
	
	public UsuarioDAO getUsuarioDAO(){
		UsuarioDAO dao =  new UsuarioDAO();
		return dao;
	}
	
	public PerfilDAO getPerfilDAO(){
		PerfilDAO dao = new PerfilDAO();
		return dao;
	}

}
