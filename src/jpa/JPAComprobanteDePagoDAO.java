package jpa;

import dao.ComprobanteDePagoDAO;
import modelo.ComprobanteDePago;

public class JPAComprobanteDePagoDAO extends JPAGenericDAO<ComprobanteDePago, Integer> implements ComprobanteDePagoDAO{

	public JPAComprobanteDePagoDAO() {
		super(ComprobanteDePago.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
