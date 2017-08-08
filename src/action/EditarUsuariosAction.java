package action;

import dao.DAOException;
import entity.Perfil;
import entity.Usuario;
import services.PerfilService;
import services.ServiceException;
import services.UsuarioService;

public class EditarUsuariosAction extends Action {

	@Override
	public void process() throws Exception {
		
		
		try {
			//requerimento para saber qual usuarios vai ser editado 
			int id =  Integer.parseInt((String) getRequest().getAttribute("id"));
			UsuarioService usuarioService = serviceFactory.getUsuarioService();
			Usuario usuario = usuarioService.LoadUsuarios(id);
			getRequest().setAttribute("usuario", usuario);
			//requerimentos de informaçoes do usuario
			 String nome = (String) getRequest().getParameter("nome") ;
			 String email = (String) getRequest().getParameter("email");
			 String sexo = (String) getRequest().getParameter("sexo");
			 Integer cpf = Integer.parseInt((String)getRequest().getParameter("cpf"));
			 String usuarioModificado = (String) getRequest().getParameter("usuario");
			 String senha = (String) getRequest().getAttribute("senha");
			 PerfilService perfilService = serviceFactory.getPerfilService();
			 Perfil perfil = perfilService.getPerfil((String) getRequest().getParameter("perfil"));
			 perfil.getDescricao().toUpperCase();
			//ediçao do Usuarios ao banco
			 usuario.setCpf(cpf);
			 usuario.setEmail(email);
			 usuario.setNome(nome);
			 if (perfil.getId() != null) {
				 usuario.setPerfil(perfil);
			} 
			 usuario.setSenha(senha);
			 usuario.setSexo(sexo);
			 usuario.setUsuario(usuarioModificado);
			 usuarioService.EditarUsuario(usuario);	  
			 
			 forward("lista_usuario.jsp");
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		 
		

	}

}
