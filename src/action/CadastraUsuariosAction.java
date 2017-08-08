package action;

import entity.Perfil;
import entity.Usuario;
import services.PerfilService;
import services.UsuarioService;

public class CadastraUsuariosAction extends Action {

	@Override
	public void process() throws Exception {
		
		 //requerimentos de informaçoes do usuario
		 String nome = (String) getRequest().getParameter("nome");
		 String email = (String) getRequest().getParameter("email");
		 String sexo = (String) getRequest().getParameter("sexo"); 
		 Integer cpf = Integer.parseInt((String)getRequest().getParameter("cpf"));
		 String usuario = (String) getRequest().getParameter("usuario");
		 String senha = (String) getRequest().getParameter("senha");
		 PerfilService perfilService = serviceFactory.getPerfilService();
		 Perfil perfil = perfilService.getPerfil((String) getRequest().getParameter("perfil"));
		 perfil.getDescricao().toUpperCase();
		 //cadastra Usuarios ao banco
		 UsuarioService usuarioService = serviceFactory.getUsuarioService();
		 Usuario usuarioCadastra = new Usuario();
		 usuarioCadastra.setCpf(cpf);
		 usuarioCadastra.setEmail(email);
		 usuarioCadastra.setNome(nome);
		 usuarioCadastra.setPerfil(perfil);
		 usuarioCadastra.setSenha(senha);
		 usuarioCadastra.setSexo(sexo);
		 usuarioCadastra.setUsuario(usuario);
		 usuarioService.EditarUsuario(usuarioCadastra);
		 
		
		

	}

}
