package jpa;

import dao.ServicioDAO;
import modelo.Servicio;

public class JPAServicioDAO extends JPAGenericDAO<Servicio, Integer> implements ServicioDAO{

	public JPAServicioDAO() {
		super(Servicio.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
