package dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.HibernateException;

import entity.Perfil;
import entity.Usuario;

public class UsuarioDAO extends DAO<Usuario>{
	private org.hibernate.Session session;
	
		
public UsuarioDAO() {
	super(Usuario.class);
}


	public List<Usuario> getUsuarios() throws DAOException{
		String hql = "FROM Usuario u ORDEM BY u.nome";
		return (List<Usuario>) list(hql);
	}
	
	public void EditarUsuario(Usuario usuario) throws DAOException{			
		try {
			session.update(usuario);
		} catch (HibernateException e) {
			throw new DAOException(e);
		}
		
	}
	
	
	public Usuario getid(String usuario) throws DAOException{
		System.out.println(usuario);
		System.out.println("Checando no banco...");
		String hql = "FROM Usuario as u WHERE u.usuario = '"+usuario+"'";
		System.out.println(hql);
		
		//org.hibernate.query.Query query  = session.createQuery(hql);
		//System.out.println(query);
		//Usuario usuarioLogin = (Usuario) query.getSingleResult();
		return (Usuario) list(hql).get(0);
		
	}
	
	
	
	

}
