package jpa;

import dao.RedDeAccesoDAO;
import modelo.RedDeAcceso;

public class JPARedDeAccesoDAO extends JPAGenericDAO<RedDeAcceso, Integer> implements RedDeAccesoDAO{

	public JPARedDeAccesoDAO() {
		super(RedDeAcceso.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
