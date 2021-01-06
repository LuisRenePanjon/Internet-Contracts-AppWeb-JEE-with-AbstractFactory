package jpa;

import dao.DireccionInstalacionDAO;
import modelo.DireccionInstalacion;

public class JPADireccionInstalacionDAO extends JPAGenericDAO<DireccionInstalacion, Integer> implements DireccionInstalacionDAO{
	
	public JPADireccionInstalacionDAO(){
		super(DireccionInstalacion.class);
	}

		
}
