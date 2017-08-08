package services;

public class ServiceFactory {

	private static ServiceFactory instance;

	private ServiceFactory() {

	}

	public static ServiceFactory getInstance() {
		if (instance == null) {
			instance = new ServiceFactory();
		}
		return instance;
	}
	
	public UsuarioService getUsuarioService(){
	
		UsuarioService service = new UsuarioService();
		return service;
	}
	
	public PerfilService getPerfilService(){
		PerfilService service = new PerfilService();
		return service;
	}
	
	

}
