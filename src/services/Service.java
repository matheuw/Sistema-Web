package services;

import dao.DAOFactory;

public class Service {
	
	protected DAOFactory daoFactory;
	protected ServiceFactory serviceFactory;
	
	protected Service(){
		this.daoFactory = DAOFactory.getInstance();
		this.serviceFactory = ServiceFactory.getInstance();
	}

}
