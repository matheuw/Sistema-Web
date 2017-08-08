package action;

import java.util.List;

import entity.Usuario;
import services.UsuarioService;

public class ListaUsuarioAction extends Action {
	
	@Override
	public void process() throws Exception {
		
		UsuarioService usuarioService = serviceFactory.getUsuarioService();
		List<Usuario> usuarios = usuarioService.ListaUsuarios();
		getRequest().setAttribute("usuario", usuarios);
		forward("list_usuario.jsp");
		

	}

}
