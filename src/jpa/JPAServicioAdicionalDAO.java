package jpa;

import dao.ServicioAdicionalDAO;
import modelo.ServicioAdicional;

public class JPAServicioAdicionalDAO extends JPAGenericDAO<ServicioAdicional, Integer> implements ServicioAdicionalDAO{

	public JPAServicioAdicionalDAO() {
		super(ServicioAdicional.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
