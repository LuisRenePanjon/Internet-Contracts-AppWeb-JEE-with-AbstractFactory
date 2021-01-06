package jpa;

import java.util.List;

import javax.persistence.Query;

import dao.AsesorDAO;
import modelo.Asesor;

public class JPAAsesorDAO extends JPAGenericDAO<Asesor, Integer> implements AsesorDAO{

	public JPAAsesorDAO() {
		super(Asesor.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Asesor readByCorreo(String correo) {
		// TODO Auto-generated method stub
		Query query = em.createNamedQuery("getByCorreo");
		query.setParameter("correo", correo);
		List result = query.getResultList();
		Asesor respuesta = null;
		if(!result.isEmpty()){
			respuesta = (Asesor) result.get(0);
		}
		return respuesta;
	}
	
	

}
