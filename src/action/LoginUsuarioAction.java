package action;

import javax.servlet.http.HttpSession;

import entity.Usuario;
import services.UsuarioService;

public class LoginUsuarioAction extends Action {
	
		

	@Override
	public void process() throws Exception { 
		
					 
					String usuario = (String) getRequest().getParameter("usuario");
					String senha = (String) getRequest().getParameter("senha");
					UsuarioService usuarioService = serviceFactory.getUsuarioService();
					Usuario login = (Usuario) usuarioService.getId(usuario);	
					if (usuario.equals(login.getUsuario()) && senha.equals(login.getSenha()) ) {
						if (login.getPerfil().getDescricao().equals("Administrador")) {
							System.out.println("ADM");
							redirect("ListarUsuario.action");
							
							 
						} else if (login.getPerfil().getDescricao().equals("Utilizador")) {
							getRequest().setAttribute("usuario", login);
							System.out.println("Utilizador");
							redirect("perfil.jsp");
						}
					}
					HttpSession session = getSession();	
					session.setAttribute("usuario", session);
						
				
			
		
	}

}
