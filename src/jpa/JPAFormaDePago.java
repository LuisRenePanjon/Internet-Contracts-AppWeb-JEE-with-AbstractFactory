package jpa;

import dao.FormaDePagoDAO;
import modelo.FormaDePago;

public class JPAFormaDePago extends JPAGenericDAO<FormaDePago, Integer> implements FormaDePagoDAO{

	public JPAFormaDePago() {
		super(FormaDePago.class);
		// TODO Auto-generated constructor stub
	}
	

}
