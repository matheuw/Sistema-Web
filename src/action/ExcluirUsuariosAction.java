package action;

import services.UsuarioService;

public class ExcluirUsuariosAction extends Action{

	@Override
	public void process() throws Exception {
		
		int id =  Integer.parseInt(getRequest().getParameter("id"));
		UsuarioService usuarioService = serviceFactory.getUsuarioService();
		usuarioService.Deleta(id);
		
		
	}

}
