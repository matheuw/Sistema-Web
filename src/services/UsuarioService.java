package services;

import java.util.List;

import dao.DAOException;
import dao.UsuarioDAO;
import entity.Usuario;

public class UsuarioService  extends Service{

	
	public Usuario LoadUsuarios(int id) throws ServiceException{
		
		try {
			UsuarioDAO usuarioDAO = daoFactory.getUsuarioDAO();
			Usuario usuario = usuarioDAO.load(id);
			return usuario;
		} catch (DAOException e) {	
			throw new ServiceException(e);
	}
		
	}
	
	public void EditarUsuario(Usuario usuario) throws ServiceException{
		try {
			UsuarioDAO usuarioDAO = daoFactory.getUsuarioDAO();
			usuarioDAO.EditarUsuario(usuario);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
	}
	
	
	
	public void Deleta(int id) throws ServiceException{
		
		try {
			UsuarioDAO usuarioDAO = daoFactory.getUsuarioDAO();
			Usuario usuario = usuarioDAO.load(id);
			usuarioDAO.delete(usuario);
			
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
	}
	
	
	public void save(Usuario usuario){
		save(usuario);
	}
	
	public Usuario getId(String nome) throws DAOException, ServiceException{
		try {
			System.out.println("Usuario service");
			UsuarioDAO usuarioDAO = daoFactory.getUsuarioDAO();
			Usuario usuario = usuarioDAO.getid(nome);
			return (Usuario) usuario;
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		
	}
	
	
	public List<Usuario> ListaUsuarios() throws ServiceException{
		
		try {
			UsuarioDAO usuarioDAO = daoFactory.getUsuarioDAO();
			List<Usuario> usuarios = usuarioDAO.getUsuarios();
			return usuarios;
			
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
	}
	
	
	
	
	
	
}
