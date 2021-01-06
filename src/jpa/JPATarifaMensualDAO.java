package jpa;

import dao.TarifaMensualDAO;
import modelo.TarifaMensual;

public class JPATarifaMensualDAO extends JPAGenericDAO<TarifaMensual, Integer> implements TarifaMensualDAO {

	public JPATarifaMensualDAO() {
		super(TarifaMensual.class);
		// TODO Auto-generated constructor stub
	}
	
	

}
