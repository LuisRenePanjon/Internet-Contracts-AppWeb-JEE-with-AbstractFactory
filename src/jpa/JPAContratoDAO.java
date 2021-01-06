package jpa;

import dao.ContratoDAO;
import modelo.Contrato;

public class JPAContratoDAO extends JPAGenericDAO<Contrato, Integer> implements ContratoDAO{

	public JPAContratoDAO() {
		super(Contrato.class);
		// TODO Auto-generated constructor stub
	}
	

}
