package services;

import entity.Perfil;

public class PerfilService extends Service {
	
	
	
	public Perfil getPerfil(String perfilString){
			Perfil perfil = new Perfil(); 
			if (perfilString.toUpperCase() == "ADMISTRADO") {
				perfil.setDescricao(perfilString.toUpperCase());
				perfil.setId(1);
			} else if (perfilString.toUpperCase() == "UTILIZADOR") {
				perfil.setDescricao(perfilString.toUpperCase());
				perfil.setId(2);
			} 	
			return perfil;
	}
		
		
		
		
	
	
	
	
	
	
	

}
